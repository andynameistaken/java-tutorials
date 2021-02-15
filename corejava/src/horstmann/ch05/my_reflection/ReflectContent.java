package horstmann.ch05.my_reflection;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
/*
 * This class has only one method that  is used for getting conents of fields (including private fields)*/
public class ReflectContent
{


	/**
	 *
	 * @param object Object  for getting info about fields
	 * @return String containing information about non-static fields of parameter
	 */
	public String toString(Object object) throws IllegalAccessException
	{
//		null check:
		if (object == null)
			return "null";
//		Check if String or array
		Class obj_class = object.getClass();
		if (obj_class == String.class)
			return (String) object;
		if (obj_class.isArray())
		{
			StringBuilder return_string = new StringBuilder("array: " + obj_class.getCanonicalName() + "{");
			for (int i = 0; i < Array.getLength(object); i++)
			{
				if (i > 0)
					return_string.append(", ");
//				Check if elements are primitive
				Object value = Array.get(object, i);
				if (obj_class.isPrimitive())
					return_string.append(value);
				else return_string.append(this.toString(value));
			}
			return return_string.append("}\n").toString();
		}
//		now we know that object is complex so lets check it's fields:
		StringBuilder return_string = new StringBuilder(obj_class.getName());
		while (obj_class != null)
		{
			return_string.append(" [");
//			get fields and set private ones to be accesible
			Field[] fields = obj_class.getDeclaredFields();
			AccessibleObject.setAccessible(fields, true);

//			inspect fields of class and supperclass
			for (Field f: fields)
			{
//				omit static ones, because we're looking for stuff bound with object:
				if (!Modifier.isStatic(f.getModifiers()))
				{
					if (!return_string.toString().endsWith("["))
						return_string.append(", ");
					return_string.append(f.getName()).append(" = ");
					Object value = f.get(object);
					if (f.getType().isPrimitive())
						return_string.append(value);
					else
						return_string.append(this.toString(value));
				}
			}
			return_string.append("]");
			obj_class = obj_class.getSuperclass();
		}

		return  return_string.toString();
	}
}