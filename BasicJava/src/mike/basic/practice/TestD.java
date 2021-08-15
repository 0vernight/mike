package mike.basic.practice;

import java.util.Random;

public class TestD {
    public static void main(String[] args) {

        String str1="hello";
        String str2=new String("hello");
        String str3="he"+"llo";
        String str4=String.valueOf("hello");
        Integer a=new Integer(127);
        Integer b=new Integer(128);
//        float f=12.3;
        if (false&&false)
            System.out.println("false");


        JDBC mysql=new Mysql();
        Mysql mysql1=new Mysql();
        JDBC orale=new Orale();
        Random random=new Random();
        method(mysql);
        mysql1.sellect(2);
    }

    public static void method(JDBC human){
        human.connect();
        human.sellect();

    }
}
