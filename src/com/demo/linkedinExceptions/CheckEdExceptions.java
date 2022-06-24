package com.demo.linkedinExceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckEdExceptions {

	public static void main(String[] args) {

	}

	public static void ioExcepExample() throws IOException {
		String fileName = "example.txt";
		File file = new File(fileName);
		file.createNewFile();
		FileWriter writer= new FileWriter(file);
		writer.write("Java rocks");
		writer.flush();
		writer.close();
	}
	
	public void fileNotFoundExample() {
		
			String path= "D://example.txt";
			File file = new File(path);
			
			
		
	}

}
