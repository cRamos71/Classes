package edu.ufp.inf.lp2.p03_course.version2;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;
import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Person;

import java.util.ArrayList;
import java.util.Objects;

public class Student extends Person {


    public Student() {
    }

    public Student(String idNumber, String name, String adress, Date birth, long number, Date registration, String email, String password) {
        super(idNumber, name, adress, birth);
        this.number = number;
        this.registration = registration;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", registration=" + registration +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return number == student.number && Objects.equals(registration, student.registration) && Objects.equals(email, student.email) && Objects.equals(password, student.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), number, registration, email, password);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private long number;
    private Date registration;

    private String email;

    private String password;

    private ArrayList <Grade> grades = new ArrayList<>();


    public void addGrade(Grade g){
        this.grades.add(g);
    }

    public Grade removeGrade(float g, String nd, Date d){
        for(Grade grade: grades){
            if(grade.getGrade() == g && grade.getDate().compareTo(d) == 0 && grade.getDiscipline().equals(nd)){
                this.grades.remove(grade);
                grade.associateStudent(null);
                return grade;
            }
        }
            return null;
    }

    public Grade changeGrade(float ng, float g, String nd, Date d){
        return null;
    }

    public Grade searchGrade(float g, String nd, Date d){
        return null;
    }

    public float averageGrades(){
        float mean = 0.0f;
        for (int i = 0; i < grades.size(); i++) {
            mean += grades.get(i).getGrade();
        }
        mean /= grades.size();
        return mean;
    }

    public Grade maxGrade(){
        Grade maxG = null;
        float max = 0.0f;
        for (int i = 0; i < grades.size(); i++) {
            if(grades.get(i).getGrade() > max){
                maxG = grades.get(i);
                max = grades.get(i).getGrade();
            }
        }
        return maxG;
    }

}
