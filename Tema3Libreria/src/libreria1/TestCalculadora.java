package libreria1;

public class TestCalculadora {
	
		static void pruebaUnitariaSuma() {
			
		
		Calculadora myCalculadora = new Calculadora();
		
		int sumando1=1;
		int sumando2=1;
		int primeraSuma = myCalculadora.suma(1, 1);
		
		
		
		if (primeraSuma != 2) {
			System.out.println("la prueba unitaria esta mal");
		}
		sumando1=1;
		sumando2=1;
		primeraSuma = myCalculadora.suma(1, 1);
		
		
		
		if (primeraSuma != 2) {
			System.out.println("la prueba unitaria esta mal");
		}
		sumando1=1;
		sumando2=1;
		primeraSuma = myCalculadora.suma(1, 1);
		
		
		
		if (primeraSuma != 2) {
			System.out.println("la prueba unitaria esta mal");
		}
		sumando1=1;
		sumando2=1;
		primeraSuma = myCalculadora.suma(1, 1);
		
		
		
		if (primeraSuma != 2) {
			System.out.println("la prueba unitaria esta mal");
		}
		
	}
		public static void main(String [] args) {
		pruebaUnitariaSuma();
	}

}
