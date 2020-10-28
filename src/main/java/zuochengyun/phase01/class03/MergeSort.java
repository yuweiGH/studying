package zuochengyun.phase01.class03;

/**
 * @Author: JinYuwei
 * @Since: 2020/10/29
 * 数组左部分有序、有部分也有序，然后合并
 */
public class MergeSort {
    private static int[] data = {2, 11, 4, 15, 6, 2, 5, 3, 9, 7, 10, 32};

    public void process(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }

        int M = L + ((R - L) >> 1);
        if (M >= R) {
            return;
        }
        process(arr, L, M);
        process(arr, M + 1, R);
        mergeArr(arr, L, M, R);
    }

    private void mergeArr(int[] arr, int L, int M, int R) {
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;

        while (p1 <= M && p2 <= R) {
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= M) {
            help[i++] = arr[p1++];
        }
        while (p2 <= R) {
            help[i++] = arr[p2++];
        }
        i = 0;
        for (i = 0; i< help.length; i++) {
            arr[L+i] = help[i];
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        for (int i = 0; i< data.length; i++) {
            System.out.print(data[i]+",");
        }
        System.out.println();
        mergeSort.process(data, 0, data.length - 1);
        for (int i = 0; i< data.length; i++) {
            System.out.print(data[i]+",");
        }
    }
}
