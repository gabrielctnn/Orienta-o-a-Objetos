package Estudo;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);

        Person homem = new Person();
        homem.setNome("Gabriel");
        homem.setIdade(18);

        Person mulher = new Person();
        mulher.setNome("Cerri");
        mulher.setIdade(19);

        System.out.printf("Nome: %s\n" + "Idade: %d\n", homem.getNome(), homem.getIdade());
        System.out.printf("Nome: %s\n" + "Idade: %d\n", mulher.getNome(), mulher.getIdade());
    }
}