/*Name:Ankireddypalli Sravani
 * Description:To find duplicate values in array
 * Date:16/03/2021
 */

import java.util.Scanner;

public class DuplicateValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//to take the user input for length of the integer array
		System.out.print("Enter the number of items:");
		final int NUM_ITEMS=sc.nextInt();
		
		//to take user input for items of integer array upto specified length
		System.out.print("Enter the elements of array(seperated by space)");
		int [] arr=new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
	
		int count=0;
		String output="";
		
		//to display duplicate elements in an array
		System.out.println("Duplicate elements in the given array");
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
				if(count==1)
				{
					if(output.contains(Integer.toString(arr[i]))==false)
						output+=Integer.toString(arr[i])+",";
						
				}
					
		}
		System.out.println(output.substring(0,output.length()-1));
	}

}
