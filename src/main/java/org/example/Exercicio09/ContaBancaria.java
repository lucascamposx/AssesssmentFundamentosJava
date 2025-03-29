package org.example.Exercicio09;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso.");
        } else {
            System.out.println("Valor Invalido.");
        }
    }

    public void sacar(double valor) {
        if ((saldo - valor) >= 0) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(100.00);
        conta.sacar(300.00);
        conta.sacar(70.00);
        conta.exibirSaldo();
    }
}
