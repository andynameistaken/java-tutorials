package horstmann.ch05.my_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;


public class ClassInfo
{

	public static void main(String[] args) throws ClassNotFoundException
	{
		//		Get class name from terminal or scanner
//		args:
		String class_name;
		if (args.length > 0)
			 class_name = args[0];
//		else scanner:
		else
		{
			var input = new Scanner(System.in);
			System.out.println("Enter class name (eg. java.lang.Double)");
			class_name = input.next();
			input.close();
		}

//		Create class object to gather info
		Class class_obj = Class.forName(class_name);
//		Get superclass
		Class superclass_obj = class_obj.getSuperclass();
//		Get class or interface access (public, private etc)
		String modifiers = Modifier.toString(class_obj.getModifiers());
//		if any modifiers print them:
		if (modifiers.length() > 0)
			System.out.printf("%s ", modifiers);
//		print class name
		System.out.printf("class %s ", class_name);
//		if class has superclass different than Object print it:
		if (superclass_obj != null && superclass_obj != Object.class)
			System.out.printf("extends %s ", superclass_obj.getName());
		System.out.print("\n{\n");

		System.out.println();
		System.out.println("   ====== Fields ======");
		printFields(class_obj);
		System.out.println("   ====== /Fields/ ======");
		System.out.println("   ====== Constructors ======");
		printConstructors(class_obj);
		System.out.println("   ====== /Constructors/ ======");

		System.out.println("   ====== Methods ======");
		printMethods(class_obj);
		System.out.println("   ====== /Methods/ ======");





	}

	public static void printConstructors(Class cl)
	{
		Constructor[] constructors = cl.getDeclaredConstructors();
		for (Constructor c :  constructors)
		{
			String name = c.getName();
			String modifiers = Modifier.toString(c.getModifiers());
			System.out.print("    ");
			if (modifiers.length() > 0)
				System.out.printf("%s ", modifiers);
			System.out.printf("%s(", name);
			Class[] paramTypes = c.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++)
			{
				if (i > 0) System.out.print(", ");
				System.out.printf("%s", paramTypes[i].getName());
			}
			System.out.println(");");


		}
	}
	public static void printMethods(Class cls)
	{
		Method[] methods = cls.getDeclaredMethods();
		
		for (Method m : methods) 
		{
		    StringBuilder method_builder = new StringBuilder();
		    method_builder.append("\t");
		    String modifiers = Modifier.toString(m.getModifiers());
		    if (modifiers.length() > 0)
//		    	Modifiers
		    	method_builder.append(modifiers).append(" ");
//		    Return type
			method_builder.append(m.getReturnType()).append(" ");
//		    Methid name
		    method_builder.append(m.getName()).append("(");
		    Class[] param_types = m.getParameterTypes();
			for (int i = 0; i < param_types.length; i++)
			{
				if (i > 0)
					method_builder.append(", ");
				method_builder.append(param_types[i].getName());
			}
			method_builder.append(");");
			System.out.println(method_builder.toString());
		}
	}

	public static void printFields(Class class_ref)
	{
		Field[] fields = class_ref.getDeclaredFields();
		for (Field field : fields)
		{
			Class type = field.getType();
//			Field string builder with tab and modifiers
			StringBuilder field_builder = new StringBuilder()
					.append("\t")
					.append(Modifier.toString(field.getModifiers()))
					.append(" ");
//			Name
			field_builder
					.append(field.getName())
					.append(";");
			System.out.println(field_builder);

		}
	}
}
