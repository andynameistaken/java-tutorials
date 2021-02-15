package test;

public class Test
{
	public static void main(String[] args)
	{
		double max = Double.NEGATIVE_INFINITY;
		for (int i = 0; i < 99999; i++)
		{
			double num = Math.random() * 1000;
			if (num > max)
				max = num;
			System.out.println(num);
		}
		System.out.println("max: " + max);
	}
}
