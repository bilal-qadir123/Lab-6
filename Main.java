public class Main {
  public static void main(String[] args) {
      Bank bank = new Bank(); 

      Withdraw userA = new Withdraw(bank, "User A", 45000); 
      Withdraw userB = new Withdraw(bank, "User B", 20000); 

      userA.start(); 
      userB.start(); 
      
  }
}
