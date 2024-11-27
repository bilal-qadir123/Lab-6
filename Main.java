public class Main {
  public static void main(String[] args) {
      PrintJob printJob = new PrintJob();

      Thread printThread = new Thread(() -> printJob.printPages(15));
      Thread addPagesThread = new Thread(() -> printJob.addPages(10));

      printThread.start();
      addPagesThread.start();
  }
}
