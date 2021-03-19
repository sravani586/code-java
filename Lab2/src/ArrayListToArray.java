/*Name:Ankireddypalli Sravani
 * Description:Converting ArrayList to Array
 * Date:16/03/2021
 */

import java.util.ArrayList;
public class ArrayListToArray {

	public static void main(String[] args) {
		//to convert ArrayList into Array  and to display it
			    ArrayList<Integer> list= new ArrayList<>();
			    list.add(1);
			    list.add(2);
			    list.add(3);
			    Integer [] arr = new Integer[list.size()];

			    list.toArray(arr);
			    System.out.print("Array: ");
			    for(int i=0;i<arr.length;i++) {
			      if(i==arr.length-1)
			      System.out.print(arr[i]);
			      else
				      System.out.print(arr[i]+",");
			    }

	}

}
