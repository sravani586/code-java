/*Name:Ankireddypalli Sravani
 * Description:To find number of lines,words and characters in a given string
 * Date:18/03/2021
 */
import java.util.Scanner;

public class NumbersOfWordsLines {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			
		    //to take user input for string 
			System.out.println("Enter the string");
			String str=sc.nextLine();
			
			//to find number of lines,words,characters 
			int lineLength=str.split("[.]").length;
			int wordLength=str.split(" ").length+lineLength-1;
			int characterCount=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=' '&&str.charAt(i)!='.')
					characterCount++;
					
			}
			
			//to display number of lines,words,characters
			System.out.println("line length"+lineLength);
			System.out.println("word lngth"+wordLength);
			System.out.println("character count"+characterCount);
		
	}

}
