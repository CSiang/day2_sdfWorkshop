package nus.iss.tfip;

import java.util.Date;

public class BankAccount {
    private final String accountNo;  // "final" means that once created, it can't be changed.
    private String fullName;
    private double balance=0.0;
    private boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;

    public String getAccountNo() { // because we use the "final" keyword, so there is not setAccountNo because it can't be changed.
        return accountNo;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }
    
    public BankAccount(String accountNo, String fullName, double balance, boolean isActive, Date accountStartDate,
            Date accountEndDate) {
        this.accountNo = accountNo;
        this.fullName = fullName;
        this.balance = balance;
        this.isActive = isActive;
        this.accountStartDate = accountStartDate;
        this.accountEndDate = accountEndDate;
    }

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void showAccount() {
        System.out.println("Accout No: "+ accountNo);
        System.out.println("Fullname: " + fullName);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if(!isActive) {
            throw new IllegalArgumentException("You can't deposit into a closed account.");
        }

        if (amount<0) {
            throw new IllegalArgumentException("You can't make negative deposit.");
        } else {
            this.balance = this.balance + amount;
        }  
    }

    public void withdraw(double amount) {
        if(!isActive) {
            throw new IllegalArgumentException("You can't make withdrawal out of closed account.");
        }

        if(balance<amount){
            throw new IllegalArgumentException("You balance is less than "+ amount);
        } else { 
            this.balance = this.balance - amount;
        }
    }

    


}

