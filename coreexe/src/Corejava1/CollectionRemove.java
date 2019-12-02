package Corejava1;

import java.util.ArrayDeque;
import java.util.Collection;

public class CollectionRemove {

	public static void main(String[] args) {
		Collection<String>collection=new ArrayDeque<>();
		collection.add("ramya");
		collection.add("sowmya");
		collection.add("lavanya");
		collection.add("vishali");
		for(String i:collection) {
			System.out.println(i);
		}
			collection.remove("vishali");
			System.out.println("After removing vishali\ncollection :"+collection);
	}

}
