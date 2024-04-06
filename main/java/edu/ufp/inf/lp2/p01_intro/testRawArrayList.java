package edu.ufp.inf.lp2.p01_intro;

import edu.ufp.inf.lp2.p01_intro.point_01.Point;

import java.util.ArrayList;

public class testRawArrayList {

    public static void main(String[] args) {

        ArrayList <Point> arrList1 = new ArrayList();

        arrList1.add(new Point(1.0f, 1.0f));
        arrList1.add(new Point(2.0f, 1.0f));
        Point p3 = new Point(5.5f,5.5f);
        arrList1.add(p3);

        System.out.println(arrList1.indexOf(p3));


    }

}
