public class Withdraw extends Thread {
  Bank bank; 
  String account; 
  double amount; 

  public Withdraw (Bank bank, String account, double amount) { 
    this.bank = bank; 
    this.account = account; 
    this.amount = amount; 
  } 

  public void run () { 
    bank.withdraw(account, amount); 
  } 
}
