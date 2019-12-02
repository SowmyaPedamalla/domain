package Corejava1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableMethods {

	public static void main(String[] args) {
		Hashtable<Integer,String> names=new Hashtable<Integer,String>();
	      names.put(1, "welcome");
	      names.put(2, "to the");
	      names.put(3, "world");
	      names.put(4, "hello");
	      System.out.println("Initial map elements: " + names);
	      
	      //contains key
	     boolean b= names.containsKey(1);
	      System.out.println("contains key is:"+ b);
	      
	      
	    //contains value
	      boolean b1=names.containsValue("welcome");
	      System.out.println("contains value is:"+b1);
	      
	      
	      //replace
	      names.replace(3, "indian");
	      System.out.println( names.replace(3,"indian"));
	      System.out.println("Initial map elements: " + names);
	      
	      //replace value
	      names.replace(3, "indian","telugu" );
	      System.out.println("replace:"+names.replace(3, "indian","telugu" ));
	      System.out.println("Initial map elements: " + names);
	      
	      //remove key
	      names.remove(4);
	      System.out.println("remove:"+names.remove(4));
	      
	      
	      //remove value
	      names.remove(2, "to the");
	      System.out.println("remove value:"+names.remove(2, "to the"));
	      
	      
	      
	      //is empty
	      names.isEmpty();
	      System.out.println( names.isEmpty());
	      
	      
	      
	      //clear
	      names.clear();
	      System.out.println("Map elements after clear: " + names);
	      
          
	      

	     

	}

}
