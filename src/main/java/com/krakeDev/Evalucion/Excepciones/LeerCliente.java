package com.krakeDev.Evalucion.Excepciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LeerCliente {
	private static final Logger log = LogManager.getLogger(LeerCliente.class);

	public static void leer() {
		FileReader lectorArchivo = null;
		BufferedReader lector = null;

		try {
			lectorArchivo = new FileReader("cliente.txt");
			lector = new BufferedReader(lectorArchivo);

			for (int i = 0; i < 10; i++) {
				System.out.println(lector.readLine());

			}
			log.info("Se lee exitosamente");

		} catch (FileNotFoundException e) {
			log.error("Ocuririo un eroror: {}" + e.getMessage());

		} catch (IOException e) {
			log.error("Ocurrio un errror al leer el archivo ");

		} finally {
			try {
				if (lectorArchivo != null) {
					lectorArchivo.close();
				}
				if (lector != null) {
					lector.close();
				}
				log.error("SE CERRO EXITOSAMENRE");

			} catch (IOException e) {
				e.printStackTrace();

			}
		}
	}

}
