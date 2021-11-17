package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("peppa");
		hs.add("sky");
		hs.add("Robel");
		hs.add("George");
		hs.add("Barath");
		hs.add("Ladoo");
		 System.out.println("no of names in set : " +hs.size());
		hs.remove("sky");
		if(hs.remove("Janani")) {
        	System.out.println("Janani removed from the Set");
        } else {
        	System.out.println("Janani  is not present in the Set");
        }
		System.out.println("check the set is having the name :" + hs.contains("George"));
		 System.out.println("Updated HashSet: " + hs);

	}

}
