package Exercicios.HerancaPolimorfismo.ex1;

public class IngressoFamilia extends Ingresso{

    public void calcularEFinalizar(int qtdPessoasFamilia) {
        double valorIngresso = getValor();

        if (qtdPessoasFamilia > 3) {
            double valorComDesconto = valorIngresso * 0.95;
            super.setValor(valorComDesconto * qtdPessoasFamilia);
        } else {
            super.setValor(valorIngresso * qtdPessoasFamilia);
        }
    }
    @Override
    public void retornaValor(){
        System.out.println("Valor ingressos família para"+ this.getNomeFilme() + ":" + this.getValor());
    }
}
