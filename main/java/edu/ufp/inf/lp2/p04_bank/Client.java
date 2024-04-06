package edu.ufp.inf.lp2.p04_bank;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;
import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Person;

import java.util.ArrayList;
import java.util.Objects;

public class Client extends Person{

    private String vatNumber;

    private  ArrayList <Account> accounts = new ArrayList<>();

    public Client() {
    }

    public Client(String idNumber, String name, String adress, Date birth, String vatNumber) {
        super(idNumber, name, adress, birth);
        this.vatNumber = vatNumber;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "vatNumber='" + vatNumber + '\'' +
                ", accounts=" + accounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(vatNumber, client.vatNumber) && Objects.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), vatNumber, accounts);
    }


    public Account getAccount(int index){
        return accounts.get(index);
    }

    public void listAccounts(){
        for (Account account : accounts) {
            System.out.println(account.getAccountNumber());
        }
    }

    public void addAccount(Account newAccount){
        accounts.add(newAccount);
    }

    public static void main(String[] args) {

    }
}
