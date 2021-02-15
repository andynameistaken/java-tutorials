package horstmann.ch06.comparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest
{

	public static void main(String[] args)
	{
		class Person
		{
			String f_name;
			int age;

			public Person(String f_name, int age)
			{
				this.f_name = f_name;
				this.age = age;
			}

			public String getF_name()
			{
				return f_name;
			}

			public int getAge()
			{
				return age;
			}

			@Override
			public String toString()
			{
				return "Person{" +
						"f_name='" + f_name + '\'' +
						", age=" + age +
						'}';
			}
		}
		Person[] people = {
				new Person("John", 12),
				new Person("Bob", 15),
				new Person("Bob", 14),
				new Person("Elizabeth", 30),
				new Person("Andy", 10),
				new Person(null, 30)
		};

//		Arrays.sort(people, Comparator.comparing(Person::getF_name).thenComparing(Person::getAge));
//		Arrays.sort(people, Comparator.comparing(Person::getF_name, Comparator.nullsFirst()).thenComparing(Person::getAge));
		Arrays.sort(people,
				Comparator.comparing(
						Person::getF_name,
						Comparator.nullsFirst(Comparator.naturalOrder())
				).thenComparing(Person::getAge, Comparator.reverseOrder())
		);
		System.out.println(Arrays.toString(people));
	}
}
