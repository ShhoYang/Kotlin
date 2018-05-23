package lambda;

public class SuperTest {
    public static void main(String[] args) {
        new Child().print();
    }

    public static class Father {

        protected void print() {
            System.out.println("I am a 定义方法 in father");
        }
    }

    public static class Child extends Father {

        @Override
        protected void print() {
            //Runnable runnable= () -> super.print();
            Runnable runnable = super::print;
            new Thread(runnable).start();
        }
    }
}
