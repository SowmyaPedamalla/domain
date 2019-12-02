package Corejava1;

import java.util.ArrayDeque;
import java.util.Collection;

public class RemoveAllExample {

	public static void main(String[] args) {
		Collection<String>collection=new ArrayDeque<>();
		collection.add("ramya");
		collection.add("sowmya");
		collection.add("lavanya");
		collection.add("vishali");
		for(String i:collection) {
			System.out.println(i);
		}
			collection.removeAll(collection);
			System.out.println("After removingAll collection is :"+collection);
	}

}
