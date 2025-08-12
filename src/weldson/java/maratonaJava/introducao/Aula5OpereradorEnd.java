package weldson.java.maratonaJava.introducao;

public class Aula5OpereradorEnd {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 10;

        // operador lógico com condições "&&(end)" - "||(ou)" - "!(negação)"
        var idade = 29;
        var salario = 5000F;
        var isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        var isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta, " +isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta, " +isDentroDaLeiMenorQueTrinta);
    }
}
