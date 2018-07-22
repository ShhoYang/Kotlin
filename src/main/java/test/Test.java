package test;

public class Test {

    public static void main(String[] args) {

        B[] b= new B[]{new B()};
        foo(b);

    }

    public static void foo(A[] arr){

    }

    static class A {

    }

    static class B extends A{

    }
}
