
public class Derived1 extends Base1 {
	public void displayDerived() {
		System.out.println("I am the display method of the derived class");
	}
	
	 public void display() {  // overriding display method
		System.out.println("I am the display method in the derived class");
	} 
	
	// Cannot reduce the visibility of the inherited method from Base1
	/* protected/private/default void display() {  // overriding display method
		System.out.println("I am the display method in the derived class");
	}*/
}
