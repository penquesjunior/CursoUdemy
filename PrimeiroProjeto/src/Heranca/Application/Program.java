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

        //BusinessAccount acc5 = (BusinessAccount) acc3; DEU ERRO DIRETO COMO EVITAR ?
        //NESSE METODO DO INSTANCEOF TU TESTA O DESVIO SE FOR ENTRA SE NAO SAI.
        //evitando o porblema
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


        //EXEMPLO @OVERRIDE 
        Account acc6 = new Account(1005, "luiz", 1000.0);
        acc6.withdraw(200.0);
        System.out.println("account $" + acc6.getBalance());

        Account acc7 = new SavingsAccount(1006, "Baldao", 1000.00, 0.01);
        acc7.withdraw(200.0);
        System.out.println("Savings account $" + acc7.getBalance());

        Account acc8 = new BusinessAccount(1007, "yas", 1000.00, 500.0);
        acc8.withdraw(200.00);
        System.out.println("business account $" + acc8.getBalance());
    }
}