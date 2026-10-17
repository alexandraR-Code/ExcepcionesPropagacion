package com.krakeDev.Evalucion.Excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Validar {
	private static final Logger log = LogManager.getLogger(Validar.class);
	
	public static void validarTelefono(String telefono) throws IllegalAccessException{
		if(telefono.length() !=10) {
			throw new IllegalAccessException("Telefono debe tener 10 digitos");
			
			
		}
		log.info("Cumple con la condicion");
	}


}
