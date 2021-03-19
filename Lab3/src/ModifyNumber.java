
		/*Name:Ankireddypalli Sravani
		 * Description:To modify each digit of a number ith the difference between current digit and next digit
		 * Date:17/03/2021
		 */
		import java.util.Scanner;
		import java.lang.Math;
		public class ModifyNumber {

			public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
				
		        //to take user input for number
				System.out.println("Enter the number");
				int number=sc.nextInt();
				
				//to display the output as difference  using modifyNumber method
				System.out.println("the modified number is "+modifyNumber(number));
			}
		    private static int modifyNumber(int pNumber)
		    {
		    	//to  return the output as a number that is formed from difference of pcurrent and next digit of the number
		    	String str=Integer.toString(pNumber);
		    	int output=0;
		    	for(int i=0;i<str.length()-1;i++)
		    	{
		    		int diff=str.charAt(i)-str.charAt(i+1); 
		    		output=output*10+Math.abs(diff);// 3  31  310 3101 31011 
		    	}
		    	output=output*10+(str.charAt(str.length()-1))-'0';// 
		    	
		    	
		    	return output;
		    }
		}

