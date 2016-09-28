package com.taurus.openbravo.integracionPOS.XML.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.taurus.openbravo.integracionPOS.XML.GT_CLS_XMLServiceInterface;
import com.taurus.openbravo.integracionPOS.XML.entidades.GT_CLS_Precio;
import com.taurus.openbravo.integracionPOS.main.GT_CLS_Base;
import com.taurus.openbravo.utils.integracionPOSUtils.GT_CLS_ReadProperties;
import com.taurus.openbravo.utils.integracionPOSUtils.GT_CLS_SaveLog;

public class GT_CLS_ManagePriceXML extends GT_CLS_Base implements GT_CLS_XMLServiceInterface<GT_CLS_Precio> {

	@Override
	public void procesarXML(NodeList nodosPrecios) throws IOException {

		StringBuilder xmlTemp = new StringBuilder();
		for (int i = 0; i < nodosPrecios.getLength(); i++) {
			GT_CLS_Precio precio = new GT_CLS_Precio();
			// Aquí tengo nodo de precio ya
			Element elementoPrecio = (Element) nodosPrecios.item(i);
			// elementoPrecio.getElementsByTagName("Destino");
			NodeList nodos = elementoPrecio.getChildNodes();
			for (int j = 0; j < nodos.getLength(); j++) {
				Node nodo = nodos.item(j);
				String nombreNodo = nodo.getNodeName();
				if (nombreNodo.equals("Basico")) {
					NamedNodeMap naNoMap = nodo.getAttributes();
					precio.setClavePrincipal(naNoMap.getNamedItem("ProductoClave").getNodeValue());
					NodeList nodosBasico = nodo.getChildNodes();
					for (int b = 0; b < nodosBasico.getLength(); b++) {
						Node nodoDeBasico = nodosBasico.item(b);
						if (nodoDeBasico.getNodeName().equals("Destino")) {
							precio.setDestino(nodoDeBasico.getTextContent());
						} else if (nodoDeBasico.getNodeName().equals("Organizacion")) {
							precio.setDestino(nodoDeBasico.getTextContent());
						} else if (nodoDeBasico.getNodeName().equals("Canal")) {
							precio.setCanal(nodoDeBasico.getTextContent());
						}
					}
				} else if (nombreNodo.equals("Condiciones")) {
					NamedNodeMap naNoMap = nodo.getAttributes();
					precio.setUom(naNoMap.getNamedItem("UnidadMedida").getNodeValue());
					precio.setClaseCondicion(naNoMap.getNamedItem("ClaseCondicion").getNodeValue());
					precio.setMoneda(naNoMap.getNamedItem("Moneda").getNodeValue());
					precio.setVigenciaFin(naNoMap.getNamedItem("VigenciaFin").getNodeValue());
					precio.setVigenciaInicio(naNoMap.getNamedItem("VigenciaInicio").getNodeValue());
					NodeList nodosCondiciones = nodo.getChildNodes();
					for (int c = 0; c < nodosCondiciones.getLength(); c++) {
						Node nodoDeCondiciones = nodosCondiciones.item(c);
						if (nodoDeCondiciones.getNodeName().equals("CostoActualizado")) {
							precio.setCostoActualizado(nodoDeCondiciones.getTextContent());
						} else if (nodoDeCondiciones.getNodeName().equals("PrecioBase")) {
							precio.setPrecioBase(nodoDeCondiciones.getTextContent());
						}
					}

				}
			}
			System.out.println("");
			precio = validarDatos(precio);
			if(precio!=null){
				xmlTemp.append(generarXML(precio,""));
			}
		} // for-principal
		if (xmlTemp.length() > 0) {
			agregar(xmlTemp.toString(), "PricingProductPrice");
			System.out.println("XML de Preciooooo: " + xmlTemp.toString());
		}
	}

	public GT_CLS_Precio validarDatos(GT_CLS_Precio precio) throws IOException{
		// Buscar product por clave principal. Ojo:, en OB las claves
				// principales tendran un sufijo con la uom 
				String searchKey = precio.getClavePrincipal() + "_" + precio.getUom();
				String idProducto = buscar("Product", "searchKey", searchKey);
			if(idProducto!=null){
				precio.setArticulo(idProducto);
				return precio;
			} else {
				List<String> mensaje = new ArrayList<>();
				mensaje.add(GT_CLS_ReadProperties.getPropertieValue("mensaje.precio.noinsertado.producto") + " " + searchKey );
				mensaje.add(GT_CLS_ReadProperties.getPropertieValue("mensaje.precio.noinsertado.elementosrelacionados"));
				GT_CLS_SaveLog.guardarArchivo(mensaje);
				GT_CLS_SaveLog.guardarLogDb(mensaje);
			}
			return null;
		
	}
	
	public String generarXML(GT_CLS_Precio precio, String tipo) {
		// Buscar priceList por canal
		String nombreCanal = precio.getDestino() + "_" + precio.getCanal();
		// 1. Obtener priceList_id por ese canal (name)
		String idPriceList = buscar("PricingPriceList","name", nombreCanal);
		String idVersion = buscar("PricingPriceListVersion", "pricelist.id", idPriceList);
		// 2. id de la version

			StringBuilder sb = new StringBuilder();
			sb.append(addTag("priceListVersion", null, "id", idVersion, true));//"CED844EDFA054C288CC21EF08EBC8A56"
			sb.append(addTag("product", null, "id", precio.getArticulo(), true));
			sb.append(addTag("active", "true", null, null, false));
			sb.append(addTag("listPrice", precio.getPrecioBase(), null, null, false));
			sb.append(addTag("standardPrice", precio.getPrecioBase(), null, null, false));
			String xmlTemp = sb.toString();
			sb = new StringBuilder();
			sb.append(addTag("PricingProductPrice", xmlTemp, null, null, false));
			xmlTemp = sb.toString();
			sb = new StringBuilder();
			sb.append(addHeader()).append(xmlTemp).append(addFooter());
			return sb.toString();
		
	}
}
