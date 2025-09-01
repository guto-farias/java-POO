/*
 * Faça um programa que receba
        • O código do produto comprado;
        • A quantidade comprada do produto
    Calcule e mostre:
        • O preço unitário do produto comprado, seguindo a Tabela I;
        • O preço total da nota;
        • O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
        • O preço final da nota depois do desconto.
 */

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite o código do produto comprado: ");
        int productCode = keyboard.nextInt();

        System.out.print("Digite a quantidade comprada do produto: ");
        int quantity = keyboard.nextInt();

        double unitPrice;
        if (productCode >= 1 && productCode <= 10) {
            unitPrice = 10.0;
        } else if (productCode >= 11 && productCode <= 20) {
            unitPrice = 15.0;
        } else if (productCode >= 21 && productCode <= 30) {
            unitPrice = 20.0;
        } else if (productCode >= 31 && productCode <= 40) {
            unitPrice = 40.0;
        } else {
            System.out.println("Código de produto inválido!");
            return;
        }

        double totalPrice = unitPrice * quantity;

        double discount;
        if (totalPrice <= 100) {
            discount = totalPrice * 0.05;
        } else if (totalPrice <= 500) {
            discount = totalPrice * 0.10;
        } else {
            discount = totalPrice * 0.15;
        }

        double finalPrice = totalPrice - discount;

        System.out.printf("Preço unitário do produto: R$ %.2f%n", unitPrice);
        System.out.printf("Preço total da nota: R$ %.2f%n", totalPrice);
        System.out.printf("Valor do desconto: R$ %.2f%n", discount);
        System.out.printf("Preço final da nota: R$ %.2f%n", finalPrice);

        keyboard.close();
    }
}
