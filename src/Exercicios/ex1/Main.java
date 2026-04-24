package Exercicios.ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{Scanner scan = new Scanner(System.in);
    System.out.println("BEM VINDO (A) A CONTA BANCÁRIA");
    System.out.println("Quanto você deseja depositar para abrir sua conta?");
    double depositoInicial = scan.nextDouble();

    // Instancia a conta com o valor inicial fornecido pelo usuário
    ContaBancaria contaGabriel = new ContaBancaria(depositoInicial);

    // Inicia o fluxo de interação
    menu(contaGabriel);
    }

    /**
     * Gerencia a interface de usuário do sistema bancário.
     * param conta Objeto da conta que sofrerá as operações.
     */
    public static void menu(ContaBancaria contaGabriel){
        Scanner scan = new Scanner(System.in);
        System.out.println("##### CONTA BANCÁRIA #####\n");
        System.out.println("O que deseja fazer?");
        System.out.println("1. Consultar saldo.");
        System.out.println("2. Consultar cheque especial.");
        System.out.println("3. Depositar dinheiro.");
        System.out.println("4. Sacar dinheiro.");
        System.out.println("5. Pagar boleto");
        System.out.println("6. Verificar uso do cheque especial");
        System.out.println("\n0. Sair do programa");
        System.out.println("\n . Escolha o que deseja fazer:");;
        int escolha = scan.nextInt();
        switch(escolha){
            case 1 : contaGabriel.consultarSaldo() ; break;
            case 2 : contaGabriel.consultarChequeEspecial(); ; break;
            case 3 : contaGabriel.depositarDinheiro(); ; break;
            case 4 : contaGabriel.sacarDinheiro(); break;
            case 5 : contaGabriel.pagarBoleto(); break;
            case 6 : contaGabriel.usoChequeEspecial(); break;
            case 0 : ; break;
            default: menu(contaGabriel); break;
            // Reinicia o menu em caso de erro
    }
}
}




