package edu.ufp.inf.lp2.p04_bank;

public interface AccountsMoneyI {

    public double withdraw(double amount) throws OverWithdrawException;



    public double deposit(double amount) throws IllegalDepositException;

    public double transfer(AccountsMoneyI destination, double amount) throws IllegalDepositException;

    public double balance();

}
