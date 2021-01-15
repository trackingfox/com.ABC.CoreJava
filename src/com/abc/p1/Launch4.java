package com.abc.p1;

import java.util.Scanner;

public class Launch4 {
	public static void main(String[] args) {

		Runnable r1 = () -> {
			System.out.println("Banking started");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the account number");
			int an = scan.nextInt();
			System.out.println("Enter the password");
			int pw = scan.nextInt();
			System.out.println("Colect your money");
			System.out.println("Banking completed");
		};

		Runnable r2 = () -> {
			System.out.println("Printing started");
			for (int i = 1; i <= 5; i++) {
				System.out.println("Agasthya");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// auto generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("Printing completed");
		};

		Runnable r3 = () -> {
			System.out.println("Addition started");
			System.out.println("Enter the number");
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			System.out.println("Enter the number");
			int num2 = scan.nextInt();
			int num3 = num1 + num2;
			System.out.println(num3);
			System.out.println("Addition completed");
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);

		t1.start();
		t2.start();
		t3.start();

	}
}