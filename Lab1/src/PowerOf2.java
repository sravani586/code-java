/*Name:Ankireddypalli Sravani
 * Description:Checking if a given number is a power of 2
 * Date:18/03/2021
 */

import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		    //taking user input for number
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int number=sc.nextInt();
			
			//to display if the number is a power of 2 or not using checkNUmber Function
            if(checkNumber(number)==true)
            	System.out.println("The "+number+" is a power of 2");
            else
            	System.out.println("The "+number+" is not a power of 2");
	}
	public static  boolean checkNumber(int n)
	{
		//to check if a number is a power of 2
		boolean status=false;
		int i=1,mul=1;
		while(i>0)
		{
			mul*=2;
			if(mul==n)
			{
				status=true;
				break;
			}
			else if(mul>n)
				break;
			i++;
		}
	    
		return status;
	}

}
