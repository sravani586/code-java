/*Name:Ankireddypalli Sravani
 * Description:Checking if a given number is increasing number
 * Date:18/03/2021
 */
import java.util.Scanner;

public class IncreasingNumber {

	public static void main(String[] args) {
	//to take user input for number
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	
	
	//to display if the number is increasing or not  using checkNumber Function
	if(checkNumber(number)==true)
		System.out.println("Increasing Number");
	else
		System.out.println("Not an increasing Number");
	}
	public static boolean checkNumber(int number)
	{
		//to check if the number is increasing or not by comparing the current value with next value
		String str=Integer.toString(number);
		int count=0;
		boolean status=false;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>str.charAt(i+1))
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			status=true;
		}
		else
		{
			status=false;
		}
		return status;	
	}
}
