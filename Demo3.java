package com_javapgm;
interface I1 {
	public int a=20;
	void m1();
	
}
class A implements I1{
	public void m1()
	{
		System.out.println("m1 of A Class");
	}
}

 class Demo3 {

	public static void main(String[] args) {
		System.out.println(I1.a);
		A obj=new A();
		obj.m1();
		
	}

}
