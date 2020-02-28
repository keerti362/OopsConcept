/**
 * 
 */
package oopsConceptsPolymorphismExample;

/**
 * @author Keerti
 *
 * 
 */
// compile time polymorphism is achieved by method loading
// multiple methods having same name but different number of parameters is method overloading
//method overloading increases readability
// we can overload main method
public class CompiletimePolymorphismEx {
 
	public static void main(String[] args) {
		Adder obj = new Adder();
		System.out.println(obj.add(1,2));
		System.out.println(obj.add(1, 2, 3));
		CompiletimePolymorphismEx.main("Keerti");
	}
	
	public static void main(String arg1) {
		System.out.println("Hi," + arg1);
		
	}
}

 class Adder {
	
	 public int add(int a, int b) {
		 return a+b;
	 }
	 
	 public int add(int a, int b, int c) {
		 return a+b+c;
	 }
	 
 }
