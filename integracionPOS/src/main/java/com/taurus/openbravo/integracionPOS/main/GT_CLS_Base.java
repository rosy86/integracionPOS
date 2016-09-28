package com.taurus.openbravo.integracionPOS.main;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.taurus.openbravo.integracionPOS.restclient.impl.GT_CLS_RestClienteImpl;

public class GT_CLS_Base {
	
	private GT_CLS_RestClienteImpl restClient = new GT_CLS_RestClienteImpl();

	
	public String buscar(String entidad, String nombreParametro, String valorParametro) {
		String xml;
		try {
			xml = getRestClient().consultarPorParametro(entidad, nombreParametro, valorParametro);
			Document doc = inicializarLecturaXML(xml);
			NodeList nodoId = doc.getElementsByTagName("id");
			if (nodoId.getLength() <= 0) {
				return null;
			}
			String id = nodoId.item(0).getTextContent();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<String> buscarYObtenerOtrosParametros(String entidad, String nombreParametro, String valorParametro, String parametroADevolver) {
		String xml;
		try {
			xml = getRestClient().consultarPorParametro(entidad, nombreParametro, valorParametro);
			Document doc = inicializarLecturaXML(xml);
			NodeList nodo = doc.getElementsByTagName(parametroADevolver);
			
			if (nodo.getLength() <= 0) {
				return null;
			}else{
				List<String> valores = new ArrayList<>(); 
				for(int i=0; i<nodo.getLength(); i++) {
					
					String valor = nodo.item(i).getTextContent();
					valores.add(valor);
					
				}
				return valores;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String agregar(String xml, String entidad) {
		try {
			String id = getRestClient().agregarXML(xml, entidad);
			return id;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public void actualizar(String xml, String entidad) {
		try {
			getRestClient().actualizarXML(entidad, xml);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Document inicializarLecturaXML(String xml) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(xml));
		Document doc = db.parse(is);
		return doc;
	}
	public Document inicializarLecturaXMLFalsa(String xml)  throws ParserConfigurationException, SAXException, IOException {
		xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?> "
				+ " <Productos xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" Cliente=\"160\" Ambiente=\"Q00\" Tipo=\"WBBDLD04\" ArchivoOrigen=\"WBBDLD_00140003\"> "
				+ "   <Producto RegistroID=\"1\"> " + "     <Basico ClavePrincipal=\"ACCO0003\"> "
				+ "       <Descripcion>Tarro test</Descripcion> " + "       <Grupo>001001XX1</Grupo> "
				+ "       <UnidadBase>PCE</UnidadBase> " + "       <AgrupoadorPrecios /> "
				+ "       <EstatusBloqueo /> " + "       <Sucursal>CD01</Sucursal> "
				+ "       <IndicadorABC>A</IndicadorABC> " + "       <Marca /> " + "     </Basico> "
				+ "     <Impuestos> " + "       <ImpuestoClave>C0</ImpuestoClave> " + "     </Impuestos> "
				+ "     <UnidadesMedida> " + "       <UnidadMedida Clave=\"PCE\" Cantidad=\"12.0000\"> "
				+ "         <CodigosBarras> "
				+ "           <CodigoBarras Tipo=\"IC\" Principal=\"\" Valor=\"7502218211003\" /> "
				+ "           <CodigoBarras Tipo=\"IC\" Principal=\"X\"  Valor=\"21111111001\" /> "
				+ "           <CodigoBarras Tipo=\"IC\" Principal=\"\" Valor=\"7502218211665\" /> "
				+ "           <CodigoBarras Tipo=\"IC\" Principal=\"\" Valor=\"7502218211004\" /> "
				+ "         </CodigosBarras> " + "       </UnidadMedida> "
				+ "       </UnidadesMedida> "
				+ "   </Producto> " + " </Productos> ";
		
		
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(xml));
		Document doc = db.parse(is);
		return doc;
	}

	public String addHeader() {
		String header = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><ob:Openbravo xmlns:ob=\"http://www.openbravo.com\" "
				+ "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"> ";
		return header;
	}

	public String addFooter() {
		return "</ob:Openbravo>";
	}

	public String addTag(String name, String textoContenido, String valueName, String value, boolean selfClosed) {
		String ini = "<";
		String finTag = "/";
		String fin = ">";
		String spc = " ";
		String equal = "=";
		String comillas = "\"";
		StringBuilder sb = new StringBuilder(ini);
		sb.append(name);
		if (valueName != null) {
			sb.append(spc);
			sb.append(valueName);
			sb.append(equal);
			sb.append(comillas);
			sb.append(value);
			sb.append(comillas);
		}
		if (selfClosed) {
			sb.append(finTag);
			sb.append(fin);
		} else {
			sb.append(fin);
			sb.append(textoContenido);
			sb.append(ini);
			sb.append(finTag);
			sb.append(name);
			sb.append(fin);
		}
		return sb.toString();
	}

	public GT_CLS_RestClienteImpl getRestClient() {
		return restClient;
	}

	public void setRestClient(GT_CLS_RestClienteImpl restClient) {
		this.restClient = restClient;
	}
}
