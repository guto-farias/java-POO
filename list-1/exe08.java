/*
 * Faça uma calculadora de troco, baseado nas cédulas da nossa moeda.
 */
import java.util.Scanner;

public class exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double purchaseValue = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double paidValue = scanner.nextDouble();

        if (paidValue < purchaseValue) {
            System.out.println("Valor pago insuficiente!");
            return;
        }

        double change = paidValue - purchaseValue;
        System.out.printf("Troco a ser devolvido: R$ %.2f%n", change);

        int cents = (int) Math.round(change * 100);

        int[] denominations = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        String[] labels = {
            "R$ 100,00", "R$ 50,00", "R$ 20,00", "R$ 10,00", "R$ 5,00", "R$ 2,00",
            "R$ 1,00", "R$ 0,50", "R$ 0,25", "R$ 0,10", "R$ 0,05", "R$ 0,01"
        };

        System.out.println("\nDistribuição do troco:");
        for (int i = 0; i < denominations.length; i++) {
            int qty = cents / denominations[i];
            if (qty > 0) {
                System.out.println(qty + " x " + labels[i]);
                cents %= denominations[i];
            }
        }
    }
}
