
public class Base1Derived1Main2 {

	public static void main(String[] args) {
	
		 Base2 base=new Derived2();
		 base.display();  // The static methods are not overridden and that
		 // is the reason it is invoking the display method of the Parent class(
		 // of the reference class)
		 // static members are related to class and they are not dependent on the object creation
		 
		
		
	}

}
