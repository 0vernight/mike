package mike.basic.practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class inout {
/*
* 主要学习io操作进行代码测试
* 流
*   输入流--读
*   输出流--写
* 字节流  可以处理电脑上的所有的文件  字节流和编码表封装成对象就是 -字符流
* 四个基类
*   字节流--InputStream OutputStream
*   字符流--Reader Writer
*
*
*/
    public static void main(String[] args) throws IOException {     //IO都会发生IO异常
        FileWriter fileWriter=new FileWriter("D:/demo.text");
        fileWriter.write("welcom");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader=new FileReader("D:/demo.text");
        char[] buf=new char[1024];
        int len=0;
        while ((len=fileReader.read(buf))!=-1){
            System.out.println(len);
            System.out.println(new String(buf,1,len));
        }
    }
}
