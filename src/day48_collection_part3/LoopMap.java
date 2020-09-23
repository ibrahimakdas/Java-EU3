package day48_collection_part3;

import java.util.*;

public class LoopMap {

	public static void main(String[] args) {
		
		Map<String,String> dataMap = new HashMap<>();
		
		dataMap.put("url", "qa3.vytrack.com");
		dataMap.put("username", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckDriver", "Bob");
		dataMap.put("storeManager", "John");
		
		//keySet - > returns set with all the keys in the map 
		//values - > returns all the values in the map
		
		System.out.println("++++KEYS++++");
		for(String key : dataMap.keySet()) {
			System.out.print(key + "|");
		}
		
		System.out.println("++++VALUES++++");
		for(String value : dataMap.values()) {
			System.out.print(value + "|");
		}
		
		System.out.println("++++KEY | VALUES++++");
		for(String key : dataMap.keySet()) {
			System.out.println(key + "|" + dataMap.get(key));
		}

	}

}
