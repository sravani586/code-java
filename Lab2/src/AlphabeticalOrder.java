/*Name:Ankireddypalli Sravani
 * Description:Arranging words in Alphabetical Order
 * Date:16/03/2021
 */
import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//to take the user input for length of the string array
		System.out.println("Enter the length of string array");
		final int NUM_ITEMS=sc.nextInt();
		
		
		int rangeOfCases=0;
		String [] items=new String[NUM_ITEMS];
		
		//to get the user input for elements of array upto specified length
		System.out.println("Enter the value of items of string array");
		for(int i=0;i<items.length;i++)
			items[i]=sc.next();
		System.out.println(sortStrings(NUM_ITEMS, items));
			

	}

	private static String sortStrings(final int pNUM_ITEMS, String[] str) {
		/*
		* to sort the string array in alphabetical order to change first half elements of an array into uppercase 
		*and second half into lower case based on length of the string array
		*/
		int rangeOfCases;
		String output="";
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].compareToIgnoreCase(str[j])>0)
				{
				String temp=str[i];
				str[i]=str[j];
				str[j]=temp;
				}
		    }
		}
		if(pNUM_ITEMS%2==0)
			rangeOfCases=pNUM_ITEMS/2;
		else
			rangeOfCases=pNUM_ITEMS/2+1;
		for(int i=0;i<rangeOfCases;i++)
		{
				output+=str[i].toUpperCase()+" ";
		}
		for(int i=rangeOfCases;i<pNUM_ITEMS;i++)
		{
			if(i!=pNUM_ITEMS-1)
				output+=str[i].toLowerCase()+" ";
				else
					output+=str[i].toLowerCase();
		}
		return output;
	}

}
