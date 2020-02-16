package fileHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		
		FileInputStream file = new FileInputStream("D:\\Automation011920120\\basic_core_java\\src\\fileHandeling\\OR.properties");
		
				p.load(file);
				
				System.out.println(p.get("name"));
				System.out.println(p.get("surname"));

	}

}
