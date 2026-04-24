    package Exercicios.ex1;
    import java.util.Scanner;

    public class ContaBancaria {
        Scanner scan = new Scanner(System.in);
        /**
         * Construtor: Define o saldo inicial e calcula o limite do cheque especial
         * com base nas regras de negócio do banco.
         */
        public ContaBancaria(double depositoInicial){
            this.saldo = depositoInicial;
        // Regra: Depósito <= 500 ganha 50 de limite. Acima disso, ganha 50% do valor.
            if (depositoInicial <= 500.00) {
                this.chequeEspecial = 50.00;
            } else {
                this.chequeEspecial = depositoInicial * 0.5;
            }
        }

        // Atributos privados para garantir o encapsulamento (segurança dos dados)
        private double saldo;
        private double chequeEspecial;

        public double limiteChequeEspecial(){
            return this.saldo + this.chequeEspecial;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo (double saldo){
            this.saldo = saldo;
        }

        public double getChequeEspecial(){
            return chequeEspecial;
        }

        public void setChequeEspecial(double chequeEspecial){
            this.chequeEspecial = chequeEspecial;
        }

        // --- MÉTODOS DE OPERAÇÃO ---
        public void consultarSaldo(){
            System.out.printf("Seu saldo atual é de R$ %.2f \n", this.saldo);
            Main.menu(this);
        }
        public void consultarChequeEspecial(){
            System.out.printf("Seu saldo atual é de R$ %.2f \n", this.chequeEspecial);
            Main.menu(this);
        }
        public void sacarDinheiro(){
            System.out.printf("Quanto você deseja sacar? (Saldo atual R$ %.2f \n",this.saldo);
            double saque = scan.nextDouble();
            // Validação: Não permite sacar mais do que o saldo + limite permite
            if(saque > saldo + chequeEspecial) {
                System.out.println("Saldo insuficiente!");
                sacarDinheiro();
            } else {
                this.saldo -= saque;
                System.out.printf("Você sacou R$ %.2f \n" , saque);
                Main.menu(this);

            }
        }
        public void depositarDinheiro(){
            System.out.print("Quanto deseja depositar? ");
            double deposito = scan.nextDouble();
        // Regra de Juros: Se o saldo estiver negativo, cobra 20% sobre a dívida
            if (this.saldo < 0) {
                double divida = Math.abs(this.saldo);
                double taxa = divida * 0.20;
                System.out.printf("Cobrança de taxa de uso do cheque especial: R$ %.2f\n", taxa);
                this.saldo -= taxa;
            }
            this.saldo += deposito;
            System.out.printf("R$ %.2f foram depositados", deposito);
            Main.menu(this);
        }
        public void pagarBoleto(){
            System.out.println("Qual valor do boleto?");
            double boleto = scan.nextDouble();
            if(boleto > saldo + chequeEspecial) {
                System.out.println("Saldo insuficiente!");
                pagarBoleto();
            } else {
                this.saldo -= boleto;
                System.out.printf("Você pago o boleto de R$ %.2f", boleto);
                Main.menu(this);
            }
        }

        public void usoChequeEspecial(){
            if (this.saldo < 0) {
                // O valor usado é o quanto o saldo está abaixo de zero
                double usado = Math.abs(this.saldo);
                System.out.printf("Você está usando R$ %.2f do seu cheque especial.\n", usado);
            } else {
                System.out.println("Você não está utilizando o cheque especial no momento.");
            }
            Main.menu(this); // Volta para o menu
        }


    }
