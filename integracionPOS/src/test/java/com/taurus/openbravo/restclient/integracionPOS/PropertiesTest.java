package com.taurus.openbravo.restclient.integracionPOS;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.StringTokenizer;

import junit.framework.TestCase;

public class PropertiesTest extends TestCase {

	public void testProperties() {

		Properties propiedades = new Properties();
		InputStream entrada = null;

		try {

			entrada = new FileInputStream("config.properties");

			// cargamos el archivo de propiedades
			propiedades.load(entrada);

			// obtenemos las propiedades y las imprimimos
			System.out.println(propiedades.getProperty("array.archivos"));
			String archivos = propiedades.getProperty("filekey.archivos");
			StringTokenizer st = new StringTokenizer(archivos,",");
			while(st.hasMoreTokens()){
				System.out.println("Filekey: " + st.nextToken());
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
