package weldson.java.maratonaJava.introducao;

public class Aula16ExerciciosSwitch {
    public static void main(String[] args) {
        // dasos os valores de 1 a 7, imprima o dia da semana, considerando 1 como domingo, 2 como segunda-feira, e assim por diante até 7 como sábado.
        // imprima quais são dias uteis e quais são dias não úteis, considerando 1 como domingo, 2 como segunda-feira, e assim por diante até 7 como sábado.
        byte dia = 7;
        switch (dia) {
            case 1:
                System.out.println("Domingo - Dia não útil");
                break;
            case 2:
                System.out.println("Segunda-feira - Dia útil");
                break;
            case 3:
                System.out.println("Terça-feira - Dia útil");
                break;
            case 4:
                System.out.println("Quarta-feira - Dia útil");
                break;
            case 5:
                System.out.println("Quinta-feira - Dia útil");
                break;
            case 6:
                System.out.println("Sexta-feira - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Dia não útil");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
        byte diaSemana = 2;
        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("Dia não útil");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
