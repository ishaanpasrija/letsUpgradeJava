package letsUpgare;

import java.util.Scanner;

public class SubjectsMarks {
	
	public static void main(String args[]) {
		
		int i;
		int intArray[] = new int[5];
		float num =0;
        float percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Marks obtained in 5 subjects :");
		
		for (i=0; i<5; i++) {
			intArray[i] = sc.nextInt();
			num = num + intArray[i];
		}
		
		percentage = (num/500) *100;
		
		System.out.println("percentage of all 5 subjects is : "+ percentage +"%");
		
		if (percentage < 70) {
			System.out.println("Grade is D");
			
		}else if (percentage >= 70 && percentage < 80) {
			System.out.println("Grade is C");
			
		}else if (percentage >= 80 && percentage < 90) {
			System.out.println("Grade is B");

		}else if (percentage >= 90) {
			System.out.println("Grade is A");

		}
	}

}
