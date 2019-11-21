package com.example.soap.tmb;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigFile {
	
	public static String PATH_WRITEFILE = null;

	public static void loadConfigFile() {
		
		  try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

	            Properties prop = new Properties();

	            // load a properties file
	            prop.load(input);
	            
	            PATH_WRITEFILE = prop.getProperty("PATH_WRITEFILE");
	            
	            // get the property value and print it out
	            System.out.println("PATH_WRITEFILE : "+prop.getProperty("PATH_WRITEFILE"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }

	    }
		
	
}
