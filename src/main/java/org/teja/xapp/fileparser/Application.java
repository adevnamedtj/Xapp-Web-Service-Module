package org.teja.xapp.fileparser;



import org.teja.xapp.fileparser.processor.FileProcessor;
import org.teja.xapp.fileparser.processor.TextFileProcessor;
import org.teja.xapp.fileparser.processor.XMLFileProcessor;

public class Application {
	
	public static void main(String... args){
		FileProcessor processor = null;
		System.out.println("TESTING TXT FILE");
		 processor = getFileProcessor("TEXT");
		processor.processFile(null);
		
		System.out.println("TESTING XML FILE");
		 processor = getFileProcessor("XML");
		processor.processFile(null);
	}

	private static FileProcessor getFileProcessor(String fileType) {
		if("TEXT".equals(fileType)) {
			return new TextFileProcessor();
		}
		else if("XML".equals(fileType)) {
			return new XMLFileProcessor();
		}else{
			throw new RuntimeException("FILE TYPE NOT SUPPOTED");
		}
		
	}

}
