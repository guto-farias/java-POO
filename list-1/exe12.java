/*
 * Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
um vetor dos números não comuns aos vetores
 */

import java.util.ArrayList;
import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vectorA = new int[10];
        int[] vectorB = new int[10];

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("\nDigite 10 números para o vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            vectorB[i] = scanner.nextInt();
        }

        ArrayList<Integer> uncommon = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            boolean found = false;
            for (int j = 0; j < 10; j++) {
                if (vectorA[i] == vectorB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found && !uncommon.contains(vectorA[i])) { //pra parar de pegar numeros repetidos
                uncommon.add(vectorA[i]);
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean found = false;
            for (int j = 0; j < 10; j++) {
                if (vectorB[i] == vectorA[j]) {
                    found = true;
                    break;
                }
            }
            if (!found && !uncommon.contains(vectorB[i])) {
                uncommon.add(vectorB[i]);
            }
        }


        System.out.println("\nVetor dos números não comuns:");
        if (uncommon.isEmpty()) {
            System.out.println("Não há números não comuns.");
        } else {
            for (int num : uncommon) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
