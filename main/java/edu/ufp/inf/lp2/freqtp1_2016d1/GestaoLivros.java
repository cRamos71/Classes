package edu.ufp.inf.lp2.freqtp1_2016d1;

import java.util.ArrayList;

public interface GestaoLivros {

    public void add(Livro l);

    public Livro procuraLivro(String t);

    public ArrayList<Livro> procuraLivro(String t, String a);

}
