import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class read{
	public static String myread(String data){
		System.out.println("doc file...\n\n");
		try {
			FileReader fr = new FileReader(data);
			BufferedReader br = new BufferedReader(fr);
			
			try {
				StringBuffer sb = new StringBuffer();
				String line;
				while((line=br.readLine())!= null){
					sb.append(line);
				}
				return sb.toString();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("khong doc du lieu duoc");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("khong lay duoc file mapsub.java");
		}
		return null;
	}
	
}