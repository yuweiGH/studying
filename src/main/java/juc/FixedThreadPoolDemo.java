package juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: JinYuwei
 * @Since 2020/6/15
 */
public class FixedThreadPoolDemo {
    private static final ExecutorService es = Executors.newFixedThreadPool(5);

    private void oomTest() {
        int i = 0;
        for (;;) {
            es.submit(new Task(i++));
        }
    }
    public static void main(String[] args) {
        FixedThreadPoolDemo demo = new FixedThreadPoolDemo();
        demo.oomTest();
    }
}
