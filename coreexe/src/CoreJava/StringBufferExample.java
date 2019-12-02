package CoreJava;

public class StringBufferExample {


	public static void main(String[] args) {
		String name = "sowmya";
		name=name.concat(" pedamalla");
		System.out.println(name);
		StringBuffer fullname=new StringBuffer("");
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.append("Sowmya ");
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.append("Sree");
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.append("Pedamalla");
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.insert(0, "TEST");
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.delete(0,2);
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.reverse();
		System.out.println(fullname+", "+fullname.hashCode());
		
		fullname.replace(2, 4, "z");
		System.out.println(fullname+" ,"+fullname.hashCode());
		
		

	}

}
