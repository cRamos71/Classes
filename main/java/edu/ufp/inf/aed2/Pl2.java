package edu.ufp.inf.aed2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdRandom;

public class Pl2 {
    public static void main(String[] argv){
        Integer Number = 30;

        String string = String.format("/Users/claudio/AED2/aed2_lp2_2324/data/%sints.txt", Number.toString());

        generate30IntsFile_p(string, Number);

    }
    public static void generate30IntsFile_p(String filename, Integer quantity){

        Out out = new Out(filename);

        for (int i = 0; i < quantity; i++) {
            out.println(StdRandom.uniform(1000,9999));

        }

        out.close();

    }


    public static void read30IntsFile_p(String filename, Integer quantity){

        In in = new In(filename);
        String line;

        while (in.hasNextLine()){
            line = in.readLine();
            System.out.println();
        }

        in.close();
    }

}