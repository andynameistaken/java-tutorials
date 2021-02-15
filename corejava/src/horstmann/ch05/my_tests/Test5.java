package horstmann.ch05.my_tests;

import horstmann.ch05.my_reflection.ArrayGenericCopy;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test5
{

    public static double max(double... values)
    {
        double max = Double.NEGATIVE_INFINITY;
        for (var v : values)
        {
            if (v > max)
                max = v;
        }
        return max;
    }
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, IOException
    {
//        A b = new B();
//        b.printhello();
//
//        String string_1 = null;
//        String string_2 = null;
//        System.out.println(Objects.equals(string_1,  string_2));
//
//        var staff = new ArrayList<Employee>();
//
//        System.out.println(max(5,5352,423343,5532352,34));
//        Class simple = Class.forName("horstmann_core_I.ch05.Simple");
//        Object simple_obj = simple.getConstructor(String.class, Double.class).newInstance("String", 12.0);
//        Simple simple_cast = (Simple)simple_obj;
//        System.out.println(simple_cast.getString());
//
//        String text = new String(Test5.class.getResourceAsStream("file.txt").readAllBytes());
//        System.out.println(text);
//        var squares = new ArrayList<Integer>();
//        for (int i = 1; i <= 5; i++)
//            squares.add(i * i);
//        Class class_ref = squares.getClass();
//        System.out.println(class_ref);
//        System.out.println(class_ref.isArray());
//        String name = class_ref.getName();
//        System.out.println(name);
//        Field[] fields = class_ref.getDeclaredFields();
//        AccessibleObject.setAccessible(fields, true);

        String string = "hello";
//        System.out.println(new int[2].getClass().getComponentType());
//        int[] integer_array = new int[2];
//        System.out.println(integer_array.getClass().getComponentType().isPrimitive());
        System.out.println(new ArrayList<Integer>().getClass().getComponentType());
        int[] arr_1 = new int[] {1, 2 ,3};
        int[] arr_2 = new int[] {1, 2 ,3};

        arr_1 = (int[]) ArrayGenericCopy.arrayCopy(arr_1, 10);
        System.out.println(Arrays.toString(arr_1));





    }
}
