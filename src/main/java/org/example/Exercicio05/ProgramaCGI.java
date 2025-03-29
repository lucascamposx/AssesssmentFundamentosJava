package org.example.Exercicio05;

public class ProgramaCGI {

    public static void main(String[] args) {
        System.out.println(
                "Content-Type: text/html\n" +
                "\n" +
                "<html>\n" +
                "<head><title>Saudação CGI</title></head>\n" +
                "<body>\n" +
                "<h1>Olá, Terráqueos!</h1>\n" +
                "</body>\n" +
                "</html>");
    }
}
