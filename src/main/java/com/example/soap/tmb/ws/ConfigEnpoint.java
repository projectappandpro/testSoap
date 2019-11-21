package com.example.soap.tmb.ws;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.WsdlDefinition;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.Wsdl11Definition;
import org.springframework.xml.validation.XmlValidator;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.xml.xsd.XsdSchemaCollection;

@EnableWs
@Configuration
public class ConfigEnpoint extends WsConfigurerAdapter {
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/TMBSCFWSInBound/services/*");
	}

	@Bean(name = "IRPCPetrochemPaymentService")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchemaCollection schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("IRPCPetrochemPaymentService");
		wsdl11Definition.setLocationUri("/TMBSCFWSInBound/services/IRPCPetrochemPaymentService");
		wsdl11Definition.setTargetNamespace("http://service.payment_service.ws.irp.tmbscfinbound");
		wsdl11Definition.setSchemaCollection(schema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchemaCollection studentSchemas() {
		
		XsdSchemaCollection collection = new XsdSchemaCollection() {
			
			  @Override
		        public XsdSchema[] getXsdSchemas() {
				  
		            return new XsdSchema[] {studentSchema(),employeeSchema()};
		        }

		        @Override
		        public XmlValidator createValidator() {
		            throw new UnsupportedOperationException();
		        }
		    };
		return  collection;
		
	}
	
	 @Bean
	    public XsdSchema studentSchema() {
	        return new SimpleXsdSchema(new ClassPathResource("requestPayment.xsd"));
	    }

	    @Bean
	    public XsdSchema employeeSchema() {
	        return new SimpleXsdSchema(new ClassPathResource("responsePayment.xsd"));
	    }     
	
	
	
}