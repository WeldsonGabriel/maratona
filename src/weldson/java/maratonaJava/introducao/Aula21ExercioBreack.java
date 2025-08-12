package weldson.java.maratonaJava.introducao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula21ExercioBreack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número para o valor do carro: ");
            scanner.next();
        }
        double valorCarro = scanner.nextDouble();

        System.out.print("Digite o seu salário: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número para o salário: ");
            scanner.next();
        }
        double salario = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número para a taxa de juros: ");
            scanner.next();
        }
        double taxaJuros = scanner.nextDouble() / 100.0;

        List<String> opcoes = new ArrayList<>();
        for (int i = 1; i <= 72; i++) {
            // Cálculo da parcela considerando juros compostos
            double valorParcela = (valorCarro * Math.pow(1 + taxaJuros, i)) / i;
            double valorTotal = valorParcela * i;
            if (valorParcela <= salario * 0.3) {
                opcoes.add(i + "x de R$" + String.format("%.2f", valorParcela) + " (Total: R$" + String.format("%.2f", valorTotal) + ")");
            }
        }

        if (opcoes.isEmpty()) {
            System.out.println("Não é possível financiar o carro com as condições dadas.");
        } else {
            System.out.println("Opções de parcelamento disponíveis:");
            for (int i = 0; i < opcoes.size(); i++) {
                System.out.println((i + 1) + " - " + opcoes.get(i));
            }
            System.out.print("Escolha a opção desejada (número): ");
            int escolha = scanner.nextInt();
            if (escolha >= 1 && escolha <= opcoes.size()) {
                System.out.println("Você escolheu: " + opcoes.get(escolha - 1));
            } else {
                System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
