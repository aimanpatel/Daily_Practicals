package com_javapgm;
interface I1 {
	int a=100;
}
interface I2 {
	int b=200;
}
interface I3 {
	int c=300;
}
class Test implements I1,I2,I3{
	void m1() 
{
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	System.out.println("c: "+c);
	
 }
 
 }


class Demo2 {

	public static void main(String[] args) {
		Test obj=new Test();
		obj.m1();
		

	}

}

