/*Name:Ankireddypalli Sravani
 * Description:To find number of positive,negative,odd,even and number of zeros in an array
 * Date:16/03/2021
 */

import java.util.Scanner;

public class NumbersType {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//to take user input of length of an array
		System.out.println("Enter the number of items");
		final int NUM_ITEMS=sc.nextInt();
		
	
		int [] arr=new int[NUM_ITEMS];
		int positiveNumbersCount=0,negativeNumbersCount=0,oddNumbersCount=0,evenNumbersCount=0,zerosCount=0;
		
		//to take user input of elements of array upto the specified length
		System.out.println("Enter the elements of an array");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		//To find number of negative,odd and number of zeros in an array
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				negativeNumbersCount++;
				arr[i]*=-1;
			}
			if(arr[i]%2==1)
				oddNumbersCount++;
			if(arr[i]==0)
				zerosCount++;
		}
		
		//to set number of positive,even based on mumber of negative and even number respectively
		positiveNumbersCount=NUM_ITEMS-negativeNumbersCount;
		evenNumbersCount=NUM_ITEMS-oddNumbersCount;
		
		//to display number of positive,negative,odd,even and number of zeros in an array
		System.out.println("positiveNumbersCount: "+positiveNumbersCount);
		System.out.println("negativeNumbersCount: "+negativeNumbersCount);
		System.out.println("oddNumbersCount: "+oddNumbersCount);
		System.out.println("evenNumbersCount"+evenNumbersCount);
		System.out.println("zerosCount"+zerosCount);
	}

}
