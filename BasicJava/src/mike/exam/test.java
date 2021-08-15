package mike.exam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    测验
 */
public class test {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("a");
        StringBuilder stringBuilder=new StringBuilder("abcdefg");
        stringBuilder.append("ak");
        stringBuilder.insert(1,"et");
        double d=Math.floor(11.2);
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("y-mm-dd\nhh:mm:ss");
        String s2,s="a",s1="a";
        s2="abc";
        int a=2;
        int b=4;
        System.out.println(df.format(date)+"|"+System.currentTimeMillis());

//        System.out.println(s==s1);
//        System.out.println(s2==s1);

    }
}
