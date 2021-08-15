package mike.java.api;

import org.junit.Test;

/**
 * @author: 23236
 * @date: 2021/6/8 15:27
 * @description: stringbuffer与stringBuilder的区别
 * stringBuffer：
 * stringBuilder：
 */


public class StringBufferBuilderTest {
//    String stringBuffer StringBuilder三者的异同？
    /*
    String：不可变的字符串，底层用byte[]存储
    StringBuffer:线程安全效率低下，可变的字符序列，
    StringBuilder:线程不安全，可变的字符序列，

    */

    @Test
    public void sout(){
        StringBuffer b1=new StringBuffer();
        StringBuffer b2=new StringBuffer("abc");

        System.out.println(b1.length());
        System.out.println(b2.length()<<1);
        StringBuilder s3=new StringBuilder("cde");
        System.out.println(s3.length());
    }
}

