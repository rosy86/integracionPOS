package com.taurus.openbravo.soapclient.TaurusSyncClienteFinal;

import java.rmi.RemoteException;

import com.taurus.openbravo.soapclient.dev.ITAURUSSyncProxy;
import com.taurus.openbravo.soapclient.entities.files.DownloadFileRequest;
import com.taurus.openbravo.soapclient.entities.files.DownloadFileResponse;
import com.taurus.openbravo.soapclient.entities.files.FileContainer;
import com.taurus.openbravo.soapclient.entities.files.ProcessingFileRequest;
import com.taurus.openbravo.soapclient.entities.files.ProcessingFileResponse;
import com.taurus.openbravo.soapclient.entities.files.SearchFileRequest;
import com.taurus.openbravo.soapclient.entities.files.SearchFileResponse;
import com.taurus.openbravo.soapclient.entities.security.CredentialData;

import junit.framework.TestCase;

public class ClienteTest extends TestCase {
	
	public void testTaurusSync() throws RemoteException {
		/*ITAURUSSyncProxy itaurusSyncProxy = new ITAURUSSyncProxy();
		CredentialData credentials = new CredentialData("TAURUSync@123", "tsinterface");
		
		SearchFileRequest request = new SearchFileRequest();
		request.setCredentials(credentials);
		//request.setFileDate("2016-03-26T07:40:47.271");
		request.setFileKey("MGARAY_MOVSINV_D");
		SearchFileResponse response = itaurusSyncProxy.searchFile(request);
		System.out.println("Respuesta: " + response.getCodeNumber() );
		 FileContainer[] files = response.getResult();
		 System.out.println("FileContainer[] length: " + files.length);
		 for(FileContainer file : files) {
			 System.out.println("Nombre: " + file.getName());
			 System.out.println("ID: " + file.getID());
			 System.out.println("Key: " + file.getKey());
		 }
		 */
		 /*DownloadFileRequest reqDown = new DownloadFileRequest("42c91509-a0c9-42f2-bb5f-9449262a87c9", "2824", credentials);
		 DownloadFileResponse respDown = itaurusSyncProxy.downloadFile(reqDown);
		 System.out.println("File: " + respDown.getCodeName());*/
		
		 //credentials.setPassword("E57304369340ACE86729A871A00EBD17");
/*		 ProcessingFileRequest reqProc = new ProcessingFileRequest("92f0cf9b-60c5-4f3f-b408-3793cef27b9d", "2816", credentials);
		 ProcessingFileResponse respProc = itaurusSyncProxy.processingFile(reqProc);
		 System.out.println("Respuesta : " + respProc.getMessage());*/
	}

}
