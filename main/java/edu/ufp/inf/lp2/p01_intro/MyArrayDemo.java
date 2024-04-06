package edu.ufp.inf.lp2.p01_intro;

import edu.ufp.inf.lp2.p01_intro.point_01.Point;

public class MyArrayDemo {

    public static void main(String[] argv){

    }

    public static void testArrayPrimitives(){

        int [] intArray = new int[3];
        float floatArray[] = new float[3];

        for (int i = 0; i < intArray.length; i++){
            intArray[i] = 2;
            System.out.println(intArray.length);
        }

    }


    public static void testArrayObject(){
        Point[] pointArray = new Point[3];
    }


}
