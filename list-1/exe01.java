/*
 * 1. Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. Calcule e mostre o salário a receber seguindo estas regras:
        • o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada;
        • o imposto equivale a 30% do salário bruto;
        • o salário a receber equivale ao salário bruto menos o imposto.
 */

import java.util.Scanner;

public class exe01 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        float valueHour = 0f;
        int numberHour = 0;
        float grossSalary = 0f;
        float netSalary = 0f;

        System.out.println("Informe o valor da hora trabalhada:");
        valueHour = keyboard.nextFloat();
        
        System.out.println("Informe a quantidade de horas trabalhadas:");
        numberHour = keyboard.nextInt();

        grossSalary = valueHour * numberHour;
        netSalary = grossSalary - (grossSalary * 0.3f);

        System.out.println("Seu salario bruto: R$ " + grossSalary + ", seu salario liquido: R$ " + netSalary + ".");

        keyboard.close();
    }
}