package t03_1_interrupts;
public class InterruptFlag
{
    public static void main(String[] args)
    {
        Thread thread_1 = new Thread(new MyRunnable());

        thread_1.start();
        thread_1.interrupt();
        if (thread_1.isInterrupted())
        {
            System.out.println("This thread is interrupted");
        }

    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
}
