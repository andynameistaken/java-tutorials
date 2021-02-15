package horstmann.ch06.cloning;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;


public class ExampleClass implements Cloneable
{
//	Fields:
	ArrayList<Integer> arrayList = new ArrayList<>();
	Date date = Date.from(Instant.now());
	int[] numbers;

//	Constuctors:
	public ExampleClass(int[] arr)
	{
		this.numbers = arr;
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
	}

//	Methods:
@SuppressWarnings("unchecked")
	public ExampleClass clone() throws CloneNotSupportedException
	{
		ExampleClass clonedObj = (ExampleClass) super.clone();
		clonedObj.arrayList = (ArrayList<Integer>) arrayList.clone();
		clonedObj.date = (Date) date.clone();
		return clonedObj;
	}

	@Override
	public String toString()
	{
		return "ExampleClass{" +
				"arrayList=" + Arrays.toString(arrayList.toArray()) +
				", date=" + date +
				", numbers=" + Arrays.toString(numbers) +
				'}';
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		ExampleClass exampleClass_1 = new ExampleClass(new  int[]{1,2,3});
		ExampleClass exampleClass_2 = exampleClass_1.clone();
		System.out.printf("example class 1 = %s\n", exampleClass_1.toString());
		System.out.printf("example class 2 = %s\n", exampleClass_2.toString());

		exampleClass_2.arrayList.add(4);
		exampleClass_2.numbers = new int[]{4, 5, 6};
		exampleClass_2.date = Date.from(Instant.now());

		System.out.printf("example class 1 = %s\n", exampleClass_1.toString());
		System.out.printf("example class 2 = %s\n", exampleClass_2.toString());


	}
}
