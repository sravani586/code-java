/* Name:Ankireddypalli Sravani
 * Description:Lab1 Exercise:Fibonacci Sequence upto nth term
 * Date:14/3/2021
 */
import java.util.*;
public class Fibonacci {
	public static StringBuilder fibonacciSequence(int n)
	{
		//to return the Fibonacci sequence by using StringBuilder Class
		StringBuilder sb=new StringBuilder();
		int first=0,second=1,fib=0;
		for(int i=1;i<=n;i++)
		{
			if(n==1)
			{
				sb.append(Integer.toString(first));
				break;
			}
			else
			{
				if(i==1)
					fib=0;
				else if(i==2)
					fib=1;
				else
				{
				fib=first+second;
		        first=second;
				second=fib;
				}
				if(i!=n)
					sb.append(Integer.toString(fib)+" ");
				else
					sb.append(Integer.toString(fib));
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		//to take user input for number
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the the number upto which the fibonacci sequence is created");
		int number=sc.nextInt();
		
		//to display output using cubeSum function
		System.out.println(fibonacciSequence(number));
	}

}
