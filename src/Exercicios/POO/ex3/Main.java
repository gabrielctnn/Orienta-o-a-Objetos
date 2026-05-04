package Exercicios.POO.ex3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.println(" ##### BEM VINDO AO BANHO NO PETSHOP ##### ");
    MaquinaDeBanho maquina1 = new MaquinaDeBanho();
    menu (maquina1);
    }
    public static void menu(MaquinaDeBanho maquina1){
        Scanner scan = new Scanner(System.in);
        int escolha = -1;
        while (escolha != 0){
            System.out.println("\nO que deseja fazer?\n");
            System.out.println("1. Dar banho       5. Verificar máquina ocupada");
            System.out.println("2. Abastecer Água     6. Colocar pet na máquina");
            System.out.println("3. Abastecer Shampoo          7. Tirar pet da máquina");
            System.out.println("4. Verificar Nível Água e Shampoo        8.Limpar máquina ");
            System.out.println("0. Sair do programa ");
            System.out.println("\nEscolha o que deseja fazer:");;
            escolha = scan.nextInt();

            switch (escolha){
                case 1: maquina1.banho(); break;
                case 2: maquina1.abastecerAgua(); break;
                case 3: maquina1.abastecerShampoo(); break;
                case 4: maquina1.verificarNivelAguaEShampoo(); break;
                case 5: maquina1.verificarPetNaMaquina(); break;
                case 6: maquina1.colocarPetNaMaquina(); break;
                case 7: maquina1.retirarPetNaMaquina(); break;
                case 8: maquina1.limparMaquina(); break;
                case 0: break;
                default: menu(maquina1); break;
            }
        }
    }
}
