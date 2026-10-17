package com.krakeDev.Evalucion.Excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {

	private static final Logger log = LogManager.getLogger(Test.class);

	public static void main(String[] args) {

		try {
			String telefono = "0998546987";

			Validar.validarTelefono(telefono);

			GuardarCliente.guardar(telefono);
			LeerCliente.leer();

			log.info("Se agrego exitosamente");

		} catch (IllegalAccessException e) {
			log.error("Ocurrio un eroro :  " + e);

		}
	}

}
