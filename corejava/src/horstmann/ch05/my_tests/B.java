package horstmann.ch05.my_tests;

import java.util.ArrayList;
import java.util.Arrays;

public class B extends A
{
    public int int_number = 2;
    private String helloString = "Hello Private";
    public int[] int_array = {1,2,3};
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    @Override
    void printhello()
    {
        System.out.println("Hello");
    }

    public void fun_B()
    {
        System.out.println("B");
    }
    private void printPrivate()
    {
        System.out.println(this.helloString);
    }


}
