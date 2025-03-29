package org.example.Exercicio12;

import java.util.Scanner;

public class ChatSimplesComArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro usuário: ");
        String nomeUser1 = scan.nextLine();

        System.out.println("Digite o nome do segundo usuário: ");
        String nomeUser2 = scan.nextLine();

        int numeroDeMensagens = 10;

        String[] mensagens =new String[numeroDeMensagens];

        for (int i = 0; i < numeroDeMensagens; i++){
            if (i % 2 == 0){
                System.out.println(nomeUser1 + ", digite sua mensagem: ");
            } else {
                System.out.println(nomeUser2 + ", digite sua mensagem: ");
            }

            String mensagem = scan.nextLine();
            mensagens[i] = (i % 2 == 0 ? nomeUser1 : nomeUser2) + ": " + mensagem;
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (String mensagem : mensagens){
            System.out.println(mensagem);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");
    }
}
