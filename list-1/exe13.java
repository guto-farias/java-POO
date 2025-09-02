/*
 * Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente, calcule e mostre 2 vetores resultantes:
        • no primeiro vetor resultante, cada elemento será composto pela soma de cada número par do primeiro vetor somado a todos os números do segundo vetor;
        • o segundo vetor resultante será composto pela quantidade de divisores que cada número ímpar do primeiro vetor tem no segundo vetor.
 */


 //CORRIGIRRRRR
import java.util.ArrayList;
import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vectorA = new int[10];
        int[] vectorB = new int[5];

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 5 números para o vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            vectorB[i] = scanner.nextInt();
        }

        ArrayList<Integer> result1 = new ArrayList<>();
        ArrayList<Integer> result2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (vectorA[i] % 2 == 0) {

                for (int j = 0; j < 5; j++) {
                    result1.add(vectorA[i] + vectorB[j]);
                }
            } else {

                int count = 0;
                for (int j = 0; j < 5; j++) {
                    if (vectorA[i] % vectorB[j] == 0) {
                        count++;
                    }
                }
                result2.add(count);
            }
        }

        System.out.println("\nVetor resultante 1 (somatório com pares):");
        for (int num : result1) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nVetor resultante 2 (divisores nos ímpares):");
        for (int num : result2) {
            System.out.print(num + " ");
        }
    }
}
