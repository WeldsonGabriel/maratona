package weldson.java.maratonaJava.introducao;

public class Aula12OperadorTernario {
    public static void main(String[] args) {
        /*double salario = 6000;
        String resultado = salario > 5000 ?  "eu vou doar 500 pro devDojo" : "Não tenho Condições";
        System.out.println(resultado);*/

        // tabela verdade

        // && - ||  utilizar && quando todas as condições precisam ser verdadeiras
        // || - ||  utilizar || quando uma das condições precisa ser verdadeira, e && para quando todas precisam ser verdadeiras
        // Valor do imposto de renda


        double salarioAnual = 19000D;
        double primeiraFaixa = 9.75/ 100;
        double segundaFaixa = 37.5/ 100;
        double terceiraFaixa = 49.50/ 100;
        
        double valorDoImPosto;
        
        if (salarioAnual <= 34712.99D) {
            valorDoImPosto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorDoImPosto = salarioAnual * segundaFaixa;
        } else {
            valorDoImPosto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Valor do imposto: " + valorDoImPosto);
    }
}
