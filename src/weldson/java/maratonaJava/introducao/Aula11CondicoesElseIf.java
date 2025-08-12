package weldson.java.maratonaJava.introducao;

public class Aula11CondicoesElseIf {
    public static void main(String[] args) {
        var idade = 12;
        String categoria;// o metodo precisa ser inicializado caso nao tenha um else ( String categoria = "" )

        if (idade < 12) {
            categoria = "infantil";
        } else if (idade >= 12 && idade < 18) {
            categoria = "juvenil";
        } else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
