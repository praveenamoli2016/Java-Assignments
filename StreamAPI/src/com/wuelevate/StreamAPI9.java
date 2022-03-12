package com.wuelevate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI9 {
	public static void main(String[] args) {
//	List<String> word = new ArrayList<>();;
//	List<String> letters = new ArrayList<>();
//	letters.add("H");
//	letters.add("e");
//	letters.add("l");
//	letters.add("l");
//	letters.add("o");
	//for (String s : letters)
//		word.add(s.toUpperCase());
//	{
//	   //word.add(s.toUpperCase());
//	   //System.out.println(s);
//	   System.out.println( word);
//	}
//	
		List<String> letters = new ArrayList<>();
		letters.add("H");
		letters.add("e");
		letters.add("l");
		letters.add("l");
		letters.add("o");
		List<String> word = letters.stream().collect(() -> new ArrayList<>(),
		                                    (c, s) -> c.add(s.toUpperCase()),
		                                    (c1, c2) -> c1.addAll(c2));
		//List<String> word = letters.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(word);
		System.out.println(letters);
		

}
}
