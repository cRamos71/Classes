package edu.ufp.inf.lp2.ertpjul16;

import edu.princeton.cs.algs4.ST;
import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;

import java.util.ArrayList;

public class Seguradora {

    private String nome;

    ArrayList<Client> clientes = new ArrayList<>();
    ST<Integer, Apolice> symbolTable = new ST<>();

    public Seguradora(){

    }

    public Seguradora(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void novoContrato(Apolice a, Client c){
        if (!clientes.contains(c) && !symbolTable.contains(a.getNumero())){
            clientes.add(c);
            symbolTable.put(a.getNumero(), a);
        }
    }

    public Apolice procuraApolice(int num){
        return symbolTable.get(num);
    }

    public ArrayList<Apolice> procuraApolices(int nif, Date di, Date df){
        ArrayList<Apolice> returnApolices = new ArrayList<>();

        for (Integer key : symbolTable){
            Apolice a = symbolTable.get(key);
            if (a.getDataFim().beforeDate(df)  && a.getDataInit().afterDate(di)){
                if (a.getClient().getNif() == nif)
                    returnApolices.add(a);
            }
        }

        return returnApolices;
    }

    public Client procuraCliente(int nif){
        for (Client c : clientes){
            if(c.getNif() == nif)
                return c;
        }
        return null;
    }

    public Client procuraClienteA(int apoliceNum){
        Apolice a = symbolTable.get(apoliceNum);
        return a.getClient();
    }

    public ArrayList<Apolice> procuraApolices(int nif, String type){
        ArrayList<Apolice> returnApolices = new ArrayList<>();

        for (Integer key : symbolTable){
            Apolice a = symbolTable.get(key);
            if (a.getClient().getNif() == nif)
                returnApolices.add(a);
        }
        return returnApolices;
    }

    public void eliminaContrato(Apolice a, Client c){
        symbolTable.remove(a.getNumero());
        clientes.remove(c);
    }

    public static void main(String[] args) {

    }

}
