package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm = new HashMap<Integer,String>();
		hm.put(1, "orange");
		hm.put(2, "Red");
		hm.put(3, "Black");
		hm.put(4, "yellow");
		hm.put(5, "white");
		hm.put(6, "blue");
		hm.remove(7,"white");
		System.out.println(hm);
		hm.remove(4);
        
        System.out.println("After removing White: " + hm);
		
		if(hm.containsValue("green")) {
			System.out.println("green exist in the Map");
		}else
			System.out.println("green does not exist in the Map");
		
		System.out.println("size of the Map :" +hm.size());

	}

}
