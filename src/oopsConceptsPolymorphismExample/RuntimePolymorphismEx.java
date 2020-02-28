/**
 * 
 */
package oopsConceptsPolymorphismExample;

/**
 * @author Keerti
 *
 * 
 */// ------POLYMORPHISM ---------
//Achieving something in multiple ways or one task performing in different ways is called polymorphism
//polymorphism is achieved in two ways :1) Method overriding/Runtime polymorphism 2) Method overloading/Compile-time polymorphism


// RuntimePolymorphism
//Runtime polymorphism is achieved by method overriding
//method name should be same
// return type should be same
//access modifier should be same or higher than parent method
//should accept same number and same type parameter


//Static methods canot be overriden
//main method cannot be overriden because it is static

public class RuntimePolymorphismEx {

	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s.getRateOfInterest());

		AXIS a = new AXIS();
		System.out.println(a.getRateOfInterest());
	}

}

class Bank {

	public float getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank {

	public float getRateOfInterest() {
		return 7;
	}
}

class AXIS extends Bank {

	public float getRateOfInterest() {
		return 9;
	}
}
