
package com.blz.maximumgenerics;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Maximum {
	
	public int maxNumber(Stream<Integer> stream) {
		return stream.max(Integer::compareTo).get();
	}

	
	public static void main(String[] args) {

		Maximum maximum = new Maximum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 3 Integer Values :- ");
		System.out.print("Integer 1: ");
		int num1 = sc.nextInt();
		System.out.print("Integer 2: ");
		int num2 = sc.nextInt();
		System.out.print("Integer 3: ");
		int num3 = sc.nextInt();

		Integer num_arr[] = new Integer[] { num1, num2, num3 };
		Stream<Integer> stream = Arrays.stream(num_arr);
		System.out.println("Maximum Integer Among These Values = " + maximum.maxNumber(stream));
		sc.close();
	}
}
