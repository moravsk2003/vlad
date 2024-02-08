import java.util.Arrays;

public class SortBib {
    public static void swap(int[] arr, int ind1, int ind2) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }
    public static void rand(int[] r,int n) {
        for (int id = 0; id < n; id++) {
            r[id] = (int) (Math.random() * 100);

        }
    }

    public static void bp(int[] array) {
        long t = System.currentTimeMillis();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);
    }
    public static void bn(int[] array) {
        long t = System.currentTimeMillis();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);
    }
    public static void b(int[] array,boolean q) {
        long t = System.currentTimeMillis();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if ((array[i] > array[i - 1])&q|(array[i] < array[i - 1])&!q) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);
    }





}
