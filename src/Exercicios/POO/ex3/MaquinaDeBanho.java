package Exercicios.POO.ex3;
import java.util.Scanner;

public class MaquinaDeBanho {
    Scanner scan = new Scanner(System.in);
    public MaquinaDeBanho(){
        this.nivelDeAgua = 30;
        this.nivelDeShampoo = 10;
        this.petNaMaquina = false;
        this.maquinaLimpa = true;

    }
    //Criação dos atributos e encapsulando eles
    private double nivelDeAgua;
    private double nivelDeShampoo;
    private boolean petNaMaquina;
    private boolean maquinaLimpa;

   public double getNivelDeAgua(){
       return nivelDeAgua;
   }
    public void getNivelDeAgua(double nivelDeAgua){
       // verifica se o valor colocado excede o limite de agua da maquina
        if(nivelDeAgua > 30){
            System.out.println("Você não pode ultrapassar o limite de água da máquina! Coloque menos! (Limite de água da máquina é 30L)\n");
        } else{
        this.nivelDeAgua = nivelDeAgua;
        }
    }

    public double getNivelDeShampoo(){
       return nivelDeShampoo;
    }
    public void setNivelDeShampoo(double nivelDeShampoo){
        // verifica se o valor colocado excede o limite de shampoo da maquina
        if(nivelDeShampoo > 10){
            System.out.println("Você não pode ultrapassar o limite de shampoo da máquina! Coloque menos! (Limite de água da máquina é 10L)\n");
        } else{
            this.nivelDeShampoo = nivelDeShampoo;
        }
    }

    public boolean getPetNaMaquina(){
       return petNaMaquina;
    }

    public void setPetNaMaquina(boolean petNaMaquina){
       this.petNaMaquina = petNaMaquina;
    }

    public boolean getMaquinaLimpa(){
       return maquinaLimpa;
    }

    public void setMaquinaLimpa(boolean maquinaLimpa){
       this.maquinaLimpa = maquinaLimpa;
    }

    // Criação dos Métodos;

    public void banho(){
       if (!petNaMaquina) {
            System.out.println("Precisa ter um pet na máquina para dar o banho!\n");
       }else if (!this.maquinaLimpa){
           System.out.println("Máquina suja, por favor limpe para usar novamente!\n");
       }else if (nivelDeAgua < 10 || nivelDeShampoo < 2){
           System.out.println("A máquina não possui água ou shampoo suficiente, favor reabastecer!\n");
       } else {
           System.out.println("Começando o banho no pet! \uD83E\uDDF4 \uD83E\uDEE7");
           System.out.println("Não esqueça de retirar o pet da máquina!\n");
           this.nivelDeAgua -= 10;
           this.nivelDeShampoo -= 2;
           this.maquinaLimpa = false;
       }
        return;
    }

    public void abastecerAgua(){
       System.out.printf("Quantos litros de água você deseja colocar? Máximo permitido por abastecimento 2 Litros.(Nível atual: %f/30\n", this.nivelDeAgua);
       double abastecimento = scan.nextDouble();
       if (abastecimento > 2 || abastecimento <= 0) {
           System.out.println("Valor inválido coloque um valor permitido!\n");
       } else {
           if (this.nivelDeAgua + abastecimento> 30) {
               System.out.println("O TANQUE VAI TRANSBORDAR! Coloque menos!\n");
           } else {
               this.nivelDeAgua += abastecimento;
          System.out.println("Abastecido!\n");
           }
       }
       return;
    }


    public void abastecerShampoo(){
        System.out.printf("Quantos litros de shampoo você deseja colocar? Máximo permitido por abastecimento 2 Litros.(Nível atual: %f/30\n", this.nivelDeShampoo);
        double abastecimento = scan.nextDouble();
        if (abastecimento > 2 || abastecimento <= 0) {
            System.out.println("Valor inválido coloque um valor permitido!\n");
        } else {
            this.nivelDeShampoo += abastecimento;
            System.out.println("Abastecido!\n");
        }
        return;
    }

    public void verificarNivelAguaEShampoo(){
       System.out.printf("Nível atual de água: %.2fL/30L\n", this.nivelDeAgua);
        System.out.printf("Nível atual de shampoo: %.2fL/10L\n", this.nivelDeShampoo);
        return;
    }

    public void verificarPetNaMaquina(){
       if (this.petNaMaquina){
           System.out.println("Já tem um pet na máquina, dê banho ou retire-o!\n");
       } else {
           System.out.println("A máquina está vazia!\n");
       }
       return;
    }

    public void colocarPetNaMaquina(){
       if (this.petNaMaquina) {
           System.out.println("Já tem um pet na máquina, dê banho ou retire-o!\n");
       } else {
           System.out.println("Colocando pet!\n");
           this.petNaMaquina = true;
       }
        return;
    }
    public void retirarPetNaMaquina(){
        if (!this.petNaMaquina) {
            System.out.println("Não tem pet na máquina!\n");
        } else {
            System.out.println("Retirando pet!\n");
            this.petNaMaquina = false;
            this.maquinaLimpa = false;
        }
        return;
    }

    public void limparMaquina(){
       if(maquinaLimpa){
           System.out.println("Máquina já está limpa!");
       } else if (this.nivelDeAgua < 3 || this.nivelDeShampoo < 1){
            System.out.println("Nível de água ou shampoo abaixo do necessário. É preciso de 3L de água e 1L de shampoo para exectuar a limpeza.");
       } else {
           System.out.println("Limpando a máquina!");
           this.nivelDeAgua -= 3;
           this.nivelDeShampoo -= 1;
           this.maquinaLimpa = true;
       }
    }
}
