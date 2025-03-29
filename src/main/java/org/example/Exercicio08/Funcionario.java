package org.example.Exercicio08;

public class Funcionario {
    String nome;
    double salarioBase;

    public Funcionario (String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("\nNome: " + nome);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Final: " + calcularSalarioFinal());
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Pedro", 5000.00);
        Estagiario estagiario = new Estagiario("Lucas", 1500.00);

        gerente.exibirDados();
        estagiario.exibirDados();
    }
}

class Gerente extends Funcionario {
    public Gerente (String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 1.2; // Bonus de 20%
    }
}

class Estagiario extends Funcionario {
    public Estagiario (String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase * 0.9; // Desconto de 10%
    }
}



