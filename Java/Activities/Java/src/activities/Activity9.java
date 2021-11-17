package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("George");
		myList.add("peppa");
		myList.add("Rider");
		myList.add("crishty");
		myList.add("Charle");
		for (String x:myList) {
			System.out.println(" names in the list :" + x);
		}
		System.out.println("get the element from the list :" + myList.get(2));
		System.out.println("check the contains method :" +myList.contains("peppa"));
		System.out.println("number of elements in the list :"+myList.size());
		myList.remove(2);
		System.out.println("number of elements in the list :"+myList.size());
		for(String x:myList)
		{
			System.out.println("names in the list after the removal of index 2 :" +x);
		}
		
	}

}
