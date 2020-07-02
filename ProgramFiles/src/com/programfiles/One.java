package com.programfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class One {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Admin\\Desktop\\Directory");
		String[] files = file.list();
		int count = 0;
		BufferedReader bfr = null;
		for(String str : files) {
			bfr = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\Directory\\" + str));
			String fileName = bfr.readLine();
			while(fileName != null) {
				System.out.println(fileName);
				fileName = bfr.readLine();
			}
			count++;
			if(count > 0)
				return;
		}
		bfr.close();
	}
}
