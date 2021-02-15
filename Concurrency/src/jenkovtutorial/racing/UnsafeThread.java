package jenkovtutorial.racing;

public class UnsafeThread
{
    public static int counter = 0;
    private StringBuilder stringBuilder = new StringBuilder();
    public void add(String text)
    {
        this.stringBuilder.append(text);
    }

    public String getString()
    {
        return this.stringBuilder.toString();
    }

    public static void main(String[] args)
    {
        UnsafeThread sharedInstance = new UnsafeThread();
        MyRunnable runnable_1 = new MyRunnable(sharedInstance);
        MyRunnable runnable_2 = new MyRunnable(sharedInstance);
        Thread thread_1 = new Thread(runnable_1);
        Thread thread_2 = new Thread(runnable_2);

        thread_1.start();
        thread_2.start();

        for (int i = 0; i < 1000000; i++)
        {
            new Thread(new MyRunnable(sharedInstance)).start();
        }

        System.out.println(sharedInstance.getString());
        System.out.println(UnsafeThread.counter);

    }
}

class MyRunnable implements Runnable
{

    private UnsafeThread instance;

    public MyRunnable(UnsafeThread unsafeThread)
    {
        this.instance = unsafeThread;
    }
    @Override
    public void run()
    {
        this.instance.add("text added\n");
        UnsafeThread.counter+=1;

    }

    public UnsafeThread getInstance()
    {
        return this.instance;
    }



}
