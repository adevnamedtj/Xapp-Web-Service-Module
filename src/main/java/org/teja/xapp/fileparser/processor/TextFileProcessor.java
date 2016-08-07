package org.teja.xapp.fileparser.processor;

import org.teja.xapp.fileparser.parser.FileParser;
import org.teja.xapp.fileparser.parser.TextFileParser;

public class TextFileProcessor extends FileProcessor{

	@Override
	FileParser createParser() {
		
		return new TextFileParser();
	}

}
