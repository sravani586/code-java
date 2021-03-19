/**
 * Name:Ankireddypalli Sravani
 * Description:Lab1 Exercise:Traffic Light
 * Date:14/3/2021
 */
import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		
		//to take user input to select one from following options
		Scanner sc=new Scanner(System.in);
		System.out.println("Please select one option from the given 3 options");
		System.out.println("1.Red");
		System.out.println("2.Green");
		System.out.println("3.Yellow");
		int number=sc.nextInt();
		
		//to display the commands based on the option selected using switch case
		switch(number)
		{
			case 1:
				System.out.println("Stop");
				break;
			case 2:
				System.out.println("Go");
				break;
			case 3:
				System.out.println("Ready");
				break;
			default:
				System.out.println("please select from the above options");
		}
		
	}

}
