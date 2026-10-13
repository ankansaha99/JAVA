 

public class Start
{
	public static void main(String []args)
	{
		Passport a1 = new Passport();
		a1.setPassportNumber(111111111);
		a1.setPassportHolderName("Hawkling");
		a1.setNationality("Bangladeshi");
		
		Person c1 = new Person();
		c1.setPhnNumber("+88012345678890");
		c1.setPassport(a1);
		
		c1.showDetails();
		System.out.println("----------------------------------------");
		Passport a2 = new Passport(22222222, "Hawkling", "Bangladeshi");
		Person c2 = new Person("+88019876543221", a2);
		
		System.out.println("person PhnNumber             : "+c2.getPhnNumber());
		System.out.println("person passport Number       : "+c2.getPassport().getPassportNumber());
		System.out.println("person passport Holder Name  : "+c2.getPassport().getPassportHolderName());
		System.out.println("person Nationality           : "+c2.getPassport().getNationality());



		
	}
}




