package horstmann.ch05.my_tests;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");

		for (String s : list)
		{
			if (s.equals("B"))
			{
				list.remove(s);
			}
		}
		System.out.println(list);
	}
}
