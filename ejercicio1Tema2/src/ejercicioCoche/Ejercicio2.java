package ejercicioCoche;

public class Ejercicio2 {

	public static void main (String [] args) {
		Coche coche1 = new Coche();
		System.out.println(coche1.getVelocidad());
		
		//Aumentar velocidad
		coche1.acelera(20);
		System.out.println(coche1.getVelocidad());
		
		//Disminuir velocidad
		coche1.frena(10);
		System.out.println(coche1.getVelocidad());
	}
	//GET devuelve algo 
	
	//SET establece algo
	
}
