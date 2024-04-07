package edu.ufp.inf.lp2.ertpjul16;

import edu.ufp.inf.lp2.p01_intro.p01_person.data.math.Date;

import java.time.LocalDate;

public class ApoliceCasa extends Apolice{

    private String endereco;
    private Date construcao;
    private float area;

    public ApoliceCasa(){

    }

    public ApoliceCasa(int numero, Date dataInit, Date dataFim, float cobertura, float premioBase, String endereco, Date construcao, float area) {
        super(numero, dataInit, dataFim, cobertura, premioBase);
        this.endereco = endereco;
        this.construcao = construcao;
        this.area = area;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getConstrucao() {
        return construcao;
    }

    public void setConstrucao(Date construcao) {
        this.construcao = construcao;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float premio(){
        Date now = new Date((short) 7, (short) 4,2024);
        return (float) (getPremioBase()+(getArea()*0.005)+(getConstrucao().diferenceYears(now)*0.01));
    }


    public static void main(String[] args) {

    }

}
