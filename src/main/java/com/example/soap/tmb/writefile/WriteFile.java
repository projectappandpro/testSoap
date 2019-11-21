package com.example.soap.tmb.writefile;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

import com.example.soap.tmb.ConfigFile;

import tmbscfinbound.irp.ws.payment_service.dto.common.request.Header;

public class WriteFile {
	Logger log = Logger.getLogger(WriteFile.class.getName());
	private String PATH_WRITEFILE = ConfigFile.PATH_WRITEFILE;
	
	public String writeFileTxt(Header header) {
		String msg = null;
		Path path = Paths.get(PATH_WRITEFILE);
		log.info("path : "+path.toString());
		try(BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"))){
			writer.write(header.getBankCode()+
					header.getCustomerCode()+
					header.getPaymentAmt()+
					header.getPaymentAmtFlag()+
					header.getPaymentDate()+
					header.getPaymentDetail()+
					header.getPaymentType()+
					header.getSendDate()+
					header.getSendTime()+
					header.getSponsorCode()+
					header.getTotalDocuments()+
					header.getTrackingNumber());
			msg = "write SUCCESS";
		}catch(IOException ex){
			ex.printStackTrace();
			msg = "write Error";
		}
		finally {
			log.info(msg);
			return msg;
		}
		
	}

}
