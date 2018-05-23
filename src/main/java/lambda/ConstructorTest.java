package lambda;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorTest {
    public static void main(String[] args) {

        List<String> labels = Arrays.asList("1", "2", "3");
        List<Button> buttons = labels.stream().map(Button::new).collect(Collectors.toList());
       // buttons.forEach(button -> System.out.println(button.getLabel()));

        List<String> buttons1 = asList(LinkedList::new, "3", "4");

        buttons1.forEach(System.out::println);
    }

    public static <T> List<T> asList(MyCreator<List<T>> creator, T... t) {
        List<T> list = creator.create();
        for (T t1 : t) {
            list.add(t1);
        }
        return list;
    }

    interface MyCreator<L extends List<?>> {
        L create();
    }
}
