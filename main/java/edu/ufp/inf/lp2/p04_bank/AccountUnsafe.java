package edu.ufp.inf.lp2.p04_bank;

public class AccountUnsafe extends Account {

    public AccountUnsafe(){

    }

    public AccountUnsafe(String an, double b, Client o){
        super(an, b, o);
    }

    @Override
    public double withdraw(double amount) {
        super.setBalance(super.getBalance()-amount);
        return super.balance();
    }

    @Override
    public double deposit(double amount) {
        super.setBalance(super.getBalance()+amount);
        return super.balance();
    }

    @Override
    public double transfer(AccountsMoneyI destination, double amount) throws IllegalDepositException {
        double balance = this.withdraw(amount);
        destination.deposit(amount);
        return balance;
    }
}
