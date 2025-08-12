package weldson.java.maratonaJava.introducao;

public class Aula19BreackRepeticoes {
    // imprima os primeiros 25 numeros de um dado valor . por exemplo 50
    public static void main(String[] args) {
        int valorMax = 1;
        for (int i = 0; i <= valorMax ; i++){
            if (i > 25) {
                break;// não posso ter um breack fora do laço.
            }
            System.out.println(i);
        }
    }
}
