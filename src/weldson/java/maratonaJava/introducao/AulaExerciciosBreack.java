package weldson.java.maratonaJava.introducao;

import java.util.Scanner;

// dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado.
// ter opções de parcelas , 1 a 72. e o valor da parcela so pode ser no maximo 30 % do salario.
// verificar se pode ou nao financiar o carro.
// incluir imput do usuario para o valor do carro e salario.

public class AulaExerciciosBreack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do carro: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número para o valor do carro: ");
            scanner.next();
        }
        var valorCarro = scanner.nextDouble();

        System.out.print("Digite o seu salário: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Valor inválido. Digite um número para o salário: ");
            scanner.next();
        }
        var salario = scanner.nextDouble();

        var parcelas = (byte) 0;
        var valorParcela = 0.0;
        for (int i = 1; i <= 64; i += 1) { //incrementando de 1 em 1, para pegar as parcelas de 1, 2, 3, ..., 64.
            valorParcela = valorCarro / i; //calculando o valor da parcela.

            if (valorParcela >= 600 && valorParcela <= salario * 0.3) {
                parcelas = (byte) i; //casting para byte, pois a quantidade de parcelas é do tipo byte.
                break; // aproveitar o break para sair do loop assim que encontrar a primeira condição válida.
            }
        }
        if (parcelas > 0) {
            System.out.println("O carro pode ser parcelado em " + parcelas + " vezes de R$" + valorParcela); //imprimindo a quantidade de parcelas e o valor da parcela.
        } else {
            System.out.println("Não é possível financiar o carro com as condições dadas."); //caso não encontre nenhuma condição válida, imprime que não é possível financiar o carro.
        }
    }


        /*var valorCarro = 48000D;
        var salario = 10000D;
        var parcelas = (byte) 0;// para armazenar a quantidade de parcelas, utilizando o tipo byte, pois o número de parcelas não será muito grande.
        var valorParcela = (double) 0; //casting para double, talvez possa utilizar o float.

        for (int i = 12; i <= 60; i += 12) { //incrementando de 12 em 12, para pegar as parcelas de 12, 24, 36, 48 e 60.
            valorParcela = valorCarro / i;//calculando o valor da parcela.

            if (valorParcela >= 1000 && valorParcela <= salario * 0.3) {
                parcelas = (byte) i;//casting para byte, pois a quantidade de parcelas é do tipo byte.
                break;// aproveitar o break para sair do loop assim que encontrar a primeira condição válida.
            }
        }

        if (parcelas > 0) {
            System.out.println("O carro pode ser parcelado em " + parcelas + " vezes de R$" + valorParcela); //imprimindo a quantidade de parcelas e o valor da parcela.
        } else {
            System.out.println("Não é possível financiar o carro com as condições dadas."); //caso não encontre nenhuma condição válida, imprime que não é possível financiar o carro.
        }
    }*/
}
