package generics.exercises;

import java.io.Serializable;

public class GenericTest
{
    public static void main(String[] args)
    {
        smallestNum(1,2,3,4);
    }

    public static  <T extends Comparable & Serializable> void smallestNum(T... array)
    {
        Comparable num = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (num.compareTo(array[i]) > 0)
                num = array[i];
        }
        System.out.println(num);
    }
}



