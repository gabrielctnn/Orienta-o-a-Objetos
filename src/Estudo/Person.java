package Estudo;

public class Person {
    //privamos as propriedades para que somente o que estiver dentro do PERSON consiga utiliza-las.
    private String nome;
    private int idade;

    // Criamos os get para poder receber os nomes/idades
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
    //criamos os set para poder DEFINIR os nomes/idades e o get receber.

    public void setNome(String nome){
        this.nome = nome; //Quando a conflito de nome de variaveis usamos o "this" para referenciar a variavel da CLASSE PERSON
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
