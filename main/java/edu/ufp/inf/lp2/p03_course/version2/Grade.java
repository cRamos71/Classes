package edu.ufp.inf.lp2.p03_course.version2;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;

import java.util.Objects;

public class Grade {

    private float grade;

    private Date date;

    private Discipline discipline;

    private Student student;

    @Override
    public String toString() {
        return "Grade{" +
                "grade=" + grade +
                ", date=" + date +
                ", discipline=" + discipline +
                ", student=" + student +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grade grade1)) return false;
        return Float.compare(grade, grade1.grade) == 0 && Objects.equals(date, grade1.date) && Objects.equals(discipline, grade1.discipline) && Objects.equals(student, grade1.student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, date, discipline, student);
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Grade(float grade, Date date, Discipline discipline, Student student) {
        this.grade = grade;
        this.date = date;
        this.discipline = discipline;
        this.student = student;
    }

    public Grade() {
    }

    public Discipline associatedDiscipline(){
       return this.discipline;
    }

    public void associateDiscipline(Discipline discipline){
        this.discipline = discipline;
    }

    public Student associatedStudent(){
        return this.student;
    }

    public void associateStudent(Student student){
        this.student = student;
    }

}
