package com.taurus.openbravo.integracionPOS.XML.impl;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.taurus.openbravo.integracionPOS.XML.GT_CLS_XMLServiceInterface;
import com.taurus.openbravo.integracionPOS.XML.entidades.GT_CLS_Promocion;
import com.taurus.openbravo.integracionPOS.main.GT_CLS_Base;

public class GT_CLS_ManagePromotionXML extends GT_CLS_Base
		implements GT_CLS_XMLServiceInterface<GT_CLS_Promocion> {

	@Override
	public String generarXML(GT_CLS_Promocion entidad, String tipo) {
		return null;
	}

	@Override
	public void procesarXML(NodeList nodos) {

		for (int i = 0; i < nodos.getLength(); i++) {
			String nombreNodo1 = nodos.item(i).getNodeName();
			System.out.println("Nombre del nodo: " + nombreNodo1);
			GT_CLS_Promocion promo = new GT_CLS_Promocion();
			Element elementoPromo = (Element) nodos.item(i);
			/* Obtiene los nodos de cada elemento de promocion */
			NodeList childNodesPromo = elementoPromo.getChildNodes();
			System.out.println("La longitud de childNodesPromo: " + childNodesPromo.getLength());
			for (int j = 0; j < childNodesPromo.getLength(); j++) {
				String nombreNodo = childNodesPromo.item(j).getNodeName();
				System.out.println("Nombre del nodo: " + nombreNodo);
				if (childNodesPromo.item(j).getNodeName().equals("Basico")) {

					NodeList nodoBasico = childNodesPromo.item(j).getChildNodes();

					for (int x = 0; x < nodoBasico.getLength(); x++) {
						if (nodoBasico.item(x).getNodeName().equals("PromocionID")) {
							promo.setPromoID(nodoBasico.item(x).getTextContent());
						} else if (nodoBasico.item(x).getNodeName().equals("Destino")) {
							promo.setDestino(nodoBasico.item(x).getTextContent());
						} else if (nodoBasico.item(x).getNodeName().equals("Tipo")) {
							promo.setTipo(nodoBasico.item(x).getTextContent());
						}
					}
				} else if (childNodesPromo.item(j).getNodeName().equals("Mecanica")) {
					NodeList nodoMecanica = childNodesPromo.item(j).getChildNodes();

					for (int x = 0; x < nodoMecanica.getLength(); x++) {
						if (nodoMecanica.item(x).getNodeName().equals("Condicion")) {
							promo.setCondicion(nodoMecanica.item(x).getTextContent());
						} else if (nodoMecanica.item(x).getNodeName().equals("VigenciaInicio")) {
							promo.setVigenciaIni(nodoMecanica.item(x).getTextContent());
						} else if (nodoMecanica.item(x).getNodeName().equals("VigenciaFin")) {
							promo.setVigenciaFin(nodoMecanica.item(x).getTextContent());
						} else if (nodoMecanica.item(x).getNodeName().equals("CantidadVenta")) {
							promo.setCantidadVenta(nodoMecanica.item(x).getTextContent());
						} else if (nodoMecanica.item(x).getNodeName().equals("Descripcion")) {
							promo.setDescripcion(nodoMecanica.item(x).getTextContent());
						} else if (nodoMecanica.item(x).getNodeName().equals("ArticulosVenta")) {
							// AQUI DEBO OBTENER LISTA DE ARTICULOS
							
							List<String> listaArtsVenta = new ArrayList<>();
							NodeList articulosVenta = nodoMecanica.item(x).getChildNodes();
							for (int y = 0; y < articulosVenta.getLength(); y++) {
								Node nodo = articulosVenta.item(y);
								NamedNodeMap map = null;
								String clavePrincipal = "";
								String uom = "";
								if(nodo.hasAttributes()){
									map = nodo.getAttributes();
									clavePrincipal = map.getNamedItem("ClavePrincipal").getNodeValue();
									uom = map.getNamedItem("UnidadMedida").getNodeValue();
								}
								String searchKey = "";
								if ((clavePrincipal != null && !clavePrincipal.equals("")
										&& (uom != null && !uom.equals("")))) {
									searchKey = clavePrincipal + "_" + uom;
								}
								if (!searchKey.equals("")) {
									listaArtsVenta.add(searchKey);
								}
							} /* FIN DEL FOR DE ARTICULOS DE VENTA */
							promo.setArticulosVenta(listaArtsVenta);
						} else if (nodoMecanica.item(x).getNodeName().equals("Beneficios")) {
							
							// AQUI DEBO OBTENER LISTA DE ARTICULOS BENEFICIOS
							List<String> listaArtsVentaBeneficios = new ArrayList<>();
							NodeList articulosVentaBeneficios = nodoMecanica.item(x).getChildNodes();
							for (int y = 0; y < articulosVentaBeneficios.getLength(); y++) {
								
								Node nodo = articulosVentaBeneficios.item(y);
								NamedNodeMap map = null;
								String clavePrincipal = "";
								String uom = "";
								if(nodo.hasAttributes()){
									map = nodo.getAttributes();
									clavePrincipal = map.getNamedItem("ClavePrincipal").getNodeValue();
									uom = map.getNamedItem("UnidadMedida").getNodeValue();
								}
								String searchKey = "";
								if ((clavePrincipal != null && !clavePrincipal.equals("")
										&& (uom != null && !uom.equals("")))) {
									searchKey = clavePrincipal + "_" + uom;
								}
								if (!searchKey.equals("")) {
									listaArtsVentaBeneficios.add(searchKey);
								}
							} /* FIN DEL FOR DE ARTICULOS DE VENTA BENEFICIOS*/
							promo.setBeneficios(listaArtsVentaBeneficios);
						} /*
							 * FIN DE PREGUNTAR SI ES EL NODO DE ARTICULOS DE
							 * VENTA DE BENEFICIOS
							 */
					}/*FOR NODO MECANICA*/
				}/*IF NODO MECANICA*/
			}/*FOR NODOS INTERNOS*/
			System.out.println("Parate aquí.");
		}/*FOR PRINCIPAL*/
	}

	@Override
	public GT_CLS_Promocion validarDatos(GT_CLS_Promocion promocion) {
		return null;
	}
}
