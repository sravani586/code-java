/*Name:Ankireddypalli Sravani
 * Description:To find the second smallest element in an array
 * Date:16/03/2021
 */
import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallestElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//to take user input of length of an array
		System.out.println("Enter the number of items");
		final int NUM_ITEMS=sc.nextInt();
		int [] items=new int[NUM_ITEMS];
		
		//to take user input of elements of array upto the specified length
		System.out.println("Enter the elements of an array");
		for(int i=0;i<items.length;i++)
			items[i]=sc.nextInt();
		
		//sorting array
		Arrays.sort(items);
		
		//to display the second smallest number in an array
		System.out.println("Second smallest number in an array: "+getSecondSmallest(items));
		
		
	}
	public static int getSecondSmallest(int arr[])
	{
		//to return the second smallest element in an array
		int secondSmallest=0,firstSmallest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=firstSmallest)
			{
				secondSmallest=arr[i];
				break;
			}
		}
		return secondSmallest;
	}

}
