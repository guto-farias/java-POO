/*
 * Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
    que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
    residência, calcule e mostre:
        • o valor de cada quilowatt;
        • o valor a ser pago por essa residência;
 */

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Informe o valor do salario minimo: ");
        float salary = keyboard.nextFloat();

        System.out.print("Informe a quantidade de quilowatts consumidos: ");
        float amountKW = keyboard.nextFloat();

        float valueKW = salary * 0.01f;
        float valueTotal = valueKW * amountKW;

        System.out.println("Valor de cada kW: R$ " + valueKW);
        System.out.println("Valor total a pagar: R$ " + valueTotal);

        keyboard.close();
    }
}
