package coreexe;

public class Sem1 {
	int a,b,c,d,avg1;
	Sem1()
	{
		a=80;
		b=90;
		c=80;
		d=70;
		avg1=(a+b+c+d)/4;
	}
	

}
class Sem2 extends Sem1{
	int a1,b1,c1,d1,avg2;
	Sem2()
	{
		a1=78;
		b1=88;
		c1=87;
		d1=80;
		avg2=(a1+b1+c1+d1)/4;
				
	}
}
class Sem3 extends Sem2{
	int a2,b2,c2,d2,avg3;
	Sem3()
	{
		a2=80;
		b2=90;
		c2=90;
		d2=75;
		avg3=(a2+b2+c2+d2)/4;
	}

	int totalavg()
	{
		return(avg1+avg2+avg3)/3;
	}
}
	