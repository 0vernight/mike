package mike.bean.producer;

/**
 * @author: 23236
 * @date: 2021/4/1 9:20
 * @description:
 *
 * 线程通信的应用:经典例题:生产者/消费者问题
 * 生产者(Productor)将产品交给店员(CLerk)，而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20)，如果生产者试图生产更多的产品，
 * 店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产;如果店中没有产品了，
 * 店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 * 分析:
 * 1．是否是多线程问题?是，生产者线程，消费者线程2.是否有共享数据?是，店员(或产品）
 * 3.如何解决线程的安全问题?同步机制,有三种方法4、是否涉及线程的通信?是
 *
 * 当生产者和消费者类继承其他类那么必定要用实现Runable接口
 */
class Clerk{
    private static int product=0;

    public synchronized void doProduce() {
        if (product<20){
            product++;
            System.out.println(Thread.currentThread().getName()+":生产了第:"+product+"个产品");

            notify();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
//            等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void goShopping() {
        if (product>0){
            System.out.println(Thread.currentThread().getName()+":消费了第:"+product+"个商品");
            product--;

            notify();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
//            等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Productor implements Runnable{

    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            clerk.doProduce();
        }
    }
}

class Customer implements Runnable{

    private Clerk clerk;

    public Customer(Clerk clerk) {
        this.clerk = clerk;
    }


    @Override
    public void run() {
        while (true){
            clerk.goShopping();
        }
    }
}

public class ProducerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Productor p = new Productor(clerk);
        Customer c = new Customer(clerk);
        Customer c1 = new Customer(clerk);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c1);
        t1.setName("生产者A");
        t2.setName("消费者B");
        t3.setName("消费者C");
        t1.start();
        t2.start();
        t3.start();

    }
}
