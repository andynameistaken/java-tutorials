package horstmann.ch06.lambda;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntToDoubleFunction;

public class PrimitiveFunctional
{
    public static void main(String[] args)
    {
        DoubleSupplier ds = () -> new Random().nextDouble();
        IntToDoubleFunction itd = (a) ->
        {
            LocalTime localTime = LocalTime.now();
            System.out.println(localTime);
            return 12.0;
        };

    }
}
