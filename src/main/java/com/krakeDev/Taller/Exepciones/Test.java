package com.krakeDev.Taller.Exepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	private static final Logger log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {
		
		try {
			String telefono = "0998580362";
			// telefono incorrecto
			ValidarContacto.validarTelefono(telefono);

			GuardarContacto.guardar(telefono);
			LeerContacto.leer();

			log.info("Se guardo el telefono de forma exitosa");

		} catch (IllegalArgumentException e) {
			log.error("Ocurrio un error: " + e);
		}

	}

}
