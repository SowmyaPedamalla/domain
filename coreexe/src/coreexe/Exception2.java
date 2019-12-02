package coreexe;

public class Exception2 {

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
			}
			if(errorMessage!="") {
				System.out.println("errorMessage");
			}else {
		
			System.out.println("avgmarks:"+avgMarks);
			}
			
			System.out.println("end");

	}

		public static float getAverageMarks(int totalMarks, int totalSubjects) {
			float avgMarks=0;
			try {
				avgMarks=totalMarks/totalSubjects;
			}catch(ArithmeticException ae) {
				throw ae;
			
			}catch(Throwable ex) {
				throw ex;
			}
			return avgMarks;
		}

}
