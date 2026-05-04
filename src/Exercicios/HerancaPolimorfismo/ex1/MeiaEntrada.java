package Exercicios.HerancaPolimorfismo.ex1;

public class MeiaEntrada extends Ingresso{
    @Override
    public void setValor(double valor) {
        super.setValor(valor / 2);
    }

    @Override
    public void retornaValor(){
        System.out.println("Valor meia entrada para "+ this.getNomeFilme() + ":" + this.getValor());
        System.out.println("Valor Original ingresso: " + this.getValor());
    }
}
