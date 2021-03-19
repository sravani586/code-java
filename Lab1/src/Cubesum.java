/**
 * Name:Ankireddypalli Sravani
 * Description:Lab1 Exercise:Sum of Cubes of Digits of a number
 * Date:14/3/2021
 */
import java.util.*;
public class Cubesum {
	public static int cubeSum(int n)
	{
	  //to find the sum of cube of digits of a number
	  int remainder=0,sum=0;
	  while(n>0)
	  {
		  remainder=n%10;
		  sum+=remainder*remainder*remainder;
		  n/=10;
	  }
	  return sum;
	}
	public static void main(String[] args) {
		//to take user input for number
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		
		
		//to display output using cubeSum function
		int result=cubeSum(number);
		System.out.println(result);
	}

}
