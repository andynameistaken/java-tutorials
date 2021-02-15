package streams;

import java.util.stream.Stream;

public class StreamTest
{
    public static void main(String[] args)
    {
        Stream<Double> doubleStream = Stream
                .iterate(0.0, n -> n.compareTo(1000.0) < 0, n -> n+1);
        doubleStream.forEach(System.out::println);  
    }
}
