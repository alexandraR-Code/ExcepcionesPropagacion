package com.krakeDev.Evalucion.Excepciones;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class GuardarCliente {
	
	private static final Logger log = LogManager.getLogger(GuardarCliente.class);
	
	public static void guardar(String telefono) {
	
	FileWriter escritor = null;
	try {
		
		escritor = new FileWriter("cliente.txt");
		
		escritor.write("nombre : Ale \n");
		escritor.write("apellido : Ramirez \n");
		escritor.write("telefono : "+ telefono + " \n");
		
		log.info("Clienete guardado exitosamente");
		
		
	} catch (IOException e) {
		log.error("Ocurrio un error al guardar a cliente");
	}finally {
		try {
			if(escritor != null) {
				escritor.close();
				log.info("Se ceroor extosamente");
			}
			
		} catch (Exception e2) {
			log.error("Ocuurururur");
		}
	}
	
	
	}
}
