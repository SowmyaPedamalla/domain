package Corejava1;

import java.util.ArrayList;

public class LastIndexOfExample {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("hello");
		al.add("hai");
		al.add("welcome");
		al.add("buffer");
		al.add("builder");
		al.add("index");
		al.add("student");
		System.out.println("LastIndexOf 'welcome'  : "+al.lastIndexOf("welcome"));

	}

}
