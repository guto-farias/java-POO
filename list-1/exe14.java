/*
 * Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
seguinte menu na tela:
IFC – CAMPUS VIDEIRA Pág. 2 de 3
• Efetuar depósito
• Efetuar saque
• Consultar o ativo bancário (soma de todos os saldos)
• Finalizar programa
Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.
Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
para o saque.

 */

import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] contas = new int[10];
        double[] saldos = new double[10];

        System.out.println("=== Cadastro de Contas ===");
        for (int i = 0; i < 10; i++) {
            int codigo;
            boolean existe;

            do {
                existe = false;
                System.out.print("Digite o código da conta " + (i + 1) + ": ");
                codigo = scanner.nextInt();

                for (int j = 0; j < i; j++) {
                    if (contas[j] == codigo) {
                        existe = true;
                        System.out.println("⚠ Já existe uma conta com esse código. Digite outro.");
                        break;
                    }
                }
            } while (existe);

            contas[i] = codigo;

            System.out.print("Digite o saldo inicial da conta " + codigo + ": ");
            saldos[i] = scanner.nextDouble();
        }

        int opcao;
        do {
            System.out.println("\n=== Menu Bancário ===");
            System.out.println("1 - Efetuar depósito");
            System.out.println("2 - Efetuar saque");
            System.out.println("3 - Consultar ativo bancário");
            System.out.println("4 - Finalizar programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Depósito
                    System.out.print("Digite o código da conta para depósito: ");
                    int codDep = scanner.nextInt();
                    System.out.print("Digite o valor do depósito: ");
                    double valorDep = scanner.nextDouble();

                    boolean achouDep = false;
                    for (int i = 0; i < 10; i++) {
                        if (contas[i] == codDep) {
                            saldos[i] += valorDep;
                            System.out.println("✅ Depósito realizado! Novo saldo: " + saldos[i]);
                            achouDep = true;
                            break;
                        }
                    }
                    if (!achouDep) {
                        System.out.println("⚠ Conta não encontrada!");
                    }
                    break;

                case 2: 
                    System.out.print("Digite o código da conta para saque: ");
                    int codSaq = scanner.nextInt();
                    System.out.print("Digite o valor do saque: ");
                    double valorSaq = scanner.nextDouble();

                    boolean achouSaq = false;
                    for (int i = 0; i < 10; i++) {
                        if (contas[i] == codSaq) {
                            achouSaq = true;
                            if (saldos[i] >= valorSaq) {
                                saldos[i] -= valorSaq;
                                System.out.println("✅ Saque realizado! Novo saldo: " + saldos[i]);
                            } else {
                                System.out.println("❌ Saldo insuficiente!");
                            }
                            break;
                        }
                    }
                    if (!achouSaq) {
                        System.out.println("⚠ Conta não encontrada!");
                    }
                    break;

                case 3: 
                    double soma = 0;
                    for (int i = 0; i < 10; i++) {
                        soma += saldos[i];
                    }
                    System.out.println("💰 Ativo bancário total: " + soma);
                    break;

                case 4: 
                    System.out.println("👋 Programa finalizado.");
                    break;

                default:
                    System.out.println("⚠ Opção inválida, tente novamente.");
            }
        } while (opcao != 4);

    }   
}
