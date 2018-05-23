package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(new Date()));
        calculate();
        System.out.println("".isEmpty());
    }


    public static void calculate() {
        throw new NullPointerException("kong");
    }
}
