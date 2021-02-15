package horstmann.ch06.inner_classes;

public class InnerTest
{
	private int number = 1;

	class InnerClass
	{
		public void printNum()
		{
			System.out.println(number);
		}
	}

	public void printMethod()
	{
		class LocalInnerClass
		{
			public void printNum()
			{
				System.out.println(number);
			}
		}
	}

	public static void main(String[] args)
	{
		InnerTest it_1 = new InnerTest();
		it_1.printMethod();
	}
}
