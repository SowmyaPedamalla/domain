package Corejava1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {

	public static void main(String[] args) {
		List<String> southStates=new ArrayList<String>();
		southStates.add("AP");
		southStates.add("TN");
		southStates.add("KL");
		southStates.add("KN");
		southStates.add("TG");
		southStates.add("null");
		southStates.add("KL");
		
		System.out.println("southStates:" +southStates);
		
		
		List<String>northStates=new ArrayList<String>();
		northStates.add("OD");
		northStates.add("WB");
		northStates.add("MH");
		northStates.add("PB");
		northStates.add("GT");
		
		System.out.println("northStates:" +northStates);
		List<String>i=northStates;
		int s=i.hashCode();
		System.out.println("hashcode:"+s);
		
		List<String>IndianStates=new ArrayList<String>();
		IndianStates.addAll(southStates);
		IndianStates.addAll(0,northStates);
		Collections.sort(IndianStates);
		
		System.out.println("IndianStates:" +IndianStates);
		
		Iterator <String> iterator=IndianStates.iterator();
		String statecode="";
		while (iterator.hasNext()){
			statecode=(String)iterator.next();
			System.out.println("statecode:" +statecode);
		

	}

}
}
