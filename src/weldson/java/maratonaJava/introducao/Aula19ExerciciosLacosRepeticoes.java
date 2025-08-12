package weldson.java.maratonaJava.introducao;

public class Aula19ExerciciosLacosRepeticoes {
    public static void main(String[] arbgs) {
   /*/imprimir todos os numeros pares ate um milhao
        for (int i = 0; i <= 100000; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }*/

       // imprimir todos os numeros impares ate um milhao
        for (int i = 0; i <= 100000; i += 2) {
            if (i % 2 != 0) {
                System.out.println(i - 1);
            }
        }

        // imprimir todos os numeros de 1 a 1000, mas pular os multiplos de 3
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0) {
                continue; // pula para a próxima iteração
            }
            System.out.println(i);
        }
    }
}
