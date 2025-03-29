package org.example.Exercicio04;

import java.util.Scanner;

public class SimuladorDeEmprestimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o valor do emprestimo: ");
        int valorEmprestimo = scan.nextInt();

        int numParcelas;

        while(true){
            System.out.println("Em quantas parcelas voce deseja pagar (mínimo 6, máximo 48)");
            numParcelas = scan.nextInt();
            if (numParcelas >= 6 && numParcelas <= 48){
                break;
            }else {
                System.out.println("Valor invalido, tente novamente");
            }
        }

        double taxa = 0.03;

        double valorTotal = valorEmprestimo * Math.pow(1 + taxa, numParcelas);
        double mensalidade = valorTotal / numParcelas;

        System.out.println("### Simulacao Emprestimo ###");
        System.out.println("Cliente: " + nome);
        System.out.println(String.format("Valor total pago: R$%,.2f", valorTotal));
        System.out.println(String.format("Mensalidade: %d x R$%,.2f", numParcelas, mensalidade));

        scan.close();
    }
}
