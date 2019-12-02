package Corejava1;

import java.util.ArrayList;

public class IndexOfExample {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("hello");
		al.add("hai");
		al.add("welcome");
		al.add("buffer");
		al.add("builder");
		al.add("index");
		al.add("student");
		System.out.println("Index of 'index' : "+al.indexOf("index"));
		System.out.println("Index of 'welcome' : "+al.indexOf("welcome"));
		System.out.println("Index of 'goodmorning' : "+al.indexOf("goodmorning"));
		System.out.println("Index of 'student' : "+al.indexOf("student"));

	}

}
