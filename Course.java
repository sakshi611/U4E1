package U4E1;
import java.util.Scanner;
public class Course {

	  int courseId;
	  String courseName;
	  int courseFee;
	
	  void displayCourseDetails(int courseId,String courseName,int courseFee) {
		  System.out.println("course id is "+courseId+" courseName is "+courseName+" courseFee is "+courseFee);
		  
	  }
	  
	  static void authenticate(String username, String password) {
		  if(username=="Admin" && password=="1234") {
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter courseId:");
			  int courseId = sc.nextInt();
			  System.out.println("Enter courseName:");
			  String courseName = sc.next();
			  System.out.println("Enter courseFee:");
			  int courseFee = sc.nextInt();
			  
			  Course co = new Course();
			  co.displayCourseDetails(courseId,courseName,courseFee);
			  
//			  System.out.println(courseId+courseName+courseFee);
		  }
		  else {
			  System.out.println("Invalid Username or password");
		  }
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		authenticate("Admin","1234");
		authenticate("Sakshi","123");

	}

}
