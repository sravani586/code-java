/*Name:Ankireddypalli Sravani
 * Description:To find the length of Longest Consecutive Sequence in an array
 * Date:16/03/2021
 */


import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
		
		//to take user input of length of an array
		System.out.print("Enter the number of items:");
		final int NUM_ITEMS=sc.nextInt();
		
		//to take user input of elements of array upto the specified length
		System.out.print("Enter the elements of array(seperated by space)");
		int [] arr=new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		        //sorting array
		        Arrays.sort(arr);
		        
		        
		        //to store the lengths of consecutive array in String str
				String str="";
				int count=0;
				for(int i=0;i<arr.length-1;i++) 
				{
					if(arr[i]+1==arr[i+1])
					{
						count++;
					}
					else
					{
						if(count>0)
						{
						str+=Integer.toString(count+1); 
						count=0;
						}
						count=0;
						
					}
						
				}
				if(count>0)
					str+=Integer.toString(count+1);
				
				//to find the length of the longest consecutive sequence
				char max=str.charAt(0);
				for(int i=1;i<str.length();i++)
				{
					if(str.charAt(i)>max)
						max=str.charAt(i);
				}
				System.out.println(max-'0');
	}

}
