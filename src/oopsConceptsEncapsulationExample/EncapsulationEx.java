/**
 * 
 */
package oopsConceptsEncapsulationExample;

/**
 * @author Keerti
 *
 * 
 */
//Encapsulation is nothing but data hiding
// capsulating all the code and data in single unit
//achieved by using private access modifier
// we can make the class read-only or write only by setter and getter methods
public class EncapsulationEx {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccNo(1234567);
		account.setName("Keerti");
		account.setEmail("keerti@gamil.com");
		account.setAmount(123654);
		
		System.out.println(account.getAccNo());
		System.out.println(account.getName());
		System.out.println(account.getEmail());
		System.out.println(account.getAmount());
	}

}

class Account{
	
	private long accNo;
	
	private String name;
	private String email;
	private  double amount;
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
