package com.wuelevate;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamAPI8 {

	public static void main(String[] args) {
//		Comparator<String> byLength = (s1, s2) -> Integer.compare( s1.length(), s2.length());
//
//		Stream.of("hello","good bye", "black", "white", "good", "bad")
//		          .sorted(byLength)
//		          .forEach(s -> System.out.println(s));
		Comparator<String> byLength = (s1, s2) -> Integer.compare( s1.length(), s2.length());
		Comparator<String> byLetters = (s1, s2) -> s1.compareTo(s2);

		Stream.of("hello","good bye", "black", "white", "good", "bad")
		          .sorted(byLength.thenComparing(byLetters))
		          .forEach(s -> System.out.println(s));

	}

}
