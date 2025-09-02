/*
 * Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
um número negativo ou 0.
 * 
 */

import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int lineCount = 0;

        System.out.println("Digite valores positivos (0 ou negativo para sair):");

        while (true) {
            System.out.print("Valor: ");
            double value = scanner.nextDouble();

            if (value <= 0) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (lineCount % 20 == 0) {
                System.out.printf("%-10s %-15s %-15s%n", "VALOR", "CUBO", "RAIZ QUADRADA");
                System.out.println("---------------------------------------------------");
            }

            double cube = Math.pow(value, 3);
            double squareRoot = Math.sqrt(value);

            System.out.printf("%-10.2f %-15.2f %-15.2f%n", value, cube, squareRoot);

            lineCount++;
        }
    }
}
