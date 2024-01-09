package Heranca.Entities;

//public final class SavingsAccount extends Account {
    //exemplo que quando coloco o final na classe ele nao pode ter subclasses
public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(double amount){
        balance += balance * interestRate;
    }

    @Override
  //  public final void withdraw(double amount){
    //quando nao quer que reutilize o metodo
    public void withdraw(double amount){
        balance -= amount;
    }

}
