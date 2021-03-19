/*
 * Name:Ankireddypalli Sravani
 * Description:To find the mirror of the String and to display mirror of the string and original string
 * Date:18/03/2021
 */
import java.util.Scanner;

public class MirrorOfString {

	public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				
				//to take user input for the string 
				System.out.println("Enter the String");
				String str=sc.next();
				str.concat("hello");
				System.out.println(str);
				
				//to display the output in the format  originalstring|mirrorstring using getImage method
				System.out.println(getImage(str));
			    
			}
		    private static String getImage(String pStr)
		    {
		    	//using StringBuffer class to reverse the string and return the string as  originalstring|mirrorstring
		    	StringBuffer reverseStr=new  StringBuffer(pStr);
		    	System.out.println(reverseStr);
		    	reverseStr.reverse();
		    	System.out.println(reverseStr);
		    	return pStr+"|"+reverseStr;
		    
		    }
		}



