package coreexe;

public class DataTypes {

	public static void main(String[] args) {
		byte b1=10;
		byte b2=20;
		int b3=b1*b2;
		System.out.println("multiplication of two byte numbers" +b3);
		
		
		short s1=200;
		short s2=300;
		int s3=s1+s2;
		System.out.println("addition of two short numbers" +s3);
		
		
		int i1=2000;
		int i2=1000;
		int i3=i1-i2;
		System.out.println("subtraction of two int numbers" +i3);
		
		
		long l1=1234567890;
		long l2=987654321;
		long l3=l1-l2;
		System.out.println("subtraction of two long numbers" +l3);
		
		
		float f1=100.345f;
		float f2=200.234f;
		float f3=f1+f2;
		System.out.println("addition of two float numbers" +f3);
		
		
		double d1=200.00000000;
		double d2=400.00000000;
		double d3=d1/d2;
		System.out.println("division of two double numbers" +d3);
		
		
		
		
		char ch1='F';
		System.out.println("character is:"+ch1);
		
		
		boolean bl1=true;
		if(bl1==false)
			System.out.println("boolean value is false");
		else
			System.out.println("boolean value is true");
			
		

	}

}
