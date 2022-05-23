package U4E1;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	Student(){}
	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber){
		this.rollNumber =rollNumber;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName){
		this.studentName =studentName;
	}
	
	public String getMarks() {
		return studentName;
	}

	public void setMarks(int marks){
		this.marks =marks;
	}
	
	public void showDetails() {
		 System.out.println("Student Roll Number:"+rollNumber);
		 System.out.println("Student Name: "+studentName);
		 System.out.println("Student Mark: "+marks);
		 System.out.println("==============================");
	}
	
	
}
