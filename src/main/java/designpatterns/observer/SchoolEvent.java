package designpatterns.observer;

/**
 * @Author: JinYuwei
 * @Since 2020/6/5
 */
public class SchoolEvent implements Event {
    public void doSth(Child child) {
        System.out.println("go to school");
    }
}
