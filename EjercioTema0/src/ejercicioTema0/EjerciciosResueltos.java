package ejercicioTema0;

public class EjerciciosResueltos {
	// Variable temporal para cambiar los valores
	static int edad = 28;
	static int nivelDeEstudios = 4;
	static int ingresos = 455555;
	static boolean jasp;

	static double pi = 3.14;

	public static void ejercicio3(){
		int numero = 2, cuad = numero * numero;
		System.out.println("El cuad de "+ numero+ " es: "+cuad);
	}

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
		
	
		if (edad <= 28 && nivelDeEstudios > 3 && ingresos > 28000) {
			jasp = true;
		}
		System.out.println(jasp);
	}

	public static void ejercicio6(){
		int num = 4;
		num %=7*num%3*7 >> 1;
		System.out.println(num);
	}

	public static void ejerciciolongitud(){
		int radio = 3;
    double calculo = radio * pi * 2;
		System.out.println(calculo);
	}
	public static void ejercicioarea(){
		double radio = 5.2;
    double calculo = radio * pi * radio;
		System.out.println(calculo);
	}

	public static void ejercicio7(){
		System.out.println("Me gusta la programacion\ncada dia mas");
	}

	public static void ejercicio8(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio7();
		// ejerciciolongitud();
		// ejercicioarea();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5_joven();
	}

}
