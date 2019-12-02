package CoreJava;

public class StringEx {

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
		for(int index= 0;index<fullname.length();index++) {
			charDT=fullname.charAt(index);
			System.out.println(charDT);
		}

	}

}
