package com.example.soap.tmb.ws;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

import org.slf4j.spi.LocationAwareLogger;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.soap.tmb.writefile.WriteFile;

import tmbscfinbound.irp.ws.payment_service.dto.common.request.CutReturnMessageRequest;
import tmbscfinbound.irp.ws.payment_service.dto.common.request.PaymentServiceRequest;
import tmbscfinbound.irp.ws.payment_service.dto.common.response.CutReturnMessageResponse;
import tmbscfinbound.irp.ws.payment_service.dto.common.response.PaymentServiceResponse;
import tmbscfinbound.irp.ws.payment_service.dto.common.response.ResponseData;
import tmbscfinbound.irp.ws.payment_service.dto.common.response.ResponseMessage;


@Endpoint
public class PaymentServiceEndpoint {
	private static final String NAMESPACE_URI = "http://request.common.dto.payment_service.ws.irp.tmbscfinbound";
	Logger log = Logger.getLogger(PaymentServiceEndpoint.class.getName());

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "cutReturnMessageRequest")
	@ResponsePayload
	public CutReturnMessageResponse cutReturnMessage(@RequestPayload CutReturnMessageRequest request) {
		CutReturnMessageResponse response = new CutReturnMessageResponse();
		log.info("request : "+request.getReturnMsg());
		response.setPaymentServiceReturn("Success");

		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "paymentServiceRequest")
	@ResponsePayload
	public PaymentServiceResponse paymentService(@RequestPayload PaymentServiceRequest request) {
		WriteFile writeFile = new WriteFile();
		log.info("Message Write File : "+writeFile.writeFileTxt(request.getRequestMessage().getRequestData().getHeader()));
		log.info("request : "+request.getRequestMessage().getRequestData().getHeader().getBankCode());
		log.info("test : "+request.getRequestMessage().getRequestData().getHeader().getBankCode());
		PaymentServiceResponse response = new PaymentServiceResponse();
		ResponseMessage responseMessage = new ResponseMessage();
		ResponseData responseData = new ResponseData();
		responseData.setBankCode(request.getRequestMessage().getRequestData().getHeader().getBankCode());
		responseData.setResponseCode("200");
		responseData.setResponseDetail("Success");
		responseData.setSponsorCode(request.getRequestMessage().getRequestData().getHeader().getSponsorCode());
		responseData.setTrackingNumber(request.getRequestMessage().getRequestData().getHeader().getTrackingNumber());
		responseData.setVoucherNumber("0001");
		responseMessage.setResponseData(responseData);
		response.setPaymentServiceReturn(responseMessage);
		log.info("response : "+response.getPaymentServiceReturn().getResponseData().getResponseCode());
		
		return response;
	}
	
	
	
	
}