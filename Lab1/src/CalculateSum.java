/*Name:Ankireddypalli Sravani
 * Description:calcuate sum of n numbers which are divisible by 3 or 5
 * Date:18/03/2021
 */



import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		//to take user input for range 
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int range=sc.nextInt();
		
		//to display output using calculateSum function
		System.out.println("The sum of natural number upto "+range+" is:"+calculateSum(range));
		

	}
	private static int calculateSum(int n)
	{
		//to find the sum of numbers upto n which are displayed by either 3 or 5
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}

	}


