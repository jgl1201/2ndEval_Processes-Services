package Pc01_Introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlCon01 {

	public static void main(String[] args) {
		URL url = null;
		URLConnection urlCon = null;
		
		try {
			url = new URL("https://www.cebem.net/index.php/es/");
			urlCon = url.openConnection();
			BufferedReader br;
			InputStream inputStream = urlCon.getInputStream();
			br = new BufferedReader(new InputStreamReader(inputStream));
			String inputLine;
			while ((inputLine = br.readLine()) != null)
				System.out.println(inputLine);
			br.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
