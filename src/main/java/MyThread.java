class MyThread extends Thread {

  public MyThread(ThreadGroup tg, String s) {
    super(tg, s);
  }

  @Override
    public void run() {
      try {
        while(!isInterrupted()) {
          Thread.sleep(2500);
          System.out.println("Я поток " + this.getName() + ". Всем привет!");
        }
      } catch (InterruptedException err) {
      } finally{
        System.out.printf("%s завершен\n", getName());
      }
    }
}