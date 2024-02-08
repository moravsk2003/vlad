import java.util.Arrays;

public class SortExch {
    public static void sp(int[] array) {
        long t = System.currentTimeMillis();
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            SortBib.swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);
    }
    public static void sn(int[] array) {
        long t = System.currentTimeMillis();
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] > array[minInd]) {
                    minInd = i;
                }
            }
            SortBib.swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis() - t);
    }
    public static void s(int[] array,boolean q) {
        long t = System.currentTimeMillis();
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if ((array[i] > array[minInd])&q|(array[i] < array[minInd])&!q) {
                    minInd = i;
                }
            }
            SortBib.swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);
    }
}
