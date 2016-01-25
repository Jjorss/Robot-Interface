package ch.makery.address;

import java.io.*;

public class Writer {

	private String fileName;
	private String textToWrite;
	
	public Writer(String fileName, String textToWrite){
		this.fileName = fileName;
		this.textToWrite = textToWrite;
		
		try {
			this.write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void write() throws IOException {
		File file = new File(this.fileName);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
	 
		System.out.println("Writing");
		pw.println(this.textToWrite);
		pw.close();
		
	}
}
