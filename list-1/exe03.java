/*
 * Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
    obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.
 */

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Angulo A: ");
        int angleA = keyboard.nextInt();
        System.out.print("Angulo B: ");
        int angleB = keyboard.nextInt();
        System.out.print("Angulo C: ");
        int angleC = keyboard.nextInt();

        System.out.print("Lado A: ");
        double sideA = keyboard.nextDouble();
        System.out.print("Lado B: ");
        double sideB = keyboard.nextDouble();
        System.out.print("Lado C: ");
        double sideC = keyboard.nextDouble();

        String angleType;
        if (angleA == 90 || angleB == 90 || angleC == 90) {
            angleType = "retangulo";
        } else if (angleA > 90 || angleB > 90 || angleC > 90) {
            angleType = "obtusangulo";
        } else {
            angleType = "acutangulo";
        }

        String sideType;
        if (sideA == sideB && sideB == sideC) {
            sideType = "equilatero";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            sideType = "escaleno";
        } else {
            sideType = "isosceles";
        }

        System.out.println("Classificação de angulo: " + angleType);
        System.out.println("Classificação de lado: " + sideType);

        keyboard.close();
    }
}
