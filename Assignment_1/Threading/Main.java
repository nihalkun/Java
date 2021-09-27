package Threading;

public class Main {
     public static void main(String[] args) {
    
            MultiThread myThread = new MultiThread();
            myThread.start();
            try {
                Thread.sleep(10000);
                myThread.join();
            } catch (Exception e) {
                //TODO: handle exception
            }
            MultithreadRunnable myRunThread = new MultithreadRunnable();
            Thread thread = new Thread(myRunThread);
            thread.start();

        
    }
}
