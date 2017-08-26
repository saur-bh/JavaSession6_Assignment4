package com.acadglid.session;

import java.util.Scanner;

public class Assignment4 {

	
	// Function to collect user data and display the amount

	static void userInfo(BankAtm user) {

		System.out.println("What operation you want to do in ATM : ");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		if (choice==1) {
			System.out.println("Enter the amount to be withdraw :");

			try {
				user.withdraw(sc.nextInt());

			} catch (BankATMException e) {

				e.printStackTrace();
			}
		}

		if(choice==2) {
			System.out.println("Enter the amount want to deposit in your account:");
			user.deposit(sc.nextInt());  //This will deposit in user account and also will increase the bank ATM account 

		}

		System.out.println(" The user account balance is now : " +user.getBalance());

		System.out.println(" The Bank account balance is now : " +user.getBalanceATM());

	}


	public static void main(String[] arg) {


		BankAtm user1 = new BankAtm(); // Create bank user 1
		BankAtm user2 = new BankAtm(); // Create User 2
		BankAtm user3 = new BankAtm();

		//User 1 

		user1.setBalance(20000);
		userInfo(user1);

		//User 2 
		user2.setBalance(300000);
		userInfo(user2);


		//User 3 
		user3.setBalance(1000000);
		userInfo(user3);








	}






}
