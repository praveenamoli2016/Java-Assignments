package com.wuelevate;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class StreamAPI5 {
	public static void main(String[] args) {
		
//	Optional<Integer> min = Stream.of(10, 20, 30, 40).filter(n -> n < 50).min((a1,a2)->a1.compareTo(a2));
//	if (min .isPresent()) {
//	  System.out.println(min.get());
//	} else {
//	  System.out.println("No value");
//	}
	Optional<Integer> min = Stream.of(10, 20, 30, 40).filter(n -> n < 50).min((a1,a2)->a1.compareTo(a2));
     min.ifPresent(n -> System.out.println(n));
	
}
}
