/*
 * Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre:
    • a quantidade de jogadores com idade inferior a 18 anos;
    • a média das idades dos jogadores de cada time;
    • a média das alturas de todos os jogadores do campeonato;
    • a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato.
 */

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        final int teams = 5;
        final int playersPerTeam = 11;

        int under18Count = 0;  
        double totalHeight = 0; 
        int totalPlayers = teams * playersPerTeam;
        int over80kgCount = 0; 

        for (int t = 1; t <= teams; t++) {
            int ageSum = 0; 
            System.out.println("---- Time " + t + " ----");

            for (int p = 1; p <= playersPerTeam; p++) {
                System.out.println("Jogador " + p + ":");

                System.out.print("Digite a idade: ");
                int age = keyboard.nextInt();

                System.out.print("Digite o peso (kg): ");
                double weight = keyboard.nextDouble();

                System.out.print("Digite a altura (m): ");
                double height = keyboard.nextDouble();

                if (age < 18) {
                    under18Count++;
                }

                ageSum += age;

                totalHeight += height;

                if (weight > 80) {
                    over80kgCount++;
                }
            }

            double teamAgeAverage = (double) ageSum / playersPerTeam;
            System.out.printf("Média das idades do time %d: %.2f anos%n", t, teamAgeAverage);
        }

        double heightAverage = totalHeight / totalPlayers;

        double over80kgPercentage = ((double) over80kgCount / totalPlayers) * 100;

        System.out.println("=================================");
        System.out.println("Quantidade de jogadores com idade < 18: " + under18Count);
        System.out.printf("Média das alturas de todos os jogadores: %.2f m%n", heightAverage);
        System.out.printf("Porcentagem de jogadores com mais de 80 kg: %.2f%%%n", over80kgPercentage);
    }
}
