/**
 * Name:Ankireddypalli Sravani
 * Description:Lab1 Exercise:To diplay Prime Numbers upto specific number
 * Date:14/3/2021
 */
import java.util.*;
public class PrimeNumbers {
	public static void prime(int n)
	{
		//to display prime numbers upto specific number
		int count=0;
		if(n==1)
		      System.out.println("No prime numbers");
			else
			{
				for(int i=2;i<=n;i++)
				{
				   count=0;
				   for(int j=2;j<=i/2;j++)
				   {
					   if(i%j==0)
					   {
						   count++;
						   break;
					   }
				   }
				   if(count==0)
					   System.out.print(i+" ");
				}
			}
	}

	public static void main(String[] args) {
		//to take user input for number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		
		prime(number);
		
	}

}
