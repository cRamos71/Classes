package edu.ufp.inf.lp2.freqtp1_2016d1;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;

import java.util.ArrayList;
import java.util.Objects;

public class Livro {

    private String titulo;
    ArrayList<String> autores = new ArrayList<>();
    private Date publicacao;
    Utilizador user;

    public Livro() {
    }

    public Livro(String titulo, Date publicacao) {
        this.titulo = titulo;
        this.publicacao = publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(publicacao, livro.publicacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, publicacao);
    }

    public boolean requisitado(){
        return user == null;
    }

}
