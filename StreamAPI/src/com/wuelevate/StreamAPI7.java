package com.wuelevate;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI7 {
	public static void main(String[] args) {
	
		Comparator<String> byLength = (s1, s2) -> Integer.compare( s1.length(), s2.length());
		//Optional<String> max = Stream.of("hello","good bye", "black", "white", "good", "bad")
		        //.max(byLength); //returns "good bye"
		//Optional<String> min = Stream.of("hello","good bye","try", "black", "white", "good", "bad")
		        //.min(byLength); //returns "bad"
		//long count = Stream.of("hello","good bye", "black", "white", "good", "bad")
		      // .count(); //returns 6
		 //System.out.println(count);
		OptionalInt max = IntStream.of(1, 34, 667, 3, 32, 23).max(); // max() returns 667

		OptionalInt min = IntStream.of(1, 34, 667, 3, 32, 23).min(); // min() returns 1

		OptionalDouble average = IntStream.of(1, 34, 667, 3, 32, 23).average(); // returns 126.66

		int sum = IntStream.of(1, 34, 667, 3, 32, 23).sum(); // returns 760
		 System.out.println(sum);
	}

}
