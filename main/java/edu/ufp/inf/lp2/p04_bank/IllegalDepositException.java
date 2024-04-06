package edu.ufp.inf.lp2.p04_bank;

public class IllegalDepositException extends Exception {

    public IllegalDepositException() {
    }

    public IllegalDepositException(String message) {
        super(message);
    }
}
