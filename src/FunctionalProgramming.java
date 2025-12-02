import java.util.function.Function;

public class FunctionalProgramming {

    private static final Function<Integer, Integer> doubleIt = a -> a * 2;
    private static final Function<Integer, Integer> split = x -> (x / 2);
    private static final Function<Integer, Integer> addThousand = b -> b + 1000;
    private static final Function<Integer, Integer> doubleAndAdd = doubleIt.andThen(addThousand);
    // f(x) = x ** x
    private static final Function<Integer, Integer> makeItPow = x -> (int) Math.pow(x, 2);
    // f(x) = 2(x ** 2) + 1000
    private static final Function<Integer, Integer> beforeDouble = doubleAndAdd.compose(makeItPow);




    public static void operate() {
        Integer res = applyFunction(10, doubleIt);
        Integer res2 = applyFunction(500, split);
        Integer res3 = applyFunction(2, beforeDouble);
        System.out.println(res2);
        System.out.println(res);
        System.out.println(res3);
    }

    // TO APPLY A FUNCTION ON A VARIABLE
    private static Integer applyFunction(
            Integer integer,
            Function<Integer, Integer> function) {
        return function.apply(integer);
    }
}
