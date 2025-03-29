package org.example.Exercicio11;

import java.util.Random;
import java.util.Scanner;

public class SimulacaoDeLoteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numLoteria = new int[6];
        int[] numUsuario = new int[6];

        Random random = new Random();

        // Gera numeros Aleatorios, garantindo que nao seja repetidos
        for (int i = 0; i < 6; i++) {
            while (true) {
                int num = random.nextInt(60) + 1;
                boolean numRepetido = false;

                for (int j = 0; j < i; j++) {
                    if (numLoteria[j] == num) {
                        numRepetido = true;
                        break;
                    }
                }
                if (!numRepetido) {
                    numLoteria[i] = num;
                    break;
                }
            }
        }

        // Solicita Numeros ao Usuario, garantindo que nao seja repetidos e entre 1 e 60
        for (int i = 0; i < 6; i++) {
            while (true) {
                try {
                    System.out.println(i + 1 + ". Digite um numero entre 1 e 60: ");
                    int num = Integer.parseInt(scan.next());

                    if (num > 0 && num <= 60) {
                        boolean numRepetido = false;

                        for (int numUser : numUsuario) {
                            if (num == numUser) {
                                numRepetido = true;
                                break;
                            }
                        }

                        if (numRepetido) {
                            System.out.println("\nNumero repetido, tente novamente.");
                        } else {
                            numUsuario[i] = num;
                            break;
                        }
                    } else {
                        System.out.println("\nNumero invalido, tente novamente.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("\nEntrada invalida, digite um numero valido.");
                }
            }
        }

        int acertos = 0;
        for (int num1 : numLoteria) {
            for (int num2 : numUsuario) {
                if (num1 == num2) {
                    acertos++;
                }
            }
        }

        System.out.print("\nNumeros sorteados: ");
        for (int num : numLoteria) {
            System.out.print(num + " ");
        }

        System.out.print("\nNumeros do usuário: ");
        for (int num : numUsuario) {
            System.out.print(num + " ");
        }

        System.out.println("\nAcertos: " + acertos);
    }
}
