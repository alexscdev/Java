package ejercicio6;

public class Rebajas {

	public static double descubrePorcentaje(double rebajado, double original) {
		double resta= rebajado - original;
		
		double porcentaje = (resta/rebajado)*100;
		
		System.out.println(porcentaje);
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		descubrePorcentaje(100.00,50.00);

	}

}
