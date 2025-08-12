package weldson.java.maratonaJava.introducao;

public class Aula10EstruturaCondicionais {
    public static void main(String[] args) {
        var idade = 17;
        var isAutorizado = idade >= 18;
        var gerente = idade >= 17;
        // !
        if (isAutorizado) {
            System.out.println("Autorizado");
        } else if (gerente) {
            System.out.println("Gerente Autorizou, Esse Maluco !!!");
        }else{
            System.out.println("Não Autorizado");
        }
        if(!isAutorizado){
            System.out.println("Não autorizado");
        }
    }
}
