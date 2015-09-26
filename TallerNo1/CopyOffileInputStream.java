package vista;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CopyOffileInputStream {
	File file;
	public static String str = "";
	
	public CopyOffileInputStream(File p){
	file = p;
	FileInputStream fis = null;
	try {
        fis = new FileInputStream(file);
        int content;
        while ((content = fis.read()) != -1) 
        {
            // convert to char and display it
            str += (char) content;           
        }
        
    }
	catch (IOException e) {
        e.printStackTrace();
    }
	
	finally {
        try {
            if (fis != null)
                fis.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
	
	
	
	
	
	
	}
	

	public static String getStr() {
		return str;
	}
	
	

}