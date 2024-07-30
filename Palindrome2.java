package com_javapgm;
import java.util.Scanner;
public class Palindrome2
{
	public static void main(String args[])
	{
		{   Scanner sc=new Scanner(System.in);
			System.out.println(" Enter the number:");
			int num=sc.nextInt();
			int sum=0;
			int temp=num;
			
			while(temp>0) {
				int rem=temp%10;
				sum=(sum*10)+rem;
				temp=temp/10;
			}
				
				if(sum==num)
				{
					System.out.println("Number is Palindrome");
				}
				else
				{
					System.out.println("Number is not Palindrome ");
				}
			
				
			
		}
		
	}
}

