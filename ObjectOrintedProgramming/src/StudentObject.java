class Student {
	String name;
	String Branch;
	String RollNo;
	int Semester;
	String Collagename;
	int mathMarks;
	int CMarks;
	int JavaMarks;
	boolean isPlaced ;
	
	public void BasicDetail() {
		System.out.println("Name : " + name);
		System.out.println("Branch : " + Branch);
		System.out.println("RollNo : " + RollNo);
		System.out.println("Semester : " + Semester);
		System.out.println("Collagename " + Collagename);
		System.out.println("Ispaced " + isPlaced);
	}
	
	public double average() {
		return (mathMarks+ JavaMarks+CMarks)/3;
	}
	
	public boolean placed() {
		return isPlaced;
	}
	public String passedornot() {
		if(average()>50) {
			return  "Passed.";
		}
		else {
			return "Failed.";
		}
	}
}


public class StudentObject {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.name="Shivank Pandey";
		obj.Branch="Artificial intelligence.";
		obj.RollNo="0108AI211053";
		obj.Collagename="Samrat Ashok Technological Institute Vidisha.";
		obj.Semester=8;
		obj.isPlaced=true;
		obj.mathMarks=50;
		obj.CMarks=60;
		obj.JavaMarks=80;
		
		obj.BasicDetail();
		System.out.println(obj.average());
		System.out.println(obj.passedornot());
		
		
		
	}

}
