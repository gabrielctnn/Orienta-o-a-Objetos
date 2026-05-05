package Exercicios.HerancaPolimorfismo.ex2;

public class Vendedor extends Usuario{
    Vendedor(){
        super.setAdmin(false);
    }

    private int numeroVendas;
    public int getNumeroVendas() {
        return numeroVendas;
    }
    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    public void RealizarVenda(){

    }
    public void ConsultarVendas(){

    }
}
