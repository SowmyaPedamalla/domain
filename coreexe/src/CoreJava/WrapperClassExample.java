package CoreJava;

public class WrapperClassExample {

	public static void main(String[] args) {
		int intDT=127;
		short shortDT=(short) intDT;
		System.out.println("shortDT:"+shortDT);

		
		
		short shortDT1=1000;
		long longDT1= shortDT1;
		System.out.println("shortDT1:"+shortDT1);
		
		
		char charDT2=200;
		float floatDT2=charDT2;
		System.out.println("charDT2:"+charDT2);
		
		
		float floatDT3=250;
		short shortDT3= (short)floatDT3;
		System.out.println("shortDT3:"+shortDT3);
		
		
		double doubleDT4=500;
		float floatDT4=(float)doubleDT4;
		System.out.println("floatDT4:"+floatDT4);
		
		
		long longDT5=700;
		double doubleDT5=longDT5;
		System.out.println("doubleDT5:"+doubleDT5);
		
		
		long longDT6=100000;
		int intDT6=(int)longDT6;
		System.out.println("intDT6:"+intDT6);
		
		
		double doubleDT7=100000;
		long longDT7=(long)doubleDT7;
		System.out.println("longDT7:"+longDT7);
		
		
		float floatDT8=4000;
		byte byteDT8=(byte)floatDT8;
		System.out.println("byteDT8:"+byteDT8);
		
		
		
		
		
		

	}

}
