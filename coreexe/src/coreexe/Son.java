package coreexe;



public class Son extends Father {

	public static void main(String[] args) {
	Father father =new Son();
	float amountToSon=father.getAmount(40);
	System.out.println("Amount to son: "+amountToSon);
	}

	@Override
	public float getAmount(int percentage) {
	
	return (super.credits-super.debits)*percentage/100;
	}

}