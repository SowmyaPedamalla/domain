package Corejava1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
Map<String,String>indiaStates=new TreeMap<String,String>();
		
		indiaStates.put("AP", "Andhra Pradesh");
		indiaStates.put("TS", "Telangana State");
		indiaStates.put("TN", "TamilNadu");
		indiaStates.put("KT", "Karnataka");
		indiaStates.put("KL", "Kerala");
		indiaStates.put("KT","Karnataka");
		Set<String>set=indiaStates.keySet();
		Iterator<String> iterator=set.iterator();
		String Key=null;
		String value=" ";
		while(iterator.hasNext()) {
			Key=iterator.next();
			value=indiaStates.get(Key);
			System.out.println(Key +": "+value);
		}
		boolean containsKey=indiaStates.containsKey("AP");
		boolean containsValue=indiaStates.containsValue("AP");
		indiaStates.remove("KL");
		indiaStates.replace("KT", "Karnataka", "KARNATAKA");
		
		Collection<String>values=indiaStates.values();
		iterator=values.iterator();
		while(iterator.hasNext()) {
			value=iterator.next();
			System.out.println(value);
		}

	}

}
