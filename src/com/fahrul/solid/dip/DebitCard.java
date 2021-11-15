package com.fahrul.solid.dip;

public class DebitCard implements BankCard {

	@Override
	public void doTransaction(Long amount) {
		System.out.println("payment using Debit card");

	}

}
