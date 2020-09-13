package zuochengyun.phase03.class01;

import static zuochengyun.phase03.utils.BasicUtil.findNearestIndex;
import static zuochengyun.phase03.utils.BasicUtil.generateArray;

/**
 * @Author: JinYuwei
 * @Since 2020/9/12
 *
 * 给定一个有序数组arr，从左到右依次表示X轴上从左往右点的位置
 * 给定一个正整数K，返回如果有一根长度为K的绳子，最多能盖住几个点
 * 绳子的边缘点碰到X轴上的点，也算盖住
 */
public class Code01CordCoverMaxPoint {

    public static void main(String[] args) {
        System.out.println(Math.random());
        final int[] ints = {1, 3, 4, 6, 7, 8, 10, 23, 24};
        final int[] arr = generateArray(100, 20);
        for (int i=0; i<arr.length;i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("\n=======================>");
        final int n = t1(arr, 5);
        System.out.println("result="+n);
    }

    /**
     * 时间复杂度 O(n*logn)
     * @param array
     * @param len
     * @return
     */
    public static int t1(int[] array, int len) {
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            int needFindVal = array[i] - len;
            int valIndex = findNearestIndex(array, i, needFindVal);
            if (valIndex > -1) {
                System.out.println("cove:"+array[valIndex]+"~"+array[i]);
                n++;
            }
        }
        return n;
    }

    /**
     * 时间复杂度 O(n)
     * @param array
     * @param len
     * @return
     */
    public static int t2(int[] array, int len) {
        return 0;
    }
}
