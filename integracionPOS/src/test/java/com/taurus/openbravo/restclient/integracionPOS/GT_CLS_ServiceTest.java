package com.taurus.openbravo.restclient.integracionPOS;

import com.taurus.openbravo.integracionPOS.main.GT_CLS_Main;

//import com.taurus.openbravo.integracionPOS.service.GT_CLS_MainService;
/*import com.taurus.openbravo.integracionPOS.soapclient.impl.GT_CLS_TaurusSyncClientImpl;
import com.taurus.openbravo.soapclient.entities.files.FileContainer;*/

//import java.util.ArrayList;
//import java.util.List;


import junit.framework.TestCase;

public class GT_CLS_ServiceTest extends TestCase{
//"36729011A0774FFEB42413236B6AF15F"
	public void testBuscar() throws Exception {
		
/*		GT_CLS_TaurusSyncClientImpl gt_CLS_TaurusSyncClientImpl = new GT_CLS_TaurusSyncClientImpl();
		FileContainer[] files = gt_CLS_TaurusSyncClientImpl.buscarArchivos("MGARAY_WBBDLD04_D");//MGARAY_WBBDLD04_D --MGARAY_MOVSINV_D
		int i = 1;
		FileContainer archivo = new FileContainer();
		for (FileContainer file : files) {
			System.out.println(i + ".- Key: " + file.getKey() + " - ID: " + file.getID());
			archivo = file;
			i++;
		}
		
		String xml = gt_CLS_TaurusSyncClientImpl.bajarArchivos(archivo, "MGARAY_WBBDLD04_D");
		System.out.println(xml);
		*/
		//gt_CLS_TaurusSyncClientImpl.
		//ProductXML productXML = new ProductXML(); 
		/*GT_CLS_MainService mainService = new GT_CLS_MainService();
		mainService.obtenerXML("Producto", null);*/
		
		GT_CLS_Main main = new GT_CLS_Main();
		main.manejarPeticionesWS();
		/*GT_CLS_Base base = new GT_CLS_Base();
		base.buscarYObtenerOtrosParametros("obmupc_prod_multiupc", "product.id", "619A153D428C433FA85EE87EBA83E924", "upc");*/
		/*GT_CLS_XMLMainService gt_CLS_XMLServiceImpl = new GT_CLS_XMLMainService();
		gt_CLS_XMLServiceImpl.manejarPeticionesWS();
		
		/*List<String> list = new ArrayList<>();
		list.add("987654321");
		list.add("987654322");
		list.add("987654323");
		productXML.generarXMLActualizarUPC("49F900CB3323424D9745956BB6F5DEA4", list);*/
		//gt_CLS_Service.buscarIdTaxCategory("C0");
	}
}