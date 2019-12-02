package Corejava1;

import java.util.ArrayDeque;
import java.util.Collection;

public class EqualsExample {

	public static void main(String[] args) {
		Collection<String>collection=new ArrayDeque<String>();
		Collection<String>collection1=new ArrayDeque<String>();
		
		collection.add("sowmya");
		collection.add("ramya");
		
		boolean value=collection.equals(collection1);
		System.out.println(value);

	}

}
