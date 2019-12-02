
package coreexe;


public class Son1 implements Father1,Mother1{

		public static void main(String[] args) {
			Father1 father1=new Son1();
			float amountfromFather=father1.getAmountFromFather(60);
			Mother1 mother1=new Son1();
			float amountfromMother=mother1.getAmountFromMother(80);
			System.out.println("amountFromFather: "+ amountfromFather);
			System.out.println("amountFromMother: "+amountfromMother );
			 
			
			

		}

		@Override
		public float getAmountFromFather(int percentage) {
			return (Father1.credits-Father1.debits)*percentage/100;
			
		}

		@Override
		public float getAmountFromMother(int percentage) {
			return (Mother1.credits-Mother1.debits)*percentage/100;

	}

}
