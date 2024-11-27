public class PrintJob {
  int totalPages = 10;

  public synchronized void printPages(int pages) {
      while (pages > totalPages) {
          System.out.println("Not enough pages to print " + pages + ". Waiting for more pages...");
          try {
              wait();
          } catch (InterruptedException e) {
              System.out.println(e.getMessage());
          }
      }
      totalPages -= pages;
      System.out.println(pages + " pages printed. Printer Job done. Remaining pages: " + totalPages);
  }

  public synchronized void addPages(int pages) {
      totalPages += pages;
      System.out.println(pages + " pages added. Total pages now: " + totalPages);
      notifyAll();
  }
}
