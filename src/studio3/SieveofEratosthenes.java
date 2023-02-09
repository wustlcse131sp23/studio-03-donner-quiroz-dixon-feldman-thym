package studio3;

import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What number are you using?");
		int number = in.nextInt();
		int[] prime = new int [number+1];
		for (int i = 0; i < prime.length-1; i++) {
			prime[i] = i+1;
		}
		for (int i = 0; i < prime.length-1; i++) {
			if (prime[i] % prime[i] == 0 && prime[i] % 1 == 0) {
				System.out.println(prime[i] + " is prime");
			}
		}
	
	}

	
	
}
