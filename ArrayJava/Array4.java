

import java.util.Scanner;

public class Array4 {

	  public static void main (String args []) {

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
			System.out.println("Avarage is : "+add/6);
			
			double max = num[0];
			for(int i=1; i<6; i++) {
				if (max<num[i]) {
					max = num[i];
				}
			}
			System.out.println("max is : "+max);
			
			double min = num[0];
			for(int i=1; i<6; i++) {
				if (min>num[i]) {
					min = num[i];
				}
			}
			System.out.println("min is : "+min);
	  }
}
	  
