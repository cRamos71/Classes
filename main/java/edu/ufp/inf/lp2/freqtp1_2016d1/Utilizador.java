package edu.ufp.inf.lp2.freqtp1_2016d1;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;
import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Person;

import java.util.ArrayList;
import java.util.Objects;

public class Utilizador extends Person{

    private String uname;
    private String passwd;
    ArrayList<Livro> livros = new ArrayList<>();

    public Utilizador(){
    }

    public Utilizador(String idNumber, String name, String adress, Date birth, String uname, String passwd) {
        super(idNumber, name, adress, birth);
        this.uname = uname;
        this.passwd = passwd;
    }

    public String getUname(){
        return uname;
    }

    public void setUname(String uname){
        this.uname = uname;
    }

    public String getPasswd(){
        return passwd;
    }

    public void setPasswd(String passwd){
        this.passwd = passwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Utilizador that = (Utilizador) o;
        return Objects.equals(uname, that.uname) && Objects.equals(passwd, that.passwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), uname, passwd);
    }

    public void recebe(Livro l){
        if (!livros.contains(l))
            livros.add(l);
    }

    public Livro devolve(String t){
        for (Livro l : livros){
            if (l.getTitulo().equals(t))
                return l;
        }
        return null;
    }

    public void empresta(Livro l, Utilizador u){
        if (livros.contains(l)){
            livros.remove(l);
            u.livros.add(l);
        }else System.out.println("The user does not have that book!");
    }

}
