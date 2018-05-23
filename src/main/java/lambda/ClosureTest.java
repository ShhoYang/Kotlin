package lambda;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosureTest {

    public static void main(String[] args) {
        System.out.println(getAnnoInner(new ArrayList<>(Arrays.asList(1, 2, 3))).add());
        System.out.println(getAnnoInner1(1).add());
    }

    public static AnnoInner getAnnoInner(@NotNull List<Integer> list) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        return () -> {

            list.add(123);
            int sum = 0;
            for (int i : list) {
                sum += i;
            }

            for (int i : list1) {
                sum += i;
            }
            return sum;
        };
    }

    public static AnnoInner getAnnoInner1(int x) {

        int y = 100;
        return () -> {
            int z = 101;
            z = z + x + y;
            return z;
        };
    }

    interface AnnoInner {
        int add();
    }
}
