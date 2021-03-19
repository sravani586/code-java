/*Name:Ankireddypalli Sravani
 * Description:Checking if specific value is present in array
 * Date:16/03/2021
 */
import java.util.Scanner;

public class CheckingSpecificValue {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		
	    //to take the user input for length of the integer array
		System.out.print("Enter the number of items:");
		final int NUM_ITEMS=sc.nextInt();
		
		//to take user input for items of integer array upto specified length
		System.out.print("Enter the elements of array(seperated by space):");
		int [] arr=new int[NUM_ITEMS];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
	  //to take user input for the value to be checked
	  System.out.print("Enter the value to be checked:");
      int valueToCheck=sc.nextInt();
      
     
      boolean status = false;
      
      //to check if element is present in an array
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]==valueToCheck)
    	  {
    		  status=true;
    		  break;
    	  }
      }
      if(status==true)
    	  System.out.printf("yes the value %d is present in array",valueToCheck);
      else
    	  System.out.printf("No  the value %d is not present in array",valueToCheck); 
	}

}
