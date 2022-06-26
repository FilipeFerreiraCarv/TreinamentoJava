package entities;

import exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdraw) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdraw) {
		this.withdrawLimit = withdraw;
	}
	
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		if(value > balance) {
			throw new DomainException("Não possui saldo suficiente para efetuar o saque.");
		}
		if(value > withdrawLimit) {
			throw new DomainException("Solicitação de saque maior que o limite permitido");
		}
		else {
			balance -= value;
		}
	}
}
