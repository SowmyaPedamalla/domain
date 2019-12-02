package Corejava1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapMethods {

	public static void main(String[] args) {
		Map<Integer,String> newmap=new HashMap<Integer,String>();
	      newmap.put(1, "welcome");
	      newmap.put(2, "to the");
	      newmap.put(3, "world");
	      newmap.put(4, "hello");
	      System.out.println("Initial map elements: " + newmap);
	      
	      //contains key
	     boolean b= newmap.containsKey(1);
	      System.out.println("contains key is:"+ b);
	      
	      
	    //contains value
	      boolean b1=newmap.containsValue("welcome");
	      System.out.println("contains value is:"+b1);
	      
	      
	      //replace
	      newmap.replace(3, "indian");
	      System.out.println( newmap.replace(3,"indian"));
	      System.out.println("Initial map elements: " + newmap);
	      
	      //replace value
	      newmap.replace(3, "indian","telugu" );
	      System.out.println("replace:"+newmap.replace(3, "indian","telugu" ));
	      System.out.println("Initial map elements: " + newmap);
	      
	      //remove key
	      newmap.remove(4);
	      System.out.println("remove:"+newmap.remove(4));
	      
	      
	      //remove value
	      newmap.remove(2, "to the");
	      System.out.println("remove value:"+newmap.remove(2, "to the"));
	      
	      
	      
	      //is empty
	      newmap.isEmpty();
	      System.out.println( newmap.isEmpty());
	      
	      
	      
	      //clear
	      newmap.clear();
	      System.out.println("Map elements after clear: " + newmap);
	      
          
	      

	     

	}

}
