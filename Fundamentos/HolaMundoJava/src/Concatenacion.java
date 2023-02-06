
public class Concatenacion {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        
        var j = 3;
        var i = 4;
        
        System.out.println(i + j); //Se realiza la suma de numeros
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
    }
}
