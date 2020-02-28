/**
 * 
 */
package oopsConceptsAbstractionExample;

/**
 * @author Keerti
 *
 * 
 */

// canot create the object but we can use it for reference to create object for class which implements interface
//can achieve loose coupling
//methods inside interface are by default public abstract and fields are public final static
//cant have a constructor
public class InterfaceEx {

	public static void main(String[] args) {
		Shape obj = new Square();
		obj.draw();
		
	}
}

interface Shape{
	
	abstract void draw();
}

interface Area{
	abstract void calculateArea();	
	
}

class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("draw a square");
		
	}
	
}

// an interface can only extend another interface
// can only have public static final variables.
 
 class Rectangle implements Shape, Area{

	@Override
	public void draw() {
		System.out.println("draw a rectangle");
		
	}

	@Override
	public void calculateArea() {
    System.out.println("calculate area");		
	}
	 
 }
