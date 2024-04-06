package edu.ufp.inf.lp2.p01_intro.point_01;

/**
 * 
 */
public class Rectangle {

    /**
     * Default constructor
     */
    public Rectangle() {
    }

    private Point ulc;

    private Point lrc;

    @Override
    public String toString() {
        return "Rectangle{" +
                "ulc=" + ulc +
                ", lrc=" + lrc +
                '}';
    }

    /**
     * @param dx 
     * @param dy 
     * @return
     */
    public void move(float dx, float dy) {
        // TODO implement here
    }

    /**
     * @return
     */
    public float area() {
        return Math.abs(this.lrc.distX(ulc)) * Math.abs(this.lrc.distY(ulc));
    }

    /**
     * @return
     */
    public float perimeter() {
        return (Math.abs(this.lrc.distX(ulc)) + Math.abs(this.lrc.distY(ulc)))*2;
    }

    /**
     * @param p 
     * @return
     */
    public boolean isInside(Point p) {
        // TODO implement here
        return false;
    }

    /**
     * @param p 
     * @return
     */
    public boolean isOutside(Point p) {
        // TODO implement here
        return false;
    }

    /**
     * @param args 
     * @return
     */
    public void main(String args) {
        // TODO implement here
    }

    /**
     *
     */
    public Point getUlc() {
        return ulc;
    }

    public void setUlc(Point ulc) {
        this.ulc = ulc;
    }

    /**
     *
     */
    public Point getLrc() {
        return lrc;
    }

    public void setLrc(Point lrc) {
        this.lrc = lrc;
    }
}