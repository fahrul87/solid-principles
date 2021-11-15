package com.fahrul.solid.dip;

public class CreditCard implements BankCard {

	@Override
	public void doTransaction(Long amount) {
		System.out.println("payment using Credit card");

	}

}
