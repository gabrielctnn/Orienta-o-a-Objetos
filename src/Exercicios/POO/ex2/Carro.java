package Exercicios.POO.ex2;

import java.util.Scanner;

public class Carro {
    //definindo classe construtora, com as regras definidas no exercicio
    public Carro(){
        this.estaLigado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }
    Scanner scan = new Scanner(System.in);

    //Criando os atributos e seus devidos getters e setters
    private boolean estaLigado;
    private int velocidade;
    private int velocidadeMaximaPermitida;
    private int velocidadeMinimaPermitida;
    private int marcha;

    public boolean getEstaLigado(){
        return estaLigado;
    }

    public void  setEstaLigado(boolean estaLigado){
        this.estaLigado = estaLigado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade){
      this.velocidade = velocidade;
    }

    public int getVelocidadeMaximaPermitida(){
        return velocidadeMaximaPermitida;
    }

    public void  setVelocidadeMaximaPermitida(int velocidadeMaximaPermitida){
        this.velocidadeMaximaPermitida = velocidadeMaximaPermitida;
    }

    public int getVelocidadeMinimaPermitida(){
        return velocidadeMinimaPermitida;
    }

    public void  setVelocidadeMinimaPermitida(int velocidadeMinimaPermitida){
        this.velocidadeMinimaPermitida = velocidadeMinimaPermitida;
    }

    public int getMarcha(){
        return marcha;
    }

    public void setMarcha(int marcha){
        // verifca se a marcha inserida existe
        if (marcha > 6 || marcha < 0 ){
            System.out.println("Só existem marchas de 0 a 6");
        } else {
            this.marcha = marcha;
            //define a velocidade maxima e minima pro marcha
            switch (marcha){
                case 0: this.velocidadeMaximaPermitida = 0; break;
                case 1: this.velocidadeMinimaPermitida = 0; this.velocidadeMaximaPermitida = 20; break;
                case 2: this.velocidadeMinimaPermitida = 21;this.velocidadeMaximaPermitida = 40; break;
                case 3: this.velocidadeMinimaPermitida = 41;this.velocidadeMaximaPermitida = 60; break;
                case 4: this.velocidadeMinimaPermitida = 61;this.velocidadeMaximaPermitida = 80; break;
                case 5: this.velocidadeMinimaPermitida = 81;this.velocidadeMaximaPermitida = 100; break;
                case 6: this.velocidadeMinimaPermitida = 101;this.velocidadeMaximaPermitida = 120; break;
            }
        }
    }

    public void ligarCarro(){
        this.estaLigado = true;
        System.out.print("Carro ligado!\n");
      return;
    }
    public void desligarCarro(){
        // verifica a regra de só poder desligar o carro no ponto morto e velocidade 0
        if (marcha != 0 || velocidade != 0) {
            System.out.print("Só pode desligar o carro no ponto morto e na velociade 0\n");
        } else {
            this.estaLigado = false;
            System.out.print("Carro desligado!\n");
        }
        return;
    }

    public void acelerar(){
        // Faz verificação se o carro está ligado
        if(!this.estaLigado) {
            System.out.println("Ligue o carro para acelerar!");
        } else {
            // Pergunta qual km quer acelerar
            System.out.printf("Deseja acelerar até qual KM/h? Por estar na %d marcha, pode acelerar entre %d-%d.\n", this.marcha, this.velocidadeMinimaPermitida, this.velocidadeMaximaPermitida);
            int addVelocidade = scan.nextInt();
            //verifica se o valor de velocidade é menor que a velocidade atual
            if (addVelocidade < this.velocidade) {
                System.out.println("Você está acelerando! Valor tem que ser maior que a velocidade atual");
            }// verifica se a velocidade está dentro da velocidade permitida pela marcha
            else if(addVelocidade > this.velocidadeMaximaPermitida || addVelocidade < velocidadeMinimaPermitida){
                System.out.println("Velocidade não permitida");
                return;
            } else{
                this.velocidade = addVelocidade;
                System.out.println("Acelerando!!!");
                return;
            }
        }
        return;
    }

    public void desacelerar(){
        // Faz verificação se o carro está ligado
        if(!this.estaLigado) {
            System.out.println("Ligue o carro para desacelerar!");
        } else {
            // Pergunta qual km quer acelerar
            System.out.printf("Deseja desacelerar até qual KM/h? Por estar na %d marcha, pode desacelerar entre %d-%d.\n", this.marcha, this.velocidadeMinimaPermitida, this.velocidadeMaximaPermitida);
            int addVelocidade = scan.nextInt();
            //verifica se o valor de velocidade é maior que a velocidade atual
            if (addVelocidade > this.velocidade) {
                System.out.println("Você está desacelerando! Valor tem que ser menor que a velocidade atual");
            }// verifica se a velocidade está dentro da velocidade permitida pela marcha
            else if(addVelocidade > this.velocidadeMaximaPermitida || addVelocidade < velocidadeMinimaPermitida){
                System.out.println("Velocidade não permitida");
                return;
            } else{
                this.velocidade = addVelocidade;
                return;
            }
        }
        return;
    }

    public void virarEsquerdaOuDireita(){
        if(!this.estaLigado) {
            System.out.println("Ligue o carro para dirigir!");
        } else {
            if (this.marcha > 2){
                System.out.println("Você está muito rápido! Desacelere para poder virar! (só pode virar para esquerda/direita se sua velocidade for de no mínimi 1km e no máximo 40km)");
            } else if (this.marcha == 0) {
                System.out.println("Seu carro está parado! Acelere para poder virar!");
            }else {
                System.out.println("Virando!");
            }
            return;
        }
    }

    public void verificarVelocidade(){
        if(!this.estaLigado) {
            System.out.println("Ligue o carro para ver a velocidade!");

        } else {
            System.out.printf("Velocidade atual: %dkm/h\n", this.velocidade);
        }
        return ;
    }
    public void trocarMarcha(){
        if(!this.estaLigado) {
            System.out.println("Ligue o carro para trocar de marcha!");
        } //verifica se é possivel trocar de marcha
        else if  (this.velocidade > this.velocidadeMaximaPermitida || this.velocidade < this.velocidadeMinimaPermitida)  {
            System.out.println("Está maior do que a marcha permite!");
            return;
        } else {
            setMarcha(this.marcha+1);
            System.out.printf("Marcha atual: %d\n", this.marcha);
        }
        return ;
    }
}
