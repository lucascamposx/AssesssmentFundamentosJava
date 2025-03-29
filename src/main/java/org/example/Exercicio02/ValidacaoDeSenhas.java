package org.example.Exercicio02;

import java.util.Scanner;

public class ValidacaoDeSenhas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = scan.nextLine();
        String senha;

        while (true){
            System.out.println("Crie uma Senha: ");
            String input = scan.nextLine();

            if (input.length() < 8) {
                System.out.println("A senha deve ter no minimo 8 caracteres");
            }
            else if (!input.matches(".*[A-Z].*")) {
                System.out.println("A senha deve ter pelo menos uma letra maiuscula");
            }
            else if (!input.matches(".*[0-9].*")) {
                System.out.println("A senha deve ter pelo menos um numero");
            }
            else if (!input.matches(".*[!#$%&()*-+/<=>?@_{|}].*")) {
                System.out.println("A senha deve ter pelo menos um caractere especial");
            }
            else {
                senha = input;
                System.out.println("Senha cadastrada com sucesso.");
                break;
            }
            System.out.println("Tente Novamente");
        }

        scan.close();
    }
}
