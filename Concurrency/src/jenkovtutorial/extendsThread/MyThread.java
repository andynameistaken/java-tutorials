package jenkovtutorial.extendsThread;

public class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("MyThread is running " + this.getName());
	}


	public static void main(String[] args)
	{
	/*	MyThread myThread = new MyThread();
		So what is difference between start and run method? Main difference is that when
		program calls start() method a new Thread is created and code inside run() method is executed in
		new Thread while if you call run() method directly no new Thread is created and code inside run() will
		execute on current Thread. Most of the time calling run() is bug or programming mistake because caller has
		intention of calling start() to create new thread and this error can be detect by many static code coverage
		tools like findbugs. If you want to perform time consuming task than always call start() method otherwise your
		main thread will stuck while performing time consuming task if you call run() method directly.
		Another difference between start vs run in Java thread is that you can not call start() method twice on
		thread object. once started, second call of start() will throw IllegalStateException in Java while you
		can call run() method twice.

		Read more: https://javarevisited.blogspot.com/2012/03/difference-between-start-and-run-method.html#ixzz5i92sRGx0*/

		MyThread myThread = new MyThread();
		myThread.start();
		myThread.run();
	}
}
