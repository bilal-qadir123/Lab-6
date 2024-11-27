public class Bank extends Thread {
  float totalAmount = 50000; 
  double amount; 
  
  public void withdraw (String account, double amount) { 
    synchronized (Bank.class) { 
      System.out.println(account + " is trying to withdraw " + amount); 
      if (amount <= totalAmount) { 
        try { 
          Thread.sleep(100); 
        } 
        catch (InterruptedException e) {
          System.out.println(e.getMessage());
        }
        System.out.println(amount + " withdrawn" + " by " + account); 
        totalAmount -= amount; 
        System.out.println(account + " withdrew " + amount + ". Remaining balance: " + totalAmount); 
      } 
      else { 
        System.out.println("Insufficient account balance"); 
        System.out.println("Remaining balance: " + totalAmount); 
      } 
    } 
  }
}
