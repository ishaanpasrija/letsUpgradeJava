package letsUpgare;

import java.util.Scanner;

public class Avenger {
	
	Scanner sc = new Scanner(System.in);
	String name,power,weapon,planet ;
	int age;
	
	public static void main(String args[]) {
		
		Avenger[] avengers = new Avenger[5];
		
		for(int i=0; i<5; i++) {
			avengers[i] = new Avenger();
		}
		
		//get details
		for(int i=0; i<5; i++) {
			System.out.println("-------------");
			avengers[i].getDetails();
		}
		
		//display details
		for(int i=0; i<5; i++) {
			System.out.println("-------------");
			avengers[i].displayDetails();
		}
		
	}
	
	public void getDetails() {
			
		System.out.println("Enter name of an Avenger: ");
		name = sc.next();
		
		System.out.println("Enter power of an Avenger: ");
		power = sc.next();
		
		System.out.println("Enter weapon of an Avenger: ");
		weapon = sc.next();
		
		System.out.println("Enter age of an Avenger: ");
		age = sc.nextInt();
		
		System.out.println("Enter planet of an Avenger: ");
		planet = sc.next();
	}

	public void displayDetails() {
		
		System.out.println("Name: " + name);
		System.out.println("Power: " + power);
		System.out.println("Weapon: " + weapon);
		System.out.println("Age: " + age);
		System.out.println("Planet: " + planet);
	}
}
