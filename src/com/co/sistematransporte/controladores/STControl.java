package com.co.sistematransporte.controladores;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class STControl {

	public static void main(String[] args){
		
		try{
		
			Properties properties = new Properties();
			properties.load(new FileInputStream("AppConfig" + File.separator + "inicio.properties"));
		
		} catch (Exception e){
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
}