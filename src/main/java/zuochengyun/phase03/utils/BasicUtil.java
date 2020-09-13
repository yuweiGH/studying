package zuochengyun.phase03.utils;

import java.util.Arrays;

/**
 * @Author: JinYuwei
 * @Since 2020/9/13
 */
public class BasicUtil {
    /**
     * 二分查找最接近的数（大于等于）
     *
     * @param array
     * @param R
     * @param val
     * @return -1 is not found
     */
    public static int findNearestIndex(int[] array, int R, int val) {
//        System.out.println("begin----------");
        if (0 == array.length) {
            return -1;
        }
        int index = R;
        int L = 0;
        while (L <= R) {
//            System.out.println("L="+L+" R="+R);
            //求二分索引
            int midIndex = ((R-L)>>1) + L;
            if (array[midIndex] == val) {
                return midIndex;
            }
            if (array[midIndex] > val) {
                R = midIndex - 1;
                index = R;
            } else {
                L = midIndex + 1;
            }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        return index;
    }

    /**
     * 生成随机数据
     * @param len
     * @param max
     * @return
     */
    public static int[] generateArray(int len, int max) {
        int[] ans = new int[(int) (Math.random() * len) + 1];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = (int) (Math.random() * max);
        }
        Arrays.sort(ans);
        return ans;
    }
}
