public class Main {
  public static void main(String[] args) throws InterruptedException {
    int threadCount = 4;

    System.out.println("Создаю потоки...");
    ThreadGroup tg = new ThreadGroup("tg");
    for (int i = 1; i <= threadCount; i++) {
      new MyThread(tg, i + "").start();
    }
    Thread.sleep(15000);
    tg.interrupt();
    System.out.println("Завершаю все потоки.");
  }
}
