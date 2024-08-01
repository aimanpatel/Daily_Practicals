package com.set.navigableset;


import java.util.NavigableSet;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		
		NavigableSet ns=new TreeSet();
		
		ns.add("A");
		ns.add("Z");
		ns.add("X");
		ns.add("D");
		ns.add("B");
		ns.add("M");
		
		System.out.println(ns);
		System.out.println(ns.ceiling("E"));  //>=E  -->lowest
		System.out.println(ns.higher("B"));  //>=E  -->lowest
		System.out.println(ns.floor("N"));   //>D   -->highest
		System.out.println(ns.lower("D"));    //<=D   -->highest
		
		System.out.println(ns.descendingSet());
		
		System.out.println(ns);
		

	}

}
