package com.mypack2;

import com.mypack1.A;
// Non Derived class different package is able to access the public member only
public class D {
	public void display() {
		A a=new A();
		//System.out.println("The private member a"+a.a);
		//System.out.println("The default member b"+a.b);
		//System.out.println("The protected member c"+a.c);
		System.out.println("The public member d"+a.d);
		
		}	
}
