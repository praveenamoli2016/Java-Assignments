package com.wuelevate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamAPI10 {
	public static void main(String[] args) {
		//List<String> word = new ArrayList<>();;
		List<String> letters = new ArrayList<>();
		letters.add("H");
		letters.add("e");
		letters.add("l");
		letters.add("l");
		letters.add("o");
//	Set<String> set = letters.stream()
//            .map(s -> s.toUpperCase())
//            .collect(Collectors.toCollection(TreeSet::new));
//	System.out.println(set);

//Convert elements to strings and concatenate them, separated by commas
//   String joined = letters.stream()
//       .map(s -> s.toUpperCase())
//       .collect(Collectors.joining(", "));
//   System.out.println(joined);
//
   //Compute sum of all letters
//    int total = letters.stream()
//        .collect(Collectors.summingInt(s->s.length()));
//    System.out.println(total);
     //Group by starting letter
//   Map<String, List<String>> grouped = letters.stream()
//                      .collect(Collectors.groupingBy(s->s.substring(0,1)));
//      System.out.println(grouped);
//
     //Partition letters into uppercase and lowercase
   Map<Boolean, List<String>> upperLower = letters.stream()
		.collect(Collectors.partitioningBy(s -> Character.isUpperCase(s.codePointAt(0))));
        System.out.println(upperLower);
}
}