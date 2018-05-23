package lambda;


import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * lambda表达式的基本格式为(x1,x2)->{表达式...};
 * <p>
 * 在上式中，lambda表达式带有两个参数，此时参数类型可以省略，但两边的括号不能省略
 * <p>
 * 如果表达式只有一行，那么表达式两边的花括号可以省略
 * <p>
 * <p>
 * Function：提供任意一种类型的参数，返回另外一个任意类型返回值。 R apply(T t);
 * <p>
 * Consumer：提供任意一种类型的参数，返回空值。 void accept(T t);
 * <p>
 * Supplier：参数为空，得到任意一种类型的返回值。T get();
 * <p>
 * Predicate：提供任意一种类型的参数，返回boolean返回值。boolean test(T t);
 */
public class Test {

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("Java", "Kotlin", "Python");
//        list.forEach(System.out::println);
//        list.forEach(x -> System.out.println(x));


        List<Integer> list = Arrays.asList(10, 20, 30);
        Stream<Integer> stringStream = list.stream().map(x -> x + 1).filter(x -> x > 20);
        List<Integer> collect = stringStream.collect(Collectors.toList());
        collect.forEach(System.out::println);

        /**
         * 一个参数,可以省略参数的括号和类型
         */
        Optional<Integer> reduce = list.stream().map(x -> x + 1).reduce((sum, x) -> sum + x);
        Integer integer = reduce.get();
        System.out.println(integer);

        /**
         * 没有参数,但参数的括号不能省略
         */
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();

        testOneParams(s -> System.out.println(s));

        String s = list.stream().map(integer1 -> integer1 + "").collect(Collectors.joining(", "));
        System.out.println(s);

        Stream<Integer> stream = list.stream();
        IntStream intStream = stream.mapToInt(x -> x);
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();

        System.out.println("max = " +intSummaryStatistics.getMax());
        System.out.println("min = " +intSummaryStatistics.getMin());
        System.out.println("count = " +intSummaryStatistics.getCount());
        System.out.println("sum = " +intSummaryStatistics.getSum());
        System.out.println("average = " +intSummaryStatistics.getAverage());
    }

    private static void testOneParams(Consumer<String> consumer) {
        consumer.accept("testOneParams");

    }

    interface I {
        default int add(int x, int y) {
            return x + y;
        }
    }
}
