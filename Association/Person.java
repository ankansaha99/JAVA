import java.lang.*;

public class Person
{
	private String phnNumber;
	private Passport passport;
	
	public Person()
	{
		System.out.println("Empty Person");
	}
	public Person(String phnNumber, Passport passport)
	{
		System.out.println("Para Person");
		this.phnNumber = phnNumber;
		this.passport = passport;
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	public void setPassport(Passport passport)
	{
		this.passport = passport;
	}
	public String getPhnNumber(){return phnNumber;}
	public Passport getPassport(){return passport;}
	
	public void showDetails()
	{
		System.out.println("Person Phone Number    : "+phnNumber);
		/*System.out.println("Customer Account Number: "+account.getAccountNumber());
		System.out.println("Customer Account Holder Name: "+account.getAccountHolderName());
		System.out.println("Customer Account Balance: "+account.getBalance());*/
		passport.showDetails();
		
	}
}