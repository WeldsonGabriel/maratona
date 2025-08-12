package weldson.java.maratonaJava.introducao;

public class Aula6OperadoresOu {
    public static void main(String[] args) {
        double valorTotalContaCorrente = 100;
        double valorTotalContaPoupanca = 15000;
        float valorPlayStationCinco = 500F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlayStationCinco || valorTotalContaPoupanca > valorPlayStationCinco;
        System.out.println("isPlayStationCincoCompravel "+isPlayStationCincoCompravel);
    }
}
