package CoreJava;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder fullnameSB=new StringBuilder("");
		System.out.println(fullnameSB+", "+fullnameSB.hashCode());
		
		fullnameSB.append("Sowmya ");
		System.out.println(fullnameSB+", "+fullnameSB.hashCode());
		
		fullnameSB.append(" Sree");
		System.out.println(fullnameSB+" ,"+fullnameSB.hashCode());
		
		fullnameSB.append(" Pedamalla");
		System.out.println(fullnameSB+" ,"+fullnameSB.hashCode());
		
		fullnameSB.insert(0,"TEST");
		System.out.println(fullnameSB+" ,"+fullnameSB.hashCode());
		
		fullnameSB.delete(2,4);
		System.out.println(fullnameSB+" ,"+fullnameSB.hashCode());
		
		fullnameSB.reverse();
		System.out.println(fullnameSB+" ,"+fullnameSB.hashCode());
		
		
		
		
		
		

	}

}
