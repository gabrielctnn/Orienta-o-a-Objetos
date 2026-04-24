package Exercicios.ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("BEM VINDO AO SEU CARRO!");
        Carro carroGabriel = new Carro();
        menu(carroGabriel);
    }

    public static void menu(Carro carroGabriel){
        Scanner scan = new Scanner(System.in);
        int escolha = -1;
        while(escolha != 0){


                System.out.println("O que deseja fazer no seu carro?\n");
                System.out.println("1. Ligar carro.       5. Virar esquerda/direita");
                System.out.println("2. Desligar carro     6. Verificar Velocidade");
                System.out.println("3. Acelerar           7. Trocar marcha");
                System.out.println("4. Desacelerar        0. Sair do programa ");
                System.out.println("\n . Escolha o que deseja fazer:");;
            escolha = scan.nextInt();

                switch (escolha){
                    case 1: carroGabriel.ligarCarro(); break;
                    case 2: carroGabriel.desligarCarro(); break;
                    case 3: carroGabriel.acelerar(); break;
                    case 4: carroGabriel.desacelerar(); break;
                    case 5: carroGabriel.virarEsquerdaOuDireita(); break;
                    case 6: carroGabriel.verificarVelocidade(); break;
                    case 7: carroGabriel.trocarMarcha(); break;
                    case 0: break;
                    default: menu(carroGabriel); break;
                }
        }

    }
}
