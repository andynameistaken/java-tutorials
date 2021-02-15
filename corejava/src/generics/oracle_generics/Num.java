package generics.oracle_generics;

public class Num<T extends Number>
{
	T t;

	public Num(T t)
	{
		this.t = t;
	}
	public <T extends Number>void printNum()
	{
		System.out.println(t.getClass() == Integer.class);
		System.out.println(t.getClass() == Double.class);
	}

	public static void main(String[] args)
	{
		Num<Integer> num_1 = new Num<>(1);
		 num_1.printNum();
	}
}
