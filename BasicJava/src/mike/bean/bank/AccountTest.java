package mike.bean.bank;

/**
 * @author: 23236
 * @date: 2021/3/31 14:48
 * @description:
 */
class Account{
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    public void deposit(double amt){
        if (amt>0){
            balance+=amt;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"存钱成功！余额为："+balance);
        }
    }
}

class Customer extends Thread{
    private Account acc;

    public Customer(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acc.deposit(1000);
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account ac=new Account(0);
        Customer c1 = new Customer(ac);
        Customer c2 = new Customer(ac);

        c1.start();
        c2.start();
    }
}
