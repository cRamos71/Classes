package edu.ufp.inf.lp2.p01_intro.p00_videoclub;
import java.util.*;

/**
 * 
 */
public class Movie {

    /**
     * Default constructor
     */
    public Movie() {
    }

    private String title;

    private int year;

    /**
     * 
     */
    public void addGenre(Genre g) {
        // TODO implement here
    }

    /**
     * @param g 
     * @return
     */
    public Genre deleteGenre(Genre g) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList <Genre> listGenre() {
        // TODO implement here
        return null;
    }

    /**
     * @param a  
     * @return
     */
    public Actor addActor(Actor a ) {
        // TODO implement here
        return null;
    }

    /**
     * @param a  
     * @return
     */
    public Actor deleteActor(Actor a ) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList <Actor> listActors() {
        // TODO implement here
        return null;
    }

    /**
     *
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     */
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}