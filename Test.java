package com.Immutable;

public class Test {

	public static void main(String[] args) {
		ImmutableClass obj1=new ImmutableClass(50);
		System.out.println(obj1.i);
		obj1.i=20;
		System.out.println(obj1.i);
		

	}

}
