package week3.day2.assignments;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student Id is" +" "+ id);
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student Id is"+" "+ id);
		System.out.println("Student name is"+ " "+ name);
		
		
	}
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("Student email is"+ " "+ email);
		System.out.println("Student phone number is"+ " "+ phoneNumber);
		
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(13);
		obj.getStudentInfo(13, "Divya");
		obj.getStudentInfo("mdivyacivil13@gmail.com", 9390184347L);
		

	}

}
