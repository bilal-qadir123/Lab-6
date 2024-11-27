public class Print extends Thread {
  PrintJob printJob;
  int pages;

  public Print(PrintJob printJob, int pages) {
      this.printJob = printJob;
      this.pages = pages;
  }

  public void run() {
    printJob.addPages(pages); 
    printJob.printPages(pages);
      
  }
}
  