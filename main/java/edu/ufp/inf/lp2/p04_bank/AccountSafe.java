package edu.ufp.inf.lp2.p04_bank;

public class AccountSafe extends Account {

    public AccountSafe(){

    }

    public AccountSafe(String an, double b, Client o){
        super(an, b, o);
    }

    @Override
    public double withdraw(double amount) throws OverWithdrawException {
        if (super.getBalance()>amount) {
            super.setBalance(super.getBalance() - amount);
            return super.balance();
        }
            throw new OverWithdrawException("Not enough money to withdraw");
    }

    @Override
    public double deposit(double amount) throws IllegalDepositException {
        super.setBalance(super.getBalance()+amount);
        return super.balance();
    }

    @Override
    public double transfer(AccountsMoneyI destination, double amount) {
        double balance = 0;
        try {
            balance = this.withdraw(amount);
            destination.deposit(amount);
        } catch (Exception e) {
            System.out.println(e);
        }
        return balance;
    }

}
