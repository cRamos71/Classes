package edu.ufp.inf.aed2;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

public class MyBinarySearch {
    public static void main(String[] argv){
        //Test
        int[] numbers = null;
        numbers = generateInts(30);
        printArray(numbers);

        MyQuickSort.sort(numbers, 0 , numbers.length-1);

        printArray(numbers);

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        System.out.printf("%d", binarySearch(numbers, number));

    }
    public static int binarySearch(int arr[], int n)  {

        int left = 0, right = arr.length-1;

        while (left <= right){

            int median = left + (right - left)/2;

            if(arr[median] > n){
                right = median - 1;
            } else if (arr[median] < n) {
                left = median + 1;
            }else return median;

        }
        return -1;
    }

    public static int[] generateInts(int quantity){

        int[] numbers = null;

        numbers = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            numbers[i] = StdRandom.uniformInt(1000, 9999);
        }

        return numbers;
    }

    public static void printArray(int[] numbers){
        for(int v : numbers){
            System.out.printf("%d ", v);
        }
        System.out.printf("\n");
    }

}
