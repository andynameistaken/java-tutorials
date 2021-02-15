package horstmann.ch05.my_reflection;

import java.lang.reflect.Array;

public class ArrayGenericCopy
{
	public static Object arrayCopy(Object src, int newLength)
	{
		Class cl_obj = src.getClass();
//		stop if not array
		if (!cl_obj.isArray())
			return null;
		Class componentType = cl_obj.getComponentType();
		Object newArray = Array.newInstance(componentType, newLength);
		System.arraycopy(src, 0, newArray, 0, Math.min(newLength, Array.getLength(src)));
		return newArray;
	}
}
