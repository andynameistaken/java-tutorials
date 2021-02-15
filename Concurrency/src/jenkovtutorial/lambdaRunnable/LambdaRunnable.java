package jenkovtutorial.lambdaRunnable;

public class LambdaRunnable
{
	public static void main(String[] args)
	{

		Runnable runnable =
				() ->
				{ System.out.println("Lambda Runnable running"); };

		Thread thread = new Thread(runnable);
		thread.start();

	}
}
