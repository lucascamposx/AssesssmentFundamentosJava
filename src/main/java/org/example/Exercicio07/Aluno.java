package org.example.Exercicio07;

import java.util.Scanner;

public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double nota3;

    public double calcularMedia(){
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public void verificarAprovacao(){
        if(this.calcularMedia() >= 7){
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite seu nome: ");
        aluno.nome = scan.nextLine();

        System.out.println("Digite sua matricula: ");
        aluno.matricula = scan.nextLine();

        System.out.println("Insira sua nota do Primeiro bimestre: ");
        aluno.nota1 = scan.nextDouble();

        System.out.println("Insira sua nota do Segundo bimestre: ");
        aluno.nota2 = scan.nextDouble();

        System.out.println("Insira sua nota do Terceiro bimestre: ");
        aluno.nota3 = scan.nextDouble();

        aluno.verificarAprovacao();
    }
}
