package coreexe;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		
		
		student.setId(78);
		student.setName("sowmya");
		student.setBranch("CSE");
		student.setCollegeName("amritasai");
		student.setSex('F');
		student.setTeluguMarks(80);
		
		student.setHindiMarks(80);
		student.setMathsMarks(90);
		student.setScienceMarks(90);
		student.setSocialMarks(80);
		
		
		System.out.println("Id :" + student.getId());
		System.out.println("Name :" + student.getName());
		System.out.println("Branch :" + student.getBranch());
		System.out.println("CollegeName :" + student.getCollegeName());
		System.out.println("Sex :" + student.getSex());
		System.out.println("TeluguMarks :" + student.getTeluguMarks());
		System.out.println("HindiMarks :" + student.getHindiMarks());
		
		System.out.println("MathsMarks :" + student.getMathsMarks());
		System.out.println("ScienceMarks :" + student.getScienceMarks());
		System.out.println("SocialMarks :" + student.getSocialMarks());
		
		StudentMain studentMain=new StudentMain();
		int langMarks=studentMain.getTotal(student.getTeluguMarks(), student.getHindiMarks());
		int nonLangMarks=studentMain.getTotal(student.getMathsMarks(), student.getScienceMarks(), student.getSocialMarks());
		System.out.println("Language Marks :"+langMarks);
		System.out.println("Non Language Marks :"+nonLangMarks);

	}
	public int getTotal(int Telugu,int Hindi) {
		return Telugu+Hindi;
	}
	public int getTotal(int Maths,int science,int Social) {
		return Maths+science+Social;
	}

}
