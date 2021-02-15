package generics.oracle_generics;


import static generics.oracle_generics.GMetBoundTypeParam.countGreaterThan;

public class Main
{
	public static void main(String[] args)
	{
		Box rawBox = new Box();           // rawBox is a raw type of Box<T>
		Box<Integer> intBox = rawBox;     // warning: unchecked conversion

		Box<String> stringBox = new Box<>();
		Box rawBox2 = stringBox;
		rawBox2.set(8);  // warning: unchecked invocation to set(T)

		Pair<Integer, String> p1 = new Pair<>(1, "apple");
		Pair<Integer, String> p2 = new Pair<>(2, "pear");

		boolean same = Util.compare(p1, p1); // type inference -
										// I don't need to provide: Util.<Integer, String>compare(p1, p2);
		System.out.println(same);

		Integer[] int_arr_1 =  {1,2,3,4,5,6,7,8};
		int gt_5 = countGreaterThan(int_arr_1, 5);
	}

}
