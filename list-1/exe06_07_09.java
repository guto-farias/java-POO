/*
 * 6. Faça um programa que leia um número e calcule o fatorial desse número;
 * 7. Faça um programa que leia dois números e apresente o fatorial de todos os números que estejam dentro do intervalo definido pelos números que foram lidos;
 * 9. Faça um programa que leia um número inteiro e diga se ele é primo.
 */

import java.util.Scanner;

public class exe06_07_09 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Informe um número para obter seu fatorial e se ele é primo:");
        int num = keyboard.nextInt();

        if(num <= 1){
            isPrime = false;
        } else{
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if(isPrime){
            System.out.println("O número informado é primo.");
        } else {
            System.out.println("O número informado não é primo."); 
        }

        long factorial = 1;

        for (int i = 2; i <= num; i++){
            factorial *= i;
        }

        System.out.println("O fatorial do número informado é: " + factorial + ".");
    }
}
