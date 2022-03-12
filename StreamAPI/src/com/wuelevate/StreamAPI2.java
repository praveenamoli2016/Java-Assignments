package com.wuelevate;

import java.util.stream.Stream;

public class StreamAPI2 {

	public static void main(String[] args) {
		Stream.of("a", "b", "c", "d")
		.map(s -> s.toUpperCase())
		//.map(String::toUpperCase)
		.forEach(s -> System.out.println(s));

	}

}
