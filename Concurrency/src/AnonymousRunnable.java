public class AnonymousRunnable
{
	public static void main(String[] args)
	{
		Runnable myRunnable =
				new Runnable(){
					public void run(){
						System.out.println("Runnable running");
					}
				};
	}
}
