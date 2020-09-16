package day46_collection_part1;

import java.util.*;

public class SortingList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("kotlin");
		list.add("c++");
		
		System.out.println("Before sorting");
		System.out.println(list.toString());
		
		Collections.sort(list);
		
		System.out.println("After sorting");
		System.out.println(list.toString());
		
		
		
		
		
		
		

	}

}
