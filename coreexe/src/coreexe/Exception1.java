package coreexe;

public class Exception1 {

	public static void main(String[] args) {
		int totalMarks=500;
		int totalSubjects=0;
		float avgMarks=0;
		String errorMessage="";
		System.out.println("start");
		
		try {
			avgMarks=getAverageMarks(totalMarks,totalSubjects);
		}catch(ArithmeticException ae) {
			errorMessage="service had an issue.please try again later";
		}catch(Throwable ex) {
			errorMessage="service had an issue.please try again later";
		}finally {
			
		
		if(errorMessage!="") {
			System.out.println("errorMessage");
		}else {
	
		System.out.println("avgmarks:"+avgMarks);
		}
		
		System.out.println("end");

	}
	}

	public static float getAverageMarks(int totalMarks,int totalSubjects)throws ArithmeticException,Throwable {
		return totalMarks/totalSubjects;
	}

}
