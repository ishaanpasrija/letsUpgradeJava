package letsUpgare;

import java.util.Scanner;

public class OddValue {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println("Enter a number: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("Odd values are: ");
		for(int i=0; i<5; i++) {
			if(numbers[i]%2!=0) {
				System.out.println(numbers[i]);
			}
		}
		
		//anoter approach
//		for(int num : numbers) {
//			if(num%2!=0) {
//				System.out.println(num);
//			}
//		}
		
	}
	
}
