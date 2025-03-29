package org.example.Exercicio03;

import java.util.Scanner;

public class CalculadoraDeImpostos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite seu salário mensal: ");
        double salarioMensal = scan.nextDouble();
        double salarioAnual = salarioMensal * 12;
        double aliquota = 0.0;

        if (salarioAnual > 45012.60) {
            aliquota = 27.5;
        } else if (salarioAnual >= 33919.81) {
            aliquota = 15.0;
        } else if (salarioAnual >= 22847.77) {
            aliquota = 7.5;
        } else {
            System.out.println(nome + ", seu imposto de Renda foi isento");
            scan.close();
            return;
        }

        double imposto = salarioAnual * aliquota / 100;
        double salarioLiquidoAnual = salarioAnual - imposto;

        System.out.println(String.format("%s, seu Imposto de Renda: %.2f",nome, imposto));
        System.out.println(String.format("%s, seu Salário Líquido Anual: %.2f",nome, salarioLiquidoAnual));

        scan.close();
    }
}

