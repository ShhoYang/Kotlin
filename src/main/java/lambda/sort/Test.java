package lambda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("杨", 25));
        list.add(new Student("郑", 24));
        list.add(new Student("高", 26));

      /* Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });*/

        //Collections.sort(list,(s1,s2)->Integer.compare(s1.getAge(), s2.getAge()));

        Collections.sort(list, Comparator.comparingInt(Student::getAge));

        list.forEach(student -> System.out.println(student.getName() + "---" + student.getAge()));
    }
}
