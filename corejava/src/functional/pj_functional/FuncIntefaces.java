package functional.pj_functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FuncIntefaces
{
//	public <T,S> p
	public static void main(String[] args)
	{
		List<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		// Represents a predicate (boolean-valued function) of one argument.
		Predicate<Integer>  int_predicate = e -> e < 5;

		 testList.stream()
				.filter(int_predicate)
				.forEach(System.out::println);
//		BiPredicate<>
//		 Function Represents a function that accepts one argument and produces a result.
		Function<Integer, String> plus10String = arg -> "Integer:" + Integer.toString((arg + 10));
		testList.stream()
				.map(plus10String)
				.forEach(System.out::println);

//		Unary operator
//		Represents an operation on a single operand that produces a result of the same type as its operand.
		UnaryOperator<Integer> add10 = arg -> arg + 10;
		testList.stream()
				.map(add10)
				.forEach(System.out::println);

//		Represents a Supplier of results.
		Supplier<Integer> randomInt = () -> new Random().nextInt(101);
		System.out.println(randomInt.get());

//		add10.

//
	}
}
