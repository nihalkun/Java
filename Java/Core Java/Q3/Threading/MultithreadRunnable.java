package Threading;

public class MultithreadRunnable implements Runnable{
    @Override
    public void run() {

        for (int i=0; i<2; i++) {
            System.out.println("Hellow");

           /* try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }*/
      }
    }
}
