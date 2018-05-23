package lambda;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 方法引用主要有如下三种使用情况
 * <p>
 * （1）. 类：：实例方法
 * <p>
 * （2）. 类：：静态方法
 * <p>
 * （3）. 对象：：实例方法
 * <p>
 * 其中后两种情况等同于提供方法参数的lambda表达式，
 */
public class SortTest {

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


        List<String> list1 = new ArrayList<String>() {
            {
                add("bb");
                add("ada");
                add("aca");
            }
        };

        /**
         * 第1种
         *
         * String::compareToIgnoreCase)等同于(x,y)->x.compareToIgnoreCase(y)
         *
         * 第一个参数会成为执行方法的对象
         */
        Collections.sort(list1, String::compareToIgnoreCase);
        /**
         *  第3种
         *
         * System.out::println 等同于(x)->System.out.println(x)
         */
        list1.forEach(System.out::println);

        /**
         * 第二种
         */
    }

    public static class Student {

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
