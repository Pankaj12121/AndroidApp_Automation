package com.demo.linkedinoops;

import java.nio.file.Path;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;

public abstract class Abstraction_readFile {
	private final Path filePath;
	
	protected Abstraction_readFile(String filePath) {
		this.filePath= PathfilePath;
	}
	
	public String getPath() {
		return filePath.toString();
	}
	
	public List<String>readFile()throws IOException{
		return Files.lines(filePath)
				.map(this::parseLine)
	}

}
