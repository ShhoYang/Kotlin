package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        System.out.println(sdf.format(new Date()));

        String s = null;
        System.out.println(s.isEmpty());


    }
}
