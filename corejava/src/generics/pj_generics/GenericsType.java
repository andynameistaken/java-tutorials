package generics.pj_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsType<T>
{
	private T t;

	public GenericsType()
	{
	}

	public GenericsType(T t)
	{
		this.t = t;
	}

	public T getT()
	{
		return t;
	}

	public void setT(T t)
	{
		this.t = t;
	}

	public static <T> boolean isEqual(GenericsType<T> gt1, GenericsType<T> gt2)
	{
		return gt1.getT().equals(gt2.getT());
	}

// Bounded Type Params
	public static <T extends Comparable<T>> int compare(T t1, T t2)
	{
		return  t1.compareTo(t2);
	}

//	Wildcards - bounded
	public static void printSumList(List<? extends Number> list)  // not higher than Number. So no Object here.
	{
//		list.add(1); can't do
		double sum = 0;
		for (Number n : list )
		{
		    sum += n.doubleValue();
		}
		System.out.println(sum);
	}

//	lower bounds
//public static void printLowerSumList(List<? super Integer> list)  // not higher than Number. So no Object here.
//{
////		list.add(1); can't do
//	double sum = 0;
//	for (Object i: list)
//	{
//		sum += i;
//	}
//	System.out.println(sum);
//}

//	Wildcards unbounded

	public static void printUnboundList(List<?> list) // it extends Object in reality
	{

		for (Object obj : list)
		{
			System.out.print(obj + " | ");
		}
	}


	public static void main(String[] args)
	{
		GenericsType<String> stringGenericsType = new GenericsType<>("Jello");
		System.out.println(stringGenericsType.getT());

		GenericsType genericsType = new GenericsType();
		genericsType.setT(4);
		System.out.println(genericsType.getT().getClass());

		GenericsType<String> g1 = new GenericsType<>("Andy");
		GenericsType<String> g2 = new GenericsType<>("Andy");
		System.out.println(isEqual(g1, g2));

		System.out.println(compare(1,2));

//		Bounded types
		ArrayList<Double> d_arrayList = new ArrayList<>();
		d_arrayList.add(2.2);
		d_arrayList.add(2.8);

		ArrayList<Double> d_arrayList_1 = new ArrayList<>();
		d_arrayList_1.add(1.0);
		d_arrayList_1.add(2.0);

		printSumList(d_arrayList);

		printUnboundList(d_arrayList);
		d_arrayList.add((double) (Math.min(1, 2)));
		d_arrayList.add(Math.random());

		List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
		List<? extends Number> foo4 = new ArrayList<Integer>(); // Integer extends Number
		List<? extends Number> foo5 = new ArrayList<Double>();  // Double extends Number







	}
}
