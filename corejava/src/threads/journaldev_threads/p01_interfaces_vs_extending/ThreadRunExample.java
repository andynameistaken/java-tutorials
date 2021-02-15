package threads.journaldev_threads.p01_interfaces_vs_extending;

public class ThreadRunExample
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new HeavyWorkRunnable(), "runnable_1");
		t1.start();
		Thread t2 = new MyThread("inheriting_1");
		t2.start();
	}
}
