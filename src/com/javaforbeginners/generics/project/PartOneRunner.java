package com.javaforbeginners.generics.project;

import java.util.Arrays;

public class PartOneRunner {

	public static void buildArray(int length, Object[] array, Object element) {

		// Find element and store index location to memory
		int location = Arrays.asList(array).indexOf(element);


		// Print findings to console
		System.out.print("\nFrom the array ");
		System.out.print(Arrays.toString(array));
		System.out.printf(", you chose element: %s.", element.toString());

		// Warn if element entered incorrectly
		if (location == -1) {
			System.out.println("\n\nERROR: element not present in array!");
		} else {
			System.out.printf("\n\nThe index location of that element is: %d.\n", location);
		}

	}

	public static void main(String[] args) {

		// Three successful cases using String, double, int data types
		buildArray(5, new Object[] { "one", "two", "three", "four", "five" }, "five");
		buildArray(6, new Object[] { 1.2, 3.1442, 5.7229, 2.777772, 4.69523, 6.74211 }, 2.777772);
		buildArray(6, new Object[] { 1, 3, 5, 2, 4, 6 }, 6);

		// Intentional fail (7 not in array)
		buildArray(6, new Object[] { 1, 3, 5, 2, 4, 6 }, 7);
	}

}
