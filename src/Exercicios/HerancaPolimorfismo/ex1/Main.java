package Exercicios.HerancaPolimorfismo.ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception {
    Scanner scan = new Scanner(System.in);
    Ingresso michael = new Ingresso();
        michael.setValor(50.00);
        michael.setNomeFilme("Michael");
        michael.setTipo("Dublado");
        michael.retornaValor();

    MeiaEntrada michaelMeia = new MeiaEntrada();
        michaelMeia.setValor(50.00);
        michaelMeia.setNomeFilme("Michael");
        michaelMeia.setTipo("Dublado");
        michaelMeia.retornaValor();


        IngressoFamilia michaelFamilia = new IngressoFamilia();
        michaelFamilia.setNomeFilme("Michael");
        michaelFamilia.setValor(50.00);
        michaelFamilia.setTipo("Dublado");
        System.out.print("Digite a quantidade de pessoas da família: ");
        int qtd = scan.nextInt();
        michaelFamilia.calcularEFinalizar(qtd);
        michaelFamilia.retornaValor();

    }
}