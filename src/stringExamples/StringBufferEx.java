/**
 * 
 */
package stringExamples;

/**
 * @author Keerti
 *
 * 
 */

// to create a immuatable strings we use StringBuffer and StringBuilder class
//StringBuffer and StringBuilder class are used create mutable strings and both class are similar except StringBuilder class is non-synchronised
public class StringBufferEx {
	
	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer(); // creates a Empty String Buffer with initial capacity of 16.
		StringBuffer s1 = new StringBuffer("Hello"); // creates a String buffer with a specified String.
		System.out.println(s1.append("Java"));
		System.out.println(s1.capacity());
		System.out.println(s1.indexOf("v"));
		System.out.println(s1.length()); // capacity intial capacity*2 + 2
		
	}

}
