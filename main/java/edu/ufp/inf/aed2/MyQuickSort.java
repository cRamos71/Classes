package edu.ufp.inf.aed2;

public class MyQuickSort {

    public static void main(String[] argv){
    }
    public static int partition(int[] a, int lo, int hi){
        int i = lo, j = hi+1;
        while (true)
        {
            while (less(a[++i], a[lo]))
                if (i == hi) break;
            while (less(a[lo], a[--j]))
                if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;}

   public static void sort(int[] a, int lo, int hi)
    {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    public static boolean less(int x, int y){
        return x<y;
    }

    public static void exch(int[] numbers, int i, int j){
        int t =  numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = t;
    }

}
