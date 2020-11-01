package letsUpgare;

import java.util.Scanner;

public class AddValue {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("Enter a number: ");
			numbers[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum = sum + numbers[i];
		}
		
		//another approach
//		for(int num : numbers) {
//			sum = sum + num;
//		}
		
		System.out.println("Addition of values: "+sum);
	}
	
}
