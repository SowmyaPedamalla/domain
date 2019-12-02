package Corejava1;

import java.util.ArrayDeque;
import java.util.Collection;

public class IsEmptyExample {

	public static void main(String[] args) {
		 Collection<String> collection = new ArrayDeque<String>(); 
		 
		 collection.add("pineapple");
		 collection.add("orange");
		 if(collection.isEmpty()){  
	            System.out.println("The queue is empty.");  
	        }  
	        else{  
	            System.out.println("Elements are : "+collection);  
	        }  

	}

}
