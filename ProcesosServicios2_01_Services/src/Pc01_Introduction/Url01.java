package Pc01_Introduction;

import java.net.MalformedURLException;
import java.net.URL;

public class Url01 {
	
	public static void main(String[] args) {
		URL url;
		try {
			System.out.println("Constructor simple para URL:");
			System.out.println("========================================================");
			url = new URL("http://docs.oracle.com/");
			System.out.println("========================================================");
			visualizar(url);
			
			System.out.println("Otro construtor simple para URL:");
			System.out.println("========================================================");
			url = new URL("http://http://localhost/PFC/gest/cli_gestion.php?S=3");
			visualizar(url);
			System.out.println("========================================================");
			
			System.out.println("Constructor para protocolo +URL +directorio: ");
			System.out.println("========================================================");
			url = new URL("http", "docs.oracle.com", 80, "/javase/7");
			visualizar(url);
			System.out.println("========================================================");
			
			System.out.println("Constructor para un objeto URL y un directorio: ");
			System.out.println("========================================================");
			URL urlBase = new URL("http://docs.oracle.com/");
			url = new URL(urlBase, "/javase/7/docs/api/java/net/URL.html");
			visualizar(url);
			System.out.println("========================================================");
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	private static void visualizar(URL url) {
		System.out.println("\tURL completa: " + url.toString());
		System.out.println("\tProtocolo: " + url.getProtocol());
		System.out.println("\tHost: " + url.getHost());
		System.out.println("\tPuerto: " + url.getPort());
		System.out.println("\tArchivo: " + url.getFile());
		System.out.println("\tInfo del usuario: " + url.getUserInfo());
		System.out.println("\tPath: " + url.getPath());
		System.out.println("\taAutority: " + url.getAuthority());
		System.out.println("\tQuery: " + url.getQuery());
	}

}
