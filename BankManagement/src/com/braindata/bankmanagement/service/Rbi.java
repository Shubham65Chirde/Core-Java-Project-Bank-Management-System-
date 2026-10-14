package com.braindata.bankmanagement.service;

public interface Rbi {

	public void createAccount();
	public void displayAllDetails();
	public void depositeMoney();
	public void withrawal()throws CheckWithrawal;
	public void balanceCheck();
}
