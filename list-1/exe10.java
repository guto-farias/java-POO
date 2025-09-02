/*
 * 
 * Faça um programa que receba dez números inteiros e mostre a quantidade de números
primos dentre os número que foram digitados.
 */

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeCount = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = scanner.nextInt();

            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break; // já achou divisor
                    }
                }
            }

            if (isPrime) {
                primeCount++;
            }
        }

        System.out.println("\nQuantidade de números primos digitados: " + primeCount);
    }
}
