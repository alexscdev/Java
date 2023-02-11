package ejerciciosTema2;
import java.util.Scanner;

public class CalcularTiempo {
	
	public static String calculaTiempo(int tiempoSegundos) {
		
		int hor, min, seg;
		
        
        hor= tiempoSegundos/3600;
        
        min=(tiempoSegundos - (3600*hor)) / 60;
        
        seg=tiempoSegundos-((hor*3600)+(min*60));
        
        return hor+"h "+min+"m "+seg+"s";
        
	}
	

	public static void main (String [] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce los segundos: ");
		
		int segundos = entrada.nextInt();
		
		System.out.println(calculaTiempo(segundos));
		
	}

}
