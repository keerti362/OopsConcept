/**
 * 
 */
package oopsConceptsInheritanceExample;

/**
 * @author Keerti
 *
 * 
 */
//Inheriting all the properties and behaviours from parent object is known as inheritance
//Achieving code-reusability

//achieve runtime polymorphism
//return type of overriding method should be same parent method
//access modifier should be of higher visible or same as parent.
public class InheritanceExample {

	public static void main(String[] args) {

		Addition addition = new Addition();
		System.out.println(addition.add(2, 4));
		
		AllOperations operations = new AllOperations();
		System.out.println(operations.multiplication(2, 4));
		
	}

}

class MathOperations {

	int a;
	int b;

	public int add(int a, int b) {
		return a + b;

	}

	public int subtract(int a, int b) {
		return a - b;
	}
}

class MathOperations1 extends MathOperations { // single-level inheritance
	int c;
	int d;
	
	public int multiplication(int c,int d) {
		return c*d;
	}
	
	public int division(int c,int d) {
		return c/d;
	}
}

//overriding a subtract method
class Addition extends MathOperations {  //single-level inheritance
 
	public int subtract(int a, int b) {   //return type of overidding method should be same as parent method 
		int c = a-b;
		return c;
	}
}

class Subtraction extends MathOperations{ // Hierarchical inheritance
	
}

class AllOperations extends  MathOperations1 { //multi-level inheritance

	}
