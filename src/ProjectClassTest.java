public class ProjectClassTest {
	public static void main(String[] args) {
		ProjectClass iD = new ProjectClass();
		String NonameNoDesc = iD.Project();
		String nameNoDesc = iD.Project("First Project");
		String nameAndDesc = iD.Project("Big Project" , "This is guna be Huge!");
		System.out.println(NonameNoDesc);
		System.out.println(nameNoDesc);
		System.out.println(nameAndDesc);



	}

}