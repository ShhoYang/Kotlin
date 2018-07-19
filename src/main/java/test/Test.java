package test;

import java.util.Calendar;

public class Test {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(i);

        boolean b = false;
        foo(!b);

        if(b){
            foo(false);
        }else {
            foo(true);
        }
    }

    public static void foo(boolean b){

    }
}
