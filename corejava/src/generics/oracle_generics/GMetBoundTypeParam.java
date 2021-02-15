package generics.oracle_generics;

public class GMetBoundTypeParam
{
	public  static <T extends Comparable<T>> int countGreaterThan(T[] arr, T element)
	{
		int count = 0;
		for (T t : arr)
		{
			if (t.compareTo(element) > 0)
				count++;
		}
		return count;
	}
}
