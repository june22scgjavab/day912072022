package com.mypack1;
// Within the same class all the members are accessible

public class A {
private int a;
int b;
protected int c;
public int d;

public void display() {
	System.out.println("The private member a"+a);
	System.out.println("The default member b"+b);
	System.out.println("The protected member c"+c);
	System.out.println("The public member d"+d);
	
	}
	

}
