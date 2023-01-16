package nus.iss.tfip;

public class FixedAcc extends BankAccount {

    public static double interest = 3.0; // we use double type bcoz previous numbers all are double.
    public static double duration = 6.0; // we can't multiple 2 number with diff data type (e.g. int times double is not allowed.)

        public FixedAcc(String accountNo, double balance) {
            super(accountNo, balance); // This is needed for child class.
        //TODO Auto-generated constructor stub
    }

    @Override
    public void deposit(double amount) {
        System.out.println("No operation.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("No operation.");
    }

    @Override
    public void showAccount() {
        // bcoz this is a child class, it doesn't have these attributes (accountNo, fullName etc), 
        // hence have to use getter to get info.
        System.out.println("Accout No: "+ this.getAccountNo()); 
        System.out.println("Fullname: " + this.getFullName());
        System.out.println("Balance: " + this.getBalance()*((100 + interest)/100) );
    }
    
}
