package usaLibreria;

import libreria1.Calculadora;

public class UsaLibreriaCalculadora {
	
static void pruebaUnitariaSuma() {
			
		
		Calculadora myCalculadora = new Calculadora();
		
		int sumando1=1;
		int sumando2=3;
		int primeraSuma = myCalculadora.suma(sumando1, sumando2);
		
		
		
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
