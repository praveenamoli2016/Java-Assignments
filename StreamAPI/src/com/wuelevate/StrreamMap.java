package com.wuelevate;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StrreamMap {

	public static void main(String[] args) {
		
//		List<Integer> number = Arrays.asList(2,3,4,5);
//		List<Integer> square = number.stream().map( x->x*x).collect(Collectors.toList());
//		System.out.println(square);
		
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
		
		List<String> result2 = names.stream().sorted().collect(Collectors.toList());
		System.out.println(result2);
		
		List<Integer> number = Arrays.asList(2,3,4,5,3);
		Set<Integer> square = number.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(square);
		
		List<Integer> number2 = Arrays.asList(2,3,4,5);
		number2.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		List<Integer> number3 = Arrays.asList(2,3,4,5);
		int even = number3.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);

	}

}
