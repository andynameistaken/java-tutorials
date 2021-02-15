package functional.pj_functional;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionalMain
{
	static <T, S> List<T> create(List<S> src, Filter<S> f, Transformer<T, S> t)
	{
		List<T> target = new ArrayList<>();
		for (S e : src)
			if (f.test(e))
				target.add(t.transform(e));
			return target;
	}
//	--- Main ---
	public static void main(String[] args)
	{
		List<Integer> integerList = new ArrayList<>();
		for (int i = 0; i < 30; i++)
		{
			integerList.add(i);
		}
		Function<Integer,Integer> even2x = integer ->
		{
			if (integer % 2 == 0)
				return integer * 2;
			return integer;
		};

//		integerList.stream().map(even2x).forEach(System.out::println);

		Predicate<Integer> containsElementsGt15LessThan30 = integer -> integer > 10 && integer <20;

//		integerList.stream().filter(containsElementsGt15LessThan30).forEach(System.out::println);

		Function<Integer, Integer> square = val -> val *val;
		Function<Integer, Integer> plus2 = val -> val + 2 ;

		Function sqplus2 = square.compose(plus2);

//		System.out.println(sqplus2.apply(3));

//		System.out.println(square.andThen(plus2).apply(3));

		List<String> stringList = new ArrayList<>(Arrays.asList("Tom Cruise", "Luke Skywalker", "Tom Cruise", "Bob Dylan"));

//		stringList.stream().flatMap(line -> Stream.of(line.split(" "))).forEach(System.out::println);
//		stringList.stream()
//				.distinct()
//				.forEach(System.out::println);

		Map<Integer, String> integerStringMap = new TreeMap<>();
		integerStringMap.put(1, "One");
		integerStringMap.put(1, "One");
		integerStringMap.put(2, "Two");
		integerStringMap.put(3, "Three");
		integerStringMap.put(4, "Three");

		List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10);

		// Using peek with count(), which
		// is a terminal operation


		Stream<String> stream = stringList.stream();

		Optional<String> anyElement = stream.findAny();
//		integerList = integerList.stream()
//				.filter(e -> e <= 10)
//				.collect(Collectors.toList());
		integerList.forEach(System.out::println);
		integerList = create(integerList, e -> e <= 10, e -> e*2);
		integerList.forEach(System.out::println);





	}
}
