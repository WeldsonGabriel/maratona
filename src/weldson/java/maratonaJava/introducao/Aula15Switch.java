package weldson.java.maratonaJava.introducao;

public class Aula15Switch {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo, 2 como segunda-feira, e assim por diante até 7 como sábado.
        byte dia = 52;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        //imprima o se a pessoa é homem ou mulher, considerando 1 como homem e 2 como mulher.
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Sexo inválido");
                break;
        }
    }
}
