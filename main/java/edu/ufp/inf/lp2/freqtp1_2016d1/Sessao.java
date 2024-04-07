package edu.ufp.inf.lp2.freqtp1_2016d1;

import jdk.jshell.execution.Util;

import java.util.ArrayList;

public class Sessao{

    BD bdLivros;

    public Sessao(){
    }

    public void adicionaLivro(Livro b){
        bdLivros.add(b);
    }

    public ArrayList<Livro> procuraLivros(String t, String a){
         return bdLivros.procuraLivro(t,a);
    }

    public void requisitaLivro(Livro l, Utilizador u){
        u.recebe(l);
    }

    public void emprestaLivro(Livro l, Utilizador u1, Utilizador u2){
        u1.empresta(l,u2);
    }

}
