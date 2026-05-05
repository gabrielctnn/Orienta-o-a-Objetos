package Exercicios.HerancaPolimorfismo.ex2;

public class Atendente extends Usuario{
    Atendente(){
       setAdmin(false);
    }

    private double valorNoCaixa;
    public double getValorNoCaixa() {
        return valorNoCaixa;
    }
    public void setValorNoCaixa(double valorNoCaixa) {
        this.valorNoCaixa = valorNoCaixa;
    }

    public void ReceberPagamentos(){

    }
    public void FecharCaixa(){

    }
}
