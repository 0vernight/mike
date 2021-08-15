package mike.basic.practice;

public class Mysql extends JDBC {
    @Override
    public void connect() {
        System.out.println("Mysql链接");
    }
    public void sellect(){
        System.out.println("Mysql查询");
    }
    public void sellect(int num){
        System.out.println("Mysql查询"+num);
    }
}
