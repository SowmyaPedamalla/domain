package Corejava1;

import java.util.ArrayDeque;
import java.util.Collection;

public class Contains1 {
	static int i =1;

	public static void main(String[] args) {
		Collection<String>collection=new ArrayDeque <>();
		collection.add("mango");
		collection.add("papaya");
		collection.add("orange");
		collection.add("mosambi");
		collection.add("pineapple");
		if(collection.contains("mosambi")) {
			System.out.println("mosambi is present");
		}else {
			System.out.println("mosambi is not present");
		}
		
		

	}

}
