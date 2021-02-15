package generics.pj_generics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainPJGenerics
{
	public static void genericInferring(List<String> list)
	{
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
	}
	public static void main(String[] args)
	{
		class Data
		{
			String data;

			Data(String s)
			{
				data = s;
			}

			@Override
			public String toString()
			{
				return this.data;
			}
		}
		Pair<String, String> pair_1 = new Pair<>("John", "George");
		System.out.println(pair_1);
		Pair<String, Data> pair_2 = new Pair<>("John", new Data("2019-01-01"));
		System.out.println(pair_2);
		genericInferring(new LinkedList<>());
		genericInferring(new ArrayList<>());
		System.out.println(pair_1.getClass());

		for(Method m : pair_1.getClass().getDeclaredMethods())
		{
			if (!m.getName().equals("main"))
				System.out.println(m);
		}
//		System.out.println(pair_1.count);

	}
}
