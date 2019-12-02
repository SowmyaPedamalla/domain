package coreexe;

public class LoopingStatements {

	public static void main(String[] args) {
		int fortotal=0;
		for(int index=7;index<=100;index++) {
			fortotal=fortotal+index;
		}
		System.out.println("fortotal: "+fortotal);
		
		
		int whileTotal=0;
		int whileindex=7;
		while(whileindex<=100) {
			whileTotal=whileTotal+whileindex;
			whileindex++;
		}
		System.out.println("whileTotal:"+whileTotal);
		int dowhileTotal=0;
		int dowhileindex=7;
		do {
			dowhileTotal=dowhileTotal+dowhileindex;
			dowhileindex++;
		}while(dowhileindex<=100);
		System.out.println("dowhileTotal:"+dowhileTotal);
		

	}

}
