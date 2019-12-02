

public class Exception {

	public static void main(String[] args) {
		int totalMarks=500;
		int totalSubjects=6;
		float avgMarks=0;
		String errorMessage="";
		System.out.println("start");
		
		try {
			System.out.println("try:to write a doubtable code");
			avgMarks=totalMarks/totalSubjects;
		}catch(ArithmeticException ae) {
			System.out.println("catch:to catch and handle the exception");
			errorMessage="service had an issue.please try again later";
		}finally {
			System.out.println("finally:to nullyfying the objects and can be executed always");
		}
		if(errorMessage!="") {
			System.out.println("errorMessage");
		}else {
	
		System.out.println("avgmarks:"+avgMarks);
		}
		
		System.out.println("end");

	}

}
