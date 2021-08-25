package com.javaforbeginners.generics.project;

interface Comparable {
	int value();
}

class Person implements Comparable {
	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int value() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}

}

// Animal does not implement Comparable and, 
// therefore, doesn't have value() method.
// Without value() method, greaterThan will not compile or execute
class Animal {
	int id;
	String name;

	public Animal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
public class PartTwoRunner {

	@SuppressWarnings("hiding")
	public static <Object extends Comparable> Object greaterThan(Object o1, Object o2) {

		Object result = null;

		int obj1 = o1.value();
		int obj2 = o2.value();

		if (obj1 < obj2) {
			result = o2;
		} else if (obj1 > obj2) {
			result = o1;
		} else if (obj1 == obj2) {
			result = null;
		}

		return result;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Create four instances of Person class to demonstrate
		// use of greaterThan() Method
		Person p1 = new Person(12, "Derek");
		Person p2 = new Person(9, "Chris");
		Person p3 = new Person(10, "Joey");
		Person p4 = new Person(6, "Nick");

		// Create two instances of Animal class to demonstrate
		// exclusion from greaterThan() Method
		Animal a1 = new Animal(3, "Lilo");
		Animal a2 = new Animal(4, "Juno");

		// Compare Person ID values using greaterThan() Method
		Object result1 = greaterThan(p1, p2);
		Object result2 = greaterThan(p3, p4);
		Object result3 = greaterThan(p1, p3);

		// The following won't work because Animal class doesn't
		// implement Comparable and, therefore, doesn't have value() method
		// Object result1 = greaterThan(a1, a2);

		// Print results!
		System.out.println("\n" + result1.toString() + " wins the first round!");
		System.out.println("\n" + result2.toString() + " wins the second round!");
		System.out.println("\n" + result3.toString() + " wins the final round!");

		// Exit successfully
		System.exit(0);

	}

}
