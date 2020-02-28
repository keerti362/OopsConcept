/**
 * 
 */
package stringExamples;

/**
 * @author Keerti
 *
 * 
 */

//constant pool and non-constant pool
//if we create a string by using a new keyword than string is created in non-constant pool
public class StringComparasionEx {
	
	public static void main(String[] args) {
		String s1 = "Keerti";
		String s2 = "Keerti";
		String s3 =  new String("Keerti");
		String s4 = new String("Keerti");
		String s5 = "KEERTI";
		
		//equalsIgnoreMethod:Compares string content but ignores case
		System.out.println(s1.equals(s5)); // false
		System.out.println(s1.equalsIgnoreCase(s5)); //true
		
		//equals:compares the content
		System.out.println(s1.equals(s2));//true : equal method compares the content 
		System.out.println(s1.equals(s3));//true
		
		//" == " method compares the reference
		System.out.println(s1==s2);//true: bcs s1 and s2 are constant pool and duplicates are not allowed in constant pool soo the reference value is same
		System.out.println(s1==s3);//false: s1in constant pool and s2 in non-constant pool
		
		System.out.println(s3==s4);// beacause duplicates are allowed in nonconstant pool.
		
		
		String s = "Keerti";//6
		String p = "Patil";//5
		
		System.out.println(s.compareTo(p));//-5 
		System.out.println(p.compareTo(s));//   
		
	}

}
