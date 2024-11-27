public class Main {
  public static void main(String[] args) {
      Bank bank = new Bank(); 

      Withdraw userA = new Withdraw(bank, "UserA", 45000); 
      Withdraw userB = new Withdraw(bank, "UserB", 30000); 

      userA.start(); 
      userB.start(); 
      
  }
}
