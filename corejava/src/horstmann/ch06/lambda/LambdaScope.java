package horstmann.ch06.lambda;

import java.util.Random;

public class LambdaScope
{
    interface NumberRandomIncreaser<T extends Number>
    {
        T increase(T t);
    }




    public static void main(String[] args)
    {
//        int i = 2;
        NumberRandomIncreaser<Double> increaser= a ->
        {
            int i = new Random().nextInt();
            return a + i;
        };
    }


}