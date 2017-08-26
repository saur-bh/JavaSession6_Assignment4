/*
 * Create a class BankAtm with following properties and methods-
Properties: atmId; bankName;

location; balance
Methods: withdraw(double
amt) deposit(double amt)
 */
package com.acadglid.session;

public class BankAtm {

	private int atmID, bankName ;
	private String location ;

	private double balance;		//USer Balance


	static private double balanceATM = 100000.00;   // Bank ATM balance


	// getter and setter method for the variables 

	public int getAtmID() {
		return atmID;
	}

	public void setAtmID(int atmID) {
		this.atmID = atmID;
	}

	public int getBankName() {
		return bankName;
	}

	public void setBankName(int bankName) {
		this.bankName = bankName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getBalanceATM() {
		return balanceATM;
	}

	//Withdraw method

	void withdraw(double amount) throws BankATMException{

		try {

			if (balanceATM <10000) {

				throw new  BankATMException() ;
			}

			else {

				if ((balance>amount)&&(balance-amount>0)) {   //Check for user account having money to withdraw
					balanceATM = balanceATM -amount;  //subtract from bank Account
					balance = balance - amount;
				}
				else {
					System.out.println("You dont have sufficient balance in your account");
				}
			}
		} catch(BankATMException ex)
		{
			System.out.println(ex);     //Prints exception description
		}

	}

	// Function to deposite ammount

	void deposit( double amount) {

		balance = balance + amount;   //user Account
		balanceATM = balanceATM +amount;  // Bank Account 

	}

}
