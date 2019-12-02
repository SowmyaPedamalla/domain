package coreexe;



public class Daughter extends Father {

	public static void main(String[] args) {
		

	
		
	Father father =new Daughter ();
	float amountToDaughter=father.getAmount(60);
	System.out.println("Amount to :Daughter "+amountToDaughter);
	}

	@Override
	public float getAmount(int percentage) {
	
	return (super.credits-super.debits)*percentage/100;
	}
	

}