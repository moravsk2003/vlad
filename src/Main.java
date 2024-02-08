import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        int n=10000;
        int[] r =new int[n];
        SortBib.rand(r,n);
        System.out.println(Arrays.toString(r));
        SortExch.s(r,true);
        SortBib.rand(r,n);
        System.out.println(Arrays.toString(r));
        SortBib.b(r,false);
        SortBib.rand(r,n);
        System.out.println(Arrays.toString(r));
        SortSelectB.bin(r,false);
        SortBib.rand(r,n);
        System.out.println(Arrays.toString(r));
        SortSelectL.l(r,false);


        System.out.println(System.currentTimeMillis()-t);
    }
}