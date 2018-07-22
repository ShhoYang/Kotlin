package callJava;

public  class Person {
    private String name;
    private String address;
    private int age;
    private boolean marry;

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

    public boolean isMarry() {
        return marry;
    }

    public void setMarry(boolean marry) {
        this.marry = marry;
    }

    public void sayHello() {
//        System.out.println("hello");
    }

    public void is() {

    }

    public int[] getNums() {
        return new int[]{1, 2, 3};
    }

    public void money(int... money) {

    }

    /**
     * 操作符重载,-
     */
    public void unaryMinus() {
        age--;
    }
}
