package Exercicios.HerancaPolimorfismo.ex2;

public abstract class Usuario {
    private String nome;
    private String email;
    private int senha;
    private boolean admin;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


    public void realizarLogin(){

    }
    public void realizarLogoff(){
    }
    public void realizarLogon(){
    }
    public void alterarDados(){

    }
    public void alterarSenha(){

    }
}
