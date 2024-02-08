import java.util.Arrays;

public class SortSelectL {
    public static void lp(int[] array) {
        long t = System.currentTimeMillis();
        for (int left = 1; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);
    }
    public static void ln(int[] array) {
        long t = System.currentTimeMillis();
        for (int left = 1; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value > array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);
    }
    public static void l(int[] array,boolean q) {
        long t = System.currentTimeMillis();
        for (int left = 1; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if ((value > array[i])&q|(value < array[i])&!q) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis() - t);
    }
}
