
public class Base1Derived1Main1 {

	public static void main(String[] args) {
		Base1 base=new Base1();
		base.displayBase();
		base.display();
		Derived1 derived=new Derived1();
		derived.displayBase();
		derived.displayDerived();
		derived.display();
		Base1 base1=new Derived1(); // The reference variable
		// is of Parent type and object is of Child type
        // In reference data type the above statement is
		// showcasing type conversion. In Reference type
		// automatic conversion or implicit casting takes
		//place when we try to convert from Derived/Child type
		// to Parent/Base class type.
		base1.displayBase();
		//base1.displayDerived(); //we wont be able to access
		// dispalyDerrived when the reference is of Base1 type and
		// object is of Derived1 type. The reason is we dont have
		// the mention of derived display in the Base1 class.
		base1.display();  // display of the Derived class or child class will be called
		
		// Then how it is possible that reference variable is of data type of Parent type and object is
		// of the child type, how can we call the methods which are specific to the derived class.
		// We can go for type casting in reference type
		Derived1 derived1=(Derived1)base1;
		derived1.displayDerived();  // So now we can access the method displayDerived which is specifically
		// designed in the Derived class.
		Object obj1=new Base1();
		Object obj2=new Derived1();
		// Whether with Object class reference we will be able to call methods of the Base1 class
		// No because display and DisplayBase are not available in the Object class
		Base1 base2=(Base1)obj1;
		base2.displayBase();
		base2.display();
		Object obj3="Ramesh";
		// Can we call the method length() of String class with the reference of Object class.
		//int length=obj3.length();
		String str=(String)obj3;
		System.out.println(str.length());
		int num[]= {1,2,3,4};
		Object obj4=num; // array is also of type Object. That is the reason the reference of array we
		// can store in the Object class reference
		int num2[]=(int [])obj4;
		
		
	}

}
