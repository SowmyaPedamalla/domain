package Corejava1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> southStates=new TreeSet<String>();
		southStates.add("AP");
		southStates.add("TN");
		southStates.add("KL");
		southStates.add("KN");
		southStates.add("TG");
		southStates.add("null");
		southStates.add("null");
		southStates.add("KL");
		southStates.add("KL");
		
		
		System.out.println("southStates:" +southStates);
		
		
		Set<String>northStates=new TreeSet<String>();
		northStates.add("OD");
		northStates.add("WB");
		northStates.add("MH");
		northStates.add("PB");
		northStates.add("GT");
		
		System.out.println("northStates:" +northStates);
		Set<String>i=northStates;
		int s=i.hashCode();
		System.out.println("hashcode:"+s);
		
		Set<String>IndianStates=new TreeSet<String>();
		IndianStates.addAll(southStates);
		IndianStates.addAll(northStates);
		//Collections.sort(IndianStates);
		
		System.out.println("IndianStates:" +IndianStates);
		
		Iterator <String> iterator=IndianStates.iterator();
		String statecode="";
		while (iterator.hasNext()){
			statecode=(String)iterator.next();
			System.out.println("statecode:" +statecode);
		

	}

}
}
