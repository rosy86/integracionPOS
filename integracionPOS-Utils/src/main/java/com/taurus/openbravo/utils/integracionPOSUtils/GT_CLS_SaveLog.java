package com.taurus.openbravo.utils.integracionPOSUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GT_CLS_SaveLog {

	public static void guardarArchivo(List<String> lineas) {
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			String path = "log/";
			File directorio = new File(path);
			if (!directorio.exists()) {
				directorio.mkdir();
			}
			String file = "log.txt";
			fw = new FileWriter(path + file, true);
			pw = new PrintWriter(fw);
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
			String fecha = format.format(date);
			lineas.add(fecha);
			for (String linea : lineas) {
				pw.println(linea);
			}
			pw.println("--------------------------------------------------------------------------------");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void guardarLogDb(List<String> lineas) throws IOException {
		String usuario = GT_CLS_ReadProperties.getPropertieValue("usuario.bdlog");
		String password = GT_CLS_ReadProperties.getPropertieValue("password.bdlog");
		String url = GT_CLS_ReadProperties.getPropertieValue("url.bdlog");
		String classForName = GT_CLS_ReadProperties.getPropertieValue("class.bdlog");

		Connection con = null;
		Statement stat = null;

		try {
			Class.forName(classForName);
			con = DriverManager.getConnection(url, usuario, password);
			stat = con.createStatement();

			// Insertar en la tabla de log
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
			String fecha = format.format(date);
			StringBuilder mensaje = new StringBuilder();
			for (String linea : lineas) {
				mensaje.append(linea);
				mensaje.append(" ");
			}
			String insertar = "INSERT INTO log (mensaje, fecha) VALUES ('" + mensaje + "','" + fecha + "')";
			stat.executeUpdate(insertar);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (stat != null) {
				try {
					stat.close();
					con.close();
				} catch (SQLException ex) {
					Logger.getLogger(GT_CLS_SaveLog.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ex) {
					Logger.getLogger(GT_CLS_SaveLog.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		}
	}

	public static void main(String[] args) {
		// guardarArchivo("Hola mundo");
		try {
			List<String> lista = new ArrayList<>();
			lista.add("Hola");
			lista.add("mundo");
			guardarLogDb(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Ya");
	}

}
