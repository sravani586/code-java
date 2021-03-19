/*
 * Name:Ankireddypalli Sravani
 * Description:To check if string is positive
 * Date:18/03/2021
 */
import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		
		        Scanner sc=new Scanner(System.in);
				
		      //to take user input for string
				System.out.println("Enter the String");
				String str=sc.next();	
				
				//to display whether the string is positive or not using checkIfPositive method
		        System.out.println(checkIfPositive(str));
			}
			private static String checkIfPositive(String pStr)
			{
				//to return a string that tells if the string is positive or not
				boolean status=true;
				String output="";
				for(int i=0;i<pStr.length()-1;i++)
				{
					if(pStr.charAt(i)>pStr.charAt(i+1))
					{
						status=false;
		                break;
					}		
				}
				if(status==true)
					output+="positive";
				else
					output+="not positive";
				return output;
			}

		}


