package com_javapgm;

public class Demo {

	public static void main(String[] args) {
		for(int i=1;i<=5; i++)  //out loop and row
		{
			for(int j =1; j<=i;++j)  //inner loop and column
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
