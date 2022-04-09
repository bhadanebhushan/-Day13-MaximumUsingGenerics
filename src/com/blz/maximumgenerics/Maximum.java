package com.blz.maximumgenerics;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Maximum {
	
	public Float maxFloat(Stream<Float> stream) {
		return stream.max(Float::compareTo).get();
	}

	
	public static void main(String[] args) {

		Maximum maximum = new Maximum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 3 Float Values :- ");
		System.out.print("Enter Float 1: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter Float 2: ");
		float num2 = sc.nextFloat();
		System.out.print("Enter Float 3: ");
		float num3 = sc.nextFloat();

		Float fl_arr[] = new Float[] { (float) num1, (float) num2, (float) num3 };
		Stream<Float> fl_stream = Arrays.stream(fl_arr);
		System.out.println("Maximum floating Point Values Among These Values= " + maximum.maxFloat(fl_stream));
		sc.close();
	}
}
