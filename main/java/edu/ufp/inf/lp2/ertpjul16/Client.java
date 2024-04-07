package edu.ufp.inf.lp2.ertpjul16;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;

import java.util.ArrayList;
import java.util.Objects;

public class Client {

    private int nif;
    private String nome;
    private Date nasceu;
    private int carta;
    private Date dataCarta;
    ArrayList<Apolice> aApolices = new ArrayList();

    public Client(){

    }

    public Client(int nif, String nome, Date nasceu, int carta, Date dataCarta) {
        this.nif = nif;
        this.nome = nome;
        this.nasceu = nasceu;
        this.carta = carta;
        this.dataCarta = dataCarta;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNasceu() {
        return nasceu;
    }

    public void setNasceu(Date nasceu) {
        this.nasceu = nasceu;
    }

    public int getCarta() {
        return carta;
    }

    public void setCarta(int carta) {
        this.carta = carta;
    }

    public Date getDataCarta() {
        return dataCarta;
    }

    public void setDataCarta(Date dataCarta) {
        this.dataCarta = dataCarta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return nif == client.nif && carta == client.carta && Objects.equals(nome, client.nome) && Objects.equals(nasceu, client.nasceu) && Objects.equals(dataCarta, client.dataCarta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nome, nasceu, carta, dataCarta);
    }


    public ArrayList<Apolice> apolices(Date di, Date df){
        ArrayList<Apolice> returnAL = new ArrayList<>();

        for (Apolice a : aApolices){
            if (a.getDataFim().beforeDate(df)  && a.getDataInit().afterDate(di)){
                returnAL.add(a);
            }
        }
        return returnAL;
    }

    public ArrayList<Apolice> apolices(String type){
        ArrayList<Apolice> returnAL = new ArrayList<>();

        for (Apolice a : aApolices){
        }
        return returnAL;
    }

    public Apolice apoliceMaisCara(){
        Apolice returnA = null;
        float maxP = 0f;
        for (Apolice a : aApolices){
            if (a.premio() > maxP){
                maxP = a.premio();
                returnA = a;
            }
        }
        return returnA;
    }

    public void novaApolice(Apolice a){
        aApolices.add(a);
    }

    public void revogarApolice(Apolice a){
        aApolices.remove(a);
    }


    public static void main(String[] args) {

    }
}
