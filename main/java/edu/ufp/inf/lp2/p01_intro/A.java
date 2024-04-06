package edu.ufp.inf.lp2.p01_intro;

import edu.ufp.inf.lp2.p01_intro.point_01.Point;

public class A {


    public static void main(String[] args){
        A a = new A();
        System.out.println(a);

        Object o = new Object();
        o = new A();
        o = new Point(0.0f, 0.0f);

        System.out.println(((Point) o).dist(new Point(1.0f, 2.0f)));

    }

}
