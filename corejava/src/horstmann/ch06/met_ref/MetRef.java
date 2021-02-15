package horstmann.ch06.met_ref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetRef
{
	static <T,S> List<T> create(List<S> src, Transformer<T,S> transformer)
	{
		List<T> target = new ArrayList<>();
		for (S s : src)
		{
			target.add(transformer.transform(s));
		}
		return target;
	}

	static <T,S,U> List<T> create(List<S> src_1, List<U> src_2, Operator<T,S,U> op)
	{
		List<T> result = new ArrayList<>();
		for (int i = 0; i < src_1.size(); i++)
		{
			result.add(op.oper(src_1.get(i), src_2.get(i)));
		}
		return result;
	}

	public static void main(String[] args)
	{
		List<String> strList = Arrays.asList("pies", "kot", "ryba");
		List<String> strList2 = Arrays.asList("1", "2");
		List out = create(strList, String::toUpperCase);
//		System.out.println(out);
		String text = "pies i kot są w domu, a ryba pływa";
		out = create(strList, text::indexOf);
		System.out.println(out);

		out = create(strList, Animal::new);
		System.out.println(out);
	}
}


