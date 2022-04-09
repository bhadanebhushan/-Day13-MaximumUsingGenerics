
package com.blz.maximumgenerics;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Maximum {
	
	public String maxString(Stream<String> stream) {
		return stream.max(String::compareTo).get();
	}

	
	public static void main(String[] args) {

		Maximum maximum = new Maximum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 3 String Values :- ");
		System.out.print("String 1: ");
		String string1 = sc.next();
		System.out.print("String 2: ");
		String string2 = sc.next();
		System.out.print("String 3: ");
		String string3 = sc.next();

		String num_arr[] = new String[] { string1, string2, string3 };
		Stream<String> stream = Arrays.stream(num_arr);
		System.out.println("Maximum String Among These Values = " + maximum.maxString(stream));
		sc.close();
	}
}
