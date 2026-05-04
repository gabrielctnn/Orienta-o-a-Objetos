package Exercicios.HerancaPolimorfismo.ex1;

public class Ingresso {
    private double valor;
    private String nomeFilme;
    private String tipo; // Dublado ou legendado

    public double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public String getNomeFilme(){
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme){
        this.nomeFilme = nomeFilme;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void retornaValor(){
        System.out.println("Valor ingresso para "+ this.nomeFilme + ":" + this.valor);
    }
}