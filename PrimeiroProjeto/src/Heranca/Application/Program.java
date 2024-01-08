package Heranca.Application;

import Heranca.Entities.Account;
import Heranca.Entities.BusinessAccount;
import Heranca.Entities.SavingsAccount;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        // UPCASTING
        // conta empresario é uma conta
        Account acc1 = bacc;
        acc1.getBalance();
        Account acc2 = new BusinessAccount(1003, "Bobby", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCAST
        BusinessAccount acc4 = (BusinessAccount) acc2; // vai ter que fazer a coversão com cast
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; 
        if(acc3 instanceof BusinessAccount){
          BusinessAccount acc5 = (BusinessAccount) acc3;
          acc5.loan(200.0); 
          System.out.println("LOAN!!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance(0);
            System.out.println("Update!");
        }
    }
}