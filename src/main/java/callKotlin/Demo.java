package callKotlin;

// callKotlin..packageFoo -> callKotlin.callKotlin.packageFoo

import static callKotlin.kt.PHONE;
import static callKotlin.kt.fooThrow;
import static callKotlin.kt.packageFoo;

public class Demo {
    public static void main(String[] args) {
        foo();
        foo1();
    }

    public static void foo() {
        // kotlin只会有一个完整参数的构造方法
        // 如果参数有默认值可用@JvmOverloads,会生成相对应的其它几个参数的构造方法
        // 当所有的参数都有默认值时,即使不用@JvmOverloads注解，也会有空参数构造方法
        // @JvmOverloads同样适用于成员方法，静态方法，不能用于抽象方法和接口中的方法
        Person person = new Person("杨世豪", "luoayng", false);
        //address是私有的
        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());
        System.out.println("marry = " + person.getMarry());
        System.out.println("ID = " + person.ID);

        person.school = "YiGao";
        System.out.println("school = " + person.school);

        Person.Companion.sayHello();
        Person.Companion.eat();
        Person.sayHello(); // 能这样调用伴生对象的方法,是因为用@JvmStatic注解生成了静态方法,在命名对象中也有这种操作
        //Person.eat() // 错误,eat不是静态的

    }

    public static void foo1() {
        // .kt文件中声明的所有函数和属性都会编译成类名为包名的类的静态的函数和属性,用注解可以修改生成的类名,
        // 如果两个类名经过注解后一致，那么会合并
        String s = packageFoo();
        System.out.println(s);

        System.out.println(PHONE);
    }

    public static void foo2() {
        // kotlin没有受检异常,所以不用捕获异常,为了解决这个问题,kotlin方法用@Throws注解
        fooThrow();
    }
}
