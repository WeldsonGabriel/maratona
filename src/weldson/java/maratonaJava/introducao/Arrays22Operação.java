package weldson.java.maratonaJava.introducao;

public class Arrays22Operação {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        nomes[0] = "Weldson";
        nomes[1] = "Welds";
        nomes[2] = "Wel";
        nomes[3] = "Weldso";
        nomes[4] = "We";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome na posição " + i + ": " + nomes[i]);
        }

    }
}
