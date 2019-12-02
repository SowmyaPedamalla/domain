package CoreJava;

public class StringReverseCharArray {

	public static void main(String[] args) {
String fullname= "";
		
		System.out.println(fullname+";"+fullname.hashCode());
		fullname += "Sowmya";
		System.out.println(fullname+";"+fullname.hashCode());
		fullname += " Sree";
		System.out.println(fullname+";"+fullname.hashCode());
		fullname += " Pedamalla";
		System.out.println(fullname+";"+fullname.hashCode());
		
		char charDT;
		int length=fullname.length();
		for(int index= length-1;index>=0;index--) {
			charDT=fullname.charAt(index);
			System.out.println(charDT);

	}
	}
}


