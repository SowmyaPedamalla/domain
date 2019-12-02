package CoreJava;

public class WrapperExample1 {

	public static void main(String[] args) {
		byte byteDT=127;
		int intDT=byteDT;
		System.out.println("intDT:"+intDT);

		
		
		int intDT2=125;
		byte byteDT2=(byte)intDT2;
		System.out.println("byteDT2:"+byteDT2);
		
		
		if(intDT>= Byte.MIN_VALUE&&intDT2<=Byte.MAX_VALUE);
		byte byteDT3=Byte.parseByte(""+intDT2);
		System.out.println("Byte Converted Value:"+byteDT3);
		

	}

}
