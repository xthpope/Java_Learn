package test;

/**
 * 多线程按序打印
 * @author : xutinghao
 * @date : 2022/3/21 09:02
 * @description :
 */
public class Foo {

    private int num = 1;
    private Object o = new Object();

    public Foo() throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(num);
            }
        };
       while (true){
           first(runnable);
           Thread.sleep(1000);
           second(runnable);
           Thread.sleep(1000);
           third(runnable);
           Thread.sleep(1000);
       }
    }

    public void first(Runnable printFirst) throws InterruptedException {

        synchronized (o){
            // printFirst.run() outputs "first". Do not change or remove this line.
            while (num != 1){
                o.wait();
            }
            printFirst.run();
            num = 2;
            o.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {

        synchronized (o){
            // printSecond.run() outputs "second". Do not change or remove this line.
            while (num != 2){
                o.wait();
            }
            printSecond.run();
            num = 3;
            o.notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {

        synchronized (o){
            // printThird.run() outputs "third". Do not change or remove this line.
            while (num != 3){
                o.wait();
            }
            printThird.run();
            num = 1;
            o.notifyAll();
        }
    }

    public static void main(String[] args) {
        try {
            Foo foo = new Foo();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
