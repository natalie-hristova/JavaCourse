package lesson21;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main (String []args){
//		
//		File file1 = new File("D:\\javaTest");
//		boolean file1Exists = file1.exists();
//		boolean file1IsDir = file1.isDirectory();
//		if (!file1Exists){
//			file1.createNewFile();
//		}
//		try {
			 
		     //File file = new File("D:\\javaTest");
		     File file = new File("D:\\iotest");

		      if (!file.exists()){
		    	if (file.mkdir()){
		        System.out.println("File is created!");
		       
		      }else{
		        System.out.println("File already exists.");
		      }
	 
//	    	} catch (IOException e) {
//		      e.printStackTrace();
		      }
	}
}
	 
