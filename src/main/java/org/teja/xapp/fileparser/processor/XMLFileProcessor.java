package org.teja.xapp.fileparser.processor;

import org.teja.xapp.fileparser.parser.FileParser;
import org.teja.xapp.fileparser.parser.XmlFileParser;

public class XMLFileProcessor extends FileProcessor{

	@Override
	FileParser createParser() {
		
		return new XmlFileParser();
	}
	

}
