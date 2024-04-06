package edu.ufp.inf.lp2.p04_bank;

import java.util.Objects;

public abstract class Account implements AccountsMoneyI, AccountOwnershipsI {
    private String accountNumber;

    private double balance;

    private Client owner;

    public Account() {
    }

    public Account(String accountNumber, double balance, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double balance() {
        return balance;
    }

    public abstract double withdraw(double amount) throws OverWithdrawException;

    public abstract double deposit(double amount) throws IllegalDepositException;

    public abstract double transfer(AccountsMoneyI destination, double amount) throws IllegalDepositException;

    @Override
    public Client getAccountOwner() {
        return this.owner;
    }

    @Override
    public void setAccountOwner(Client owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(accountNumber, account.accountNumber) && Objects.equals(owner, account.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, owner);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", owner=" + owner +
                '}';
    }


    public static void main(String[] args) {

    }

}
