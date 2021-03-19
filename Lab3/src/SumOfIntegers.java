/*Name:Ankireddypalli Sravani
 * Description:To find sum of integers of  string data type 
 * Date:18/03/2021
 */
import java.util.Scanner;
import java.util.StringTokenizer;
public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//to take user input for string
		System.out.println("Enter the string:");
		String str=sc.next();
		
		//splitting the string using StringTokenizer class
		StringTokenizer st=new StringTokenizer(str,",");
		
		//to add the values and display it
		int sum=0;
		while(st.hasMoreTokens())
		{
			sum+=Integer.parseInt(st.nextToken());
		}
		System.out.println("The sum of integers:"+sum);		
	}

}
