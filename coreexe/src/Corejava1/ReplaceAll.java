package Corejava1;


import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class ReplaceAll {

	public static void main(String[] args) {
		Vector<String>vector=new Vector<String>();
		vector.add("hello");
		vector.add("how");
		vector.add("are");
		vector.add("you");
		System.out.println("initial values are :" +vector);
		Collections.replaceAll(vector,"how","welcome");
		System.out.println("Value after replace :"+vector);

	}

}
