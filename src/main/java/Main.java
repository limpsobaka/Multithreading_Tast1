public class Main {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Создаю потоки...");
    ThreadGroup tg = new ThreadGroup("tg");
    for (int i = 1; i < 5; i++) {
      new MyThread(tg, i + "").start();
    }
    Thread.sleep(15000);
    tg.interrupt();
    System.out.println("Завершаю все потоки.");
  }
}
