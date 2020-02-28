/**
 * 
 */
package oopsConceptsAbstractionExample;

/**
 * @author Keerti
 *
 * 
 */
//The process of hiding the method implementation and only showing the functionality to the users is called Abstraction.
//Class which is declared by using a abstract keyword is called Abstract class.
//Abstract class contain abstract methods as well as concrete methods.
//best example is sending the message, we only type message and send it but we dontknw how internally the process is happening.

//Abstraction is achieved by two ways : 1) abstract class (0-100%), 2)interface(100%)
//abstract class cannot be instantiated.It can have constructors and static methods
//it can also have the final methods whcih force the subclass not change the body of the method.
// can have a constructor
public class AbstractEx {

	public static void main(String[] args) {
		
		Shape1 obj = new Square1();
		System.out.println(obj.area(2));
		obj.draw();
	}
}

 abstract class Shape1{
	
	public abstract long area(int a);
	
	 Shape1() {
		System.out.println("inside a constructor");
	}
	
	public void draw() {
		System.out.println("draw a shape");
	}
}
 
 class Square1 extends Shape1{

	@Override
	public long area(int a) {
		return  a*a;
		
	}
	 
 }
 
 //an abstract class can extend another java class and can implement multiple interfaces
 //can have static, non static final variables
