package com.taurus.openbravo.utils.integracionPOSUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GT_CLS_ReadProperties {
	
	public static String getPropertieValue(String key) throws IOException{
		Properties propiedades = new Properties();
		InputStream entrada = null;		
		
		entrada = new FileInputStream("config.properties");
		// cargamos el archivo de propiedades
		
		propiedades.load(entrada);
		// obtenemos la propiedad y la regresamos
		return propiedades.getProperty(key);
		
	}

}
