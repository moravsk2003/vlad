import java.util.Arrays;

public class SortSelectB {
    public static void binp(int[] array) {
        long t = System.currentTimeMillis();
        int []a=array;
        for (int left = 1; left < array.length; left++) {
            int key = array[left];
            if (a[left-1]>a[left]) {
                int leftIndex =0;
                int rightIndex=left-1;
                do{
                    int ser= (leftIndex + rightIndex)/2;
                    if(array[ser] < key) {
                        leftIndex =ser +1;
                    } else {
                        rightIndex = ser;
                    }
                } while(leftIndex < rightIndex);
                for (int j=left-1; j>=leftIndex; j--)
                    array[j+1]=a[j];
                array[leftIndex] = key;
            }}
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);

    }
    public static void binn(int[] array) {
        long t = System.currentTimeMillis();
        int []a=array;
        for (int left = 1; left < array.length; left++) {
            int key = array[left];
            if (a[left-1]<a[left]) {
                int leftIndex =0;
                int rightIndex=left-1;
                do{
                    int ser= (leftIndex + rightIndex)/2;
                    if(array[ser] > key) {
                        leftIndex =ser +1;
                    } else {
                        rightIndex = ser;
                    }
                } while(leftIndex < rightIndex);
                for (int j=left-1; j>=leftIndex; j--)
                    array[j+1]=a[j];
                array[leftIndex] = key;
            }}
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);

    }
    public static void bin(int[] array,boolean q) {
        long t = System.currentTimeMillis();
        int []a=array;
        for (int left = 1; left < array.length; left++) {
            int key = array[left];
            if ((a[left-1]<a[left])&q|(a[left-1]>a[left])&!q) {
                int leftIndex =0;
                int rightIndex=left-1;
                do{
                    int ser= (leftIndex + rightIndex)/2;
                    if((array[ser] > key)&q|(array[ser] < key)&!q) {
                        leftIndex =ser +1;
                    } else {
                        rightIndex = ser;
                    }
                } while(leftIndex < rightIndex);
                for (int j=left-1; j>=leftIndex; j--)
                    array[j+1]=a[j];
                array[leftIndex] = key;
            }}
        System.out.println(Arrays.toString(array));
        System.out.println(System.currentTimeMillis()-t);

    }
}
