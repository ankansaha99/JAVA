import java.util.Scanner;

public class Array3{
	public static void main (String args []){

		Scanner input = new Scanner (System.in);
        System.out.print("Please Sir, Enter number :");
        double add = 0;
		double[] num = new double[6];

		for (int i =0; i<6; i++){
			num[i]=input.nextDouble();
		} 

		for (int i =0; i<6; i++){
			add = add + num[i];
		}
		System.out.println("Addition of all number is : "+add);
	}

}