package com.acadglid.session;

//Exception class which will throw message when balance is less then 10000
public class BankATMException extends Exception{

	BankATMException(){

		System.out.println("Withdrawal can not be done as balance is less then 10000");
	}

}
