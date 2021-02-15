package generics.oracle_generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards
{
	public static void printList(List<Object> list) {
		for (Object elem : list)
		{
			System.out.println(elem + " ");
		}

		System.out.println();
	}

	public static void printGenList(List<?> list) {
		for (Object elem: list)
		{
			System.out.print(elem + " ");
			System.out.println(elem.getClass());

		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		List<Double> arr_list = new ArrayList<>();
		arr_list.add(1.0);
		arr_list.add(2.0);
		arr_list.add(3.0);
		printGenList(arr_list);

		Double d = 1.0;
		Object obj = d;

		List <String> l1 = new ArrayList<String>();
		List<Integer> l2 = new ArrayList<Integer>();
		System.out.println(l1.getClass() == l2.getClass());


	}
}