package com.mypack1;


// If a class is a non inherited class and in the same package as that of the class whose members we are trying to access
// we are not able to access the private member
public class B {

	public void display() {
		A a=new A();
		//System.out.println("The private member a"+a.a);
		System.out.println("The default member b"+a.b);
		System.out.println("The protected member c"+a.c);
		System.out.println("The public member d"+a.d);
		
		}	
	
}
