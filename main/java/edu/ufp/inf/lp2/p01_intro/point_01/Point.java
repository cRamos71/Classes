package edu.ufp.inf.lp2.p01_intro.point_01;

import java.util.*;


/**
 * 
 */
public class Point {

    /**
     * Default constructor
     */
    public Point() {
    }

    /**
     * 
     */
    private float x;

    /**
     * 
     */
    private float y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return Float.compare(x, point.x) == 0 && Float.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param p 
     * @return
     */
    public float distX(Point p) {
        return this.x - p.x;
    }

    /**
     * @param p 
     * @return
     */
    public float distY(Point p) {
        return this.y - p.y;
    }

    /**
     * @param p 
     * @return
     */
    public float dist(Point p) {
        return (float) Math.sqrt(Math.pow(this.distX(p), 2) + Math.pow(this.distY(p), 2));
    }

    /**
     * @param delta 
     * @return
     */
    public void moveX(float delta) {
        this.x += delta;
        // TODO implement here
    }

    /**
     * @param delta 
     * @return
     */
    public void moveY(float delta) {
        this.y += delta;
    }

    /**
     * @param x 
     * @param y 
     * @return
     */
    public void move(float x, float y) {
        this.moveX(x);
        this.moveY(y);
    }

    /**
     * @return
     */
    public void printPoint() {
        System.out.println(this);
    }

    /**
     * @param args 
     * @return
     */
    public static void main(String[] args) {
        // TODO implement here
    }

}