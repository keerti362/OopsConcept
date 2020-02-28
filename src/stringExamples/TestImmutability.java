/**
 * 
 */
package stringExamples;

/**
 * @author Keerti
 *
 * 
 */
//in java Strings are immutable.
//any changes made to the string creates a new instance
public class TestImmutability {
	
	public static void main(String[] args) {
		
		String s = "Keerti";
		s.concat("Patil");
		System.out.println(s); //Keerti
		
		
		String n = "Keerti";
		n = n.concat("Patil");
		System.out.println(n);//Keerti patil
		
		
		
		
	}

}
