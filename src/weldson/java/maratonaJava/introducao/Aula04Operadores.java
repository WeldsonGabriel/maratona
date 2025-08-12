package weldson.java.maratonaJava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero1 = 20;
        int numero2 = 10;
        var resultado1 = numero2 + numero1;
        var resultado2 = numero1 / numero2;
        var resultado3 = numero2 - numero1;
        var resultado4 = numero2 * numero1;

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

        // %

        int resto = 21 % 7;
        var resto1 = numero2 % numero1;
        System.out.println(resto);
        System.out.println(resto1);

        // < > <= >= == != sempre vão retornar boolean

        var isDezMaiorQueVinte = 10 > numero2;
        var menor = 10 < numero2;
        var maiorIgual = 10 >= numero2;
        var menorIgual = 10 <= numero2;
        var diferente = 10 != numero2;
        var isDezIgualVinte = 10 == 20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(menor);
        System.out.println(maiorIgual);
        System.out.println(menorIgual);
        System.out.println(diferente);
        System.out.println(isDezIgualVinte);


    }
}
