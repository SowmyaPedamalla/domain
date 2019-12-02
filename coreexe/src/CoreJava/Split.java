package CoreJava;

public class Split {

	public static void main(String[] args) {
		String s1="welcome to the new world";
		String[] words= s1.split("\\s");
		for(String W:words) {
			System.out.println(W);
		}

	}

}
