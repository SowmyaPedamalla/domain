package Corejava1;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class EnumerationExample {
	public static void main(String[] args) {
Hashtable<String,String>indiaStates=new Hashtable<String,String>();
		
		indiaStates.put("AP", "Andhra Pradesh");
		indiaStates.put("TS", "Telangana State");
		indiaStates.put("TN", "TamilNadu");
		indiaStates.put("KT", "Karnataka");
		indiaStates.put("KL", "Kerala");
		indiaStates.put("KT","Karnataka");
		
		Set<String>set=indiaStates.keySet();
		Set<String>Keyset=indiaStates.keySet();
		Enumeration code=indiaStates.elements();
		
		while(code.hasMoreElements()){
			System.out.println(code.nextElement());
		}
	}
}
