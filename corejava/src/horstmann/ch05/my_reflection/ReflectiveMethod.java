package horstmann.ch05.my_reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectiveMethod
{
	public static void staticmethodRunner(String class_name, String method_name, Object... parameters)
			throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException
	{
		Class[] class_arr = new Class[parameters.length];
		for (int i = 0; i < parameters.length; i++)
		{
			class_arr[i] = parameters[i].getClass();
		}

		Class src_class = Class.forName(class_name);
		Method method = src_class.getMethod(method_name, class_arr);
//		method.invoke(null, parameters);


//		Method method = src_class.getMethod(method_name, parameters);

	}

	public static void testMethod(int a, int b)
	{
		System.out.println(a + b);
	}

	public static void main(String[] args) throws
			ClassNotFoundException, NoSuchMethodException,
			InvocationTargetException, IllegalAccessException
	{
		staticmethodRunner("horstmann_core_I.ch05.my_reflection.ReflectiveMethod", "testMethod", 2, 2);
	}

}
