package edu.ufp.inf.lp2.p03_course.version2;

import java.util.ArrayList;
import java.util.Objects;

public class CourseClass {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseClass(String name) {
        this.setName(name);
    }

    public CourseClass() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CourseClass that)) return false;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "name='" + getName() + '\'' +
                '}';
    }

    private String name;

    private ArrayList <Student> students;

    private ArrayList <Discipline> disciplines;


    public ArrayList <Student> searchStudent(String name){
        ArrayList <Student> resultArray = new ArrayList();
        for(int i = 0; i < students.size(); i++) {
            if(students.get(i).getName().equals(name))
                resultArray.add(students.get(i));
        }
        return resultArray;
    }

    public Student searchStudent(long number){

        for(int i = 0; i < students.size(); i++) {
            //if(students.get(i).)
        }
        return null;
    }

    public Discipline searchDiscipline(String name){
        return null;
    }

    public void registerStudent(Student s){

    }

    public Student unregisterStudent(String name){
        return null;
    }

    public void associateDiscipline(Discipline d) {
    }

    public  Discipline desassociateDiscipline(String dname) {
        return null;
    }

    public void launchGrade(String disciplinename, long studentnumber, float grade) {
    }

    public void associateGrade2Discipline(String disciplinename, long studentnumber, float grade) {
    }

}
