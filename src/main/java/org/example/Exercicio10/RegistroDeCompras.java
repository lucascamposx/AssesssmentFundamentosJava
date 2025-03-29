package org.example.Exercicio10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class RegistroDeCompras {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        var builder = new StringBuilder();

        System.out.println("Cadastre 3 compras: ");
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do produto: ");
            String produto = scan.nextLine();

            System.out.println("Digite a quantidade pegas de " + produto + ": ");
            int quantidade = Integer.parseInt(scan.nextLine());

            System.out.println("Digite o preco da unidade do " + produto + ": ");
            double preco = Double.parseDouble(scan.nextLine());

            builder.append(String.format("Produto: %s | Quantidade: %d | Preço: R$ %.2f%n",
                    produto, quantidade, preco));
        }

        try {
            // Cria e escreve no arquivo
            Path arquivo = Path.of("compras.txt");

            if (Files.exists(arquivo)) {
                System.out.println("O arquivo ja existe e sera sobrescrito");
            }

            Files.writeString(arquivo, builder.toString(), StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);

            System.out.println("Arquivo salvo em: " + arquivo.toAbsolutePath());

            // Ler o Arquivo
            List<String> linhas = Files.readAllLines(arquivo, StandardCharsets.UTF_8);
            linhas.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Erro ao Criar e escrever no arquivo");
        }
    }
}
