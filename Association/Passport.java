import java.lang.*;

public class Passport
{
	private int passportNumber;
	private String passportHolderName;
	private String nationality;
	
	public Passport()
	{
		System.out.println("Empty Passport");
	}
	public Passport(int passportNumber, String passportHolderName, String nationality)
	{
		System.out.println("Para Passport");
		this.passportNumber = passportNumber;
		this.passportHolderName = passportHolderName;
		this.nationality = nationality;
	}
	
	public void setPassportNumber(int passportNumber)
	{
		this.passportNumber = passportNumber;
	}
	public void setPassportHolderName(String passportHolderName)
	{
		this.passportHolderName = passportHolderName;
	}
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}
	public int getPassportNumber(){return passportNumber;}
	public String getPassportHolderName(){return passportHolderName;}
	public String getNationality(){return nationality;}
	
	public void showDetails()
	{
		System.out.println("Passport  Number       : "+passportNumber);
		System.out.println("Passport Holder Name   : "+passportHolderName);
		System.out.println("Nationality            : "+nationality);
	}
}