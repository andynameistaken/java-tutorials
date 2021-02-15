package t11_2_thread_safety;
/*
The reason for data inconsistency is because updating any field value is not an atomic process,
it requires three steps; first to read the current value, second to do the necessary operations to get the
updated value and third to assign the updated value to the field reference.
*/


public class ThreadSafety
{

	public static void main(String[] args) throws InterruptedException
	{

		ProcessingThread pt = new ProcessingThread();
		Thread t1 = new Thread(pt, "t1");
		t1.start();
		Thread t2 = new Thread(pt, "t2");
		t2.start();
		//wait for threads to finish processing
		t1.join();
		t2.join();
		System.out.println("Processing count="+pt.getCount());
	}

}

class ProcessingThread implements Runnable
{
	private int count;

	@Override
	public void run() {
		for(int i=1; i < 5; i++){
			processSomething(i);
			count++;
		}
	}

	public int getCount() {
		return this.count;
	}

	private void processSomething(int i)
	{
		// processing some job
		try
		{
			Thread.sleep(i*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

/*
In above program for loop, count is incremented by 1 four times and since we have two threads,
it’s value should be 8 after both the threads finished executing. But when you will run above program multiple times,
you will notice that count value is varying between 6,7,8. This is happening because even if count++ seems to
be an atomic operation, its NOT and causing data corruption.
*/

/*
* Thread safety in java is the process to make our program safe to use in multithreaded environment,
* there are different ways through which we can make our program thread safe.

    Synchronization is the easiest and most widely used tool for thread safety in java.
    Use of Atomic Wrapper classes from java.util.concurrent.atomic package. For example AtomicInteger
    Use of locks from java.util.concurrent.locks package.
    Using thread safe collection classes, check this post for usage of ConcurrentHashMap for thread safety.
    Using volatile keyword with variables to make every thread read the data from memory, not read from thread cache.
*/

/*
*
    //dummy object variable for synchronization
    private Object mutex=new Object();
    ...
    //using synchronized block to read, increment and update count value synchronously
    synchronized (mutex) {
            count++;
    }
*/
