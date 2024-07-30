package com_javapgm;

public class IfElse {

	public static void main(String[] args) {
		int x=8;
		int y=5;
		int z=9;
		
		if(x>y && x<z) 
		{
			System.out.println("x : "+x);
			System.out.println("Thank You...!!!");
		}
		else if(y<x && y>z)
		{
			System.out.println("y : "+y);
		}
		else 
		{
			System.out.println("z :"+z);
		}
		

	}

}
