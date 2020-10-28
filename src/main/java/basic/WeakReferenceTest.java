package basic;

import java.lang.ref.WeakReference;

/**
 * @Author: JinYuwei
 * @Since: 2020/9/25
 */
public class WeakReferenceTest {
    static class A {
        private String s = "abc";
    }
    public static void main(String[] args) {
        WeakReference wr = new WeakReference<A>(new A());
        System.out.println(wr.get());
        Object o = wr.get();
        System.gc();
        System.out.println(wr.get());
        o = null;
        System.gc();
        System.out.println(wr.get());
    }
}
