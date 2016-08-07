package org.teja.xapp.fileparser.processor;

import java.io.File;
import java.util.List;

import org.teja.xapp.fileparser.parser.FileParser;

public abstract class FileProcessor {
	
	public void processFile(File file){
		
		FileParser parser = createParser();
		List<String> data = parser.parse();
		System.out.println(data);
		
	}
	
	abstract FileParser createParser();

}
