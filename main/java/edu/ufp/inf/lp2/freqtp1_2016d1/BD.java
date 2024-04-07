package edu.ufp.inf.lp2.freqtp1_2016d1;

import java.util.ArrayList;

public class BD implements GestaoUtilizadores, GestaoLivros{

    private ArrayList<Utilizador> utilizadores = new ArrayList<>();

    private ArrayList<Livro> livros = new ArrayList<>();

    @Override
    public void add(Livro l) {
        if (!livros.contains(l))
            livros.add(l);
    }

    @Override
    public Livro procuraLivro(String t) {
        for (Livro l : livros){
            if (l.getTitulo().equals(t))
                return l;
        }
        return null;
    }

    @Override
    public ArrayList<Livro> procuraLivro(String t, String a) {
        ArrayList<Livro> returnLivros = new ArrayList<>();

        for (Livro l : livros){
            if (l.getTitulo().equals(t))
                if (l.autores.contains(a))
                     returnLivros.add(l);
        }

        return returnLivros;
    }

    @Override
    public boolean resgista(Utilizador u) {
        if (!utilizadores.contains(u)){
            utilizadores.add(u);
            return true;
        }
        return false;
    }

    @Override
    public boolean existe(Utilizador u) {
        return utilizadores.contains(u);
    }
}
