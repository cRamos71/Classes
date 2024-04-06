package edu.ufp.inf.lp2.p01_intro.p01_person.data.math;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Person {

    private String idNumber;
    private String name;
    private String adress;

    private Date birth;


    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", birth=" + birth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(idNumber, person.idNumber) && Objects.equals(name, person.name) && Objects.equals(adress, person.adress) && Objects.equals(birth, person.birth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber, name, adress, birth);
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Person(String idNumber, String name, String adress, Date birth) {
        this.idNumber = idNumber;
        this.name = name;
        this.adress = adress;
        this.birth = birth;
    }

    /**
     * @return
     */
    public int age() {
        LocalDate data = LocalDate.now();
        return data.getYear() - this.birth.getYear();
    }

    /**
     * @param p 
     * @return
     */
    public boolean olderThan(Person p) {
        // TODO implement here
        return false;
    }

}