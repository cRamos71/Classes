package edu.ufp.inf.lp2.freqtp1_2016d1;

public class GestaoAcesso {

    BD bdUtilizadores;

    public GestaoAcesso(){
    }

    public boolean registo(Utilizador u){
        return bdUtilizadores.resgista(u);
    }

    public Sessao login(Utilizador u){
        if (bdUtilizadores.existe(u))
          return new Sessao();
        return null;
    }

}
