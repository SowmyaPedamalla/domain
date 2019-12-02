package CoreJava;

public class StringExample {

	public static void main(String[] args) {
		String s1="sowmya";
		String s2= new String("Sowmya");
		
		System.out.println(s1.hashCode()+"and"+s2.hashCode());
		if(s1==s2) {
			System.out.println("both objects hash code are equal");
		}if(s1.equals(s2)) {
			System.out.println("both the objects values are equal and it is case sensitive");
		}if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both the objects values are equal and it is case insensitive");
		}

	}

}
