package edu.ufp.inf.aed2.ficha2;


import edu.princeton.cs.algs4.StdRandom;

public class ExerciciosFicha {

    public static void main(String[] argv){
        BST_AED2_2022<Integer, Integer> bst = new BST_AED2_2022<Integer, Integer>();

        int[] keys = {4,2,6,1,3,5,7};
        Iterable<Integer> numbers;

        for (Integer x : keys){
            bst.put(x, StdRandom.uniform(1000,9999)); // The value does not matter in this case
        }

        System.out.printf("Number of leafs: %d\n", bst.leafCount());
        System.out.printf("Number of keys: %d\n", bst.keyCount());


    }

}
