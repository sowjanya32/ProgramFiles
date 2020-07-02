package com.programfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Two {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\Sacramentorealestatetransactions.csv"));
		String columns = "";
		columns = bufferedReader.readLine();
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		if(columns != null) {
			String[] splitColumn = columns.split(",");
			for(int i = 0 ; i < splitColumn.length ; i++) {
				hashMap.put(splitColumn[i].toLowerCase(), i );
			}

		}
		int price = hashMap.get("price");
		System.out.println("price");
		System.out.println("---------");
		while((columns = bufferedReader.readLine()) != null) {
			String[] splitColumn = columns.split(",");
			System.out.println(splitColumn[price]);

		}
		bufferedReader.close();
	}

}

