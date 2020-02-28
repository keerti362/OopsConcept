/**
 * 
 */
package oopsConceptsAbstractionExample;

/**
 * @author Keerti
 *
 * 
 */
public class InterfaceEx2 {

	public static void main(String[] args) {
		A obj = new C();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}

interface A {

	void a(); //methods are by default public abstract and fields are public static final

	void b();

	void c();

	void d();
}

abstract class B implements A {

	public void c() {
		System.out.println("in c");
	}
}

class C extends B {

	@Override
	public void a() {
		System.out.println(" in a");

	}

	@Override
	public void b() {
		System.out.println("in b");

	}

	@Override
	public void d() {
		System.out.println("in d");
	}

}
