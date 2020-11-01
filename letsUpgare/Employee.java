package letsUpgare;

public class Employee {
	
	String name;
	int age;
	String city;
	
	public void userDetails(String name, int age, String city){
		
		System.out.println("The name is "+ name);
		System.out.println("The age is "+ age);
		System.out.println("The city is "+ city);
	}
	
	public static void main(String args[]) {
		
		Employee e1 = new Employee();
		e1.userDetails("Saurbah", 23, "chennai");
		Employee e2 = new Employee();
		e2.userDetails("Ishaan", 24, "panchkula");
				
	}

}
