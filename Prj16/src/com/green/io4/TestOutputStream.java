package com.green.io4;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {

	public static void main(String[] args) throws IOException {
		String 			 file = "c:\\imsi\\outstream.txt";
		FileOutputStream fos  = new FileOutputStream(file);
		
		for(int ch = 'A'; ch <= 'Z'; ch++) {
			fos.write( ch );
		}
		
		fos.close();
	}

}
