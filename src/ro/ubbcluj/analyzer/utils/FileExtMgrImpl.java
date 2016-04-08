package ro.ubbcluj.analyzer.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExtMgrImpl implements FileExtMgr{

	private String fileName = "vegzodesek.txt";
	
	public boolean isValid(String extension) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
			String ext = null;
			while ((ext = br.readLine()) != null) {
			    if (ext.equals(extension))
			    	return true;
			 }
		} catch (IOException e) {
			return false;
		} 
		return false;
	}
	
}
