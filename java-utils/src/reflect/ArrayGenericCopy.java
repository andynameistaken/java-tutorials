package reflect;

public class ArrayGenericCopy
{
	public static Object arrayCopy(Object src, int newLength)
	{
		Class class_obj = src.getClass();
		if (!class_obj.isArray())
			return null;
//		Provide type so JVM will know it
//		getComponentType is works only with arrays. Thanks Oracle.
		Class type = class_obj.getComponentType();

	}
}
