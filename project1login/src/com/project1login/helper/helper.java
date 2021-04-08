package com.project1login.helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class helper {

	public static boolean deleteFile(String path)
	{
		boolean f=false;
		try {
			
			java.io.File file = new java.io.File(path);
			file.delete();
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}


public static boolean saveFIle(InputStream is, String path)
{
	boolean f=false;
	try {
		byte b[]= new byte[is.available()];
		is.read(b);
		
		FileOutputStream fos= new FileOutputStream(path);
		fos.write(b);
		
		fos.flush();
		fos.close();
		f=true;
		
				
	} catch (Exception e) {
		e.printStackTrace();
	}
	return f;
}
}