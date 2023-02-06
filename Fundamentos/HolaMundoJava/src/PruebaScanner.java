
import java.util.Scanner;

public class PruebaScanner {
    public static void main(String args[]){
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("Usuario = " + usuario);
        System.out.println("Escribe el titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}
