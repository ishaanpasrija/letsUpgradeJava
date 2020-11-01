package letsUpgare;

import java.time.Year;
import java.util.Scanner;

public class EmpSalary {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the employee:");
		String name = sc.next();
		int age = getAge();
		double salary = getSalary();
		double tax = getTax(salary);
		System.out.println("-------------");
		System.out.println("Name of the employee: " + name);
		System.out.println("Age of the employee: " + age);
		System.out.println("Annual Salary: " + salary);
		System.out.println("Tax amount: " + tax);
	}
	
	public static int getAge() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Day of birth: ");
		int date = sc.nextInt();
		
		System.out.println("Month of birth: ");
		int month = sc.nextInt();
		
		System.out.println("Year of birth: ");
		int year = sc.nextInt();
		
		int currentYear = Year.now().getValue();
		int age = (currentYear-year);
		return age;
	}
	
	public static double getSalary() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Monthly salary: ");
		double sal = sc.nextInt();
		double annualSal = (sal*12);
		
		return annualSal;
	}
	
	public static double getTax(double salary) {
		
		double tax = 0;
		if (salary < 300000) {
			tax = (salary*5)/100;
			
		}else if (salary >= 300000 && salary < 400000) {
			tax = (salary*10)/100;
			
		}else if (salary >= 400000 && salary < 500000) {
			tax = (salary*15)/100;
			
		}else if (salary >= 500000) {
			tax = (salary*20)/100;
		}
		return tax;
	}
}
