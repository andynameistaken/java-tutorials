package functional.optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTest
{
//    public static void main(String[] args)
////    {
////        Function<Optional<String>, Optional<Integer>> stringToNaturalNumber =
////                (s) -> s.filter(s2 -> s2.matches("\\d+")).map(Integer::valueOf);
////
////        Optional<String> s_1 = Optional.of("123");
////        System.out.println(s_1.flatMap(st));
////    }
public static void main(String[] args) {
    Optional<String> s = Optional.of("input");
    System.out.println(s.map(OptionalTest::getOutput));
    System.out.println(s.flatMap(OptionalTest::getOutputOpt));
    System.out.println(s.map(OptionalTest::getOutputOpt));
}

    static String getOutput(String input) {
        return input == null ? null : "output for " + input;
    }

    static Optional<String> getOutputOpt(String input) {
        return input == null ? Optional.empty() : Optional.of("output for " + input);
    }



}
