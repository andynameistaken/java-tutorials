package generics.oracle_generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcards
{
	public static  <T extends Number, V> void  addNumber(List<T> list, T elem, V v)
	{
		list.add(elem);
	}


	{

	}



	public static void main(String[] args)
	{
		List<Double> al = new ArrayList<>();
		addNumber(al, 2.0, "Hello");
		System.out.println("al = " + al);
		List <String> l1 = new ArrayList<String>();
		List<Integer> l2 = new ArrayList<Integer>();
		System.out.println(l1.getClass() +" "+ l2.getClass());
		
	}
}
