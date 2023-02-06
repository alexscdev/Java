package introduccion;

public class Suma {
	static int n1=50; //variable miembro de la clase

	public static void test () {
		
		System.out.println(n1);
		
		int n1 = 56;
		System.out.println(n1); // La variable padre de la clase se sobreescribe solo en esta funcion pero no cambia su valor original
	}
	public static void main (String [] args) {
		int n2 = 3, suma; // variable locales
		suma=n1+n2;
		System.out.println("LA SUMA ES: "+ suma);
	}
}
