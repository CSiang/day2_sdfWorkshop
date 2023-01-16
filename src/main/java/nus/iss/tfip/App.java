package nus.iss.tfip;

import java.util.Random;
import java.util.UUID;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcomg to banking." );
 
        int n =3;
        BankAccount[] bankAccount = new BankAccount[n];

        for (int i=0; i < bankAccount.length; i++ ) {
            String uuid = UUID.randomUUID().toString();

            double max = 10000.00;
            double min = 1000.00;

            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble();

            bankAccount[i] = new FixedAcc(uuid, initialBalance); // FixedAcc is still a kind of BankAccount
                                                                 // Hence we can declare it as type of BankAccount, 
                                                                 // but create it as FixedAcc to use its specific function.
            
        }

        bankAccount[0].setFullName("A");
        bankAccount[1].setFullName("B");
        bankAccount[2].setFullName("C");
        
        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].deposit(1000);
        bankAccount[1].deposit(2000);
        bankAccount[2].deposit(300);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].withdraw(3000);
        bankAccount[1].withdraw(1000);
        bankAccount[2].withdraw(500);

        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();


    }
}
