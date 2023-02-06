package ejercicioTema0;

public class EjerciciosResueltos {
	// Variable temporal para cambiar los valores
	public static void ejercicio4() {
		int a=5;
		int b=10;
		
		System.out.println("a: "+ a + " - b: "+b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("a: "+ a + " - b: "+b);
	}
	
	//
	 
	public static void ejercicio5_joven() {
		static int edad = 28;
		static int nivelDeEstudios = 4;
		static int ingresos = 455555;
		static boolean jasp;
		
		if (edad <= 28 && nivelDeEstudios > 3 && ingresos > 28000) {
			jasp = true;
		}
		System.out.println(jasp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio4();
		ejercicio5_joven();
	}

}
