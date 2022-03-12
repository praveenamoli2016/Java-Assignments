package com.wuelevate;

import java.util.Optional;

public class StreamAPI6 {

	public static void main(String[] args) {
		Optional<String> empty  = Optional.empty();
		Optional<String> string = Optional.of("Hello");
		Optional<String> empty2  = Optional.ofNullable(null);
		System.out.println(string);

	}

}
