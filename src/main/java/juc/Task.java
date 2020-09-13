package juc;

/**
 * @Author: JinYuwei
 * @Since 2020/6/15
 */
public class Task implements Runnable {
    private int number;
    public Task(int number) {
        this.number = number;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getId()+" number:"+number);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
