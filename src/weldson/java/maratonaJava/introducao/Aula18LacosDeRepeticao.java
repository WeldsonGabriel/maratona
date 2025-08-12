package weldson.java.maratonaJava.introducao;

public class Aula18LacosDeRepeticao {
    public static void main(String[] args) {
        // Laços de repetição
        // for, while, do-while

        // for
        for (int i = 8; i < 10; i++) {
            System.out.println("Valor de i: " + i);
        }
        // while
        int j = 9;
        while (j < 10) {
            System.out.println("Valor de j: " + j);
            j++;
        }
        // do-while
        int k = 12;
        do {
            System.out.println("Valor de k: " + k);
            k++;
        } while (k < 10);

        // for each
        String[] nomes = {"Weldson", "Maria", "João"};

        //quero achar so weldson, informar o indice e sair do laço
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals("Maria")) {
                System.out.println("Achei o " + nomes[i] + " no índice: " + i);
                break; // sai do laço
            }
        }
    }
}
