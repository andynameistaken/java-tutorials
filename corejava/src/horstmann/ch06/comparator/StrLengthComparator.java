package horstmann.ch06.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class StrLengthComparator implements Comparator <String>
{
	@Override
	public int compare(String o1, String o2)
	{
		return o1.length() - o2.length();
	}

	public static void main(String[] args)
	{
		String[] names = {"Clementina", "Joe", "Luke"};
//		Arrays.sort(names, new StrLengthComparator());
//		Arrays.sort(names, String::length);
		System.out.println(Arrays.toString(names));
	}
}
