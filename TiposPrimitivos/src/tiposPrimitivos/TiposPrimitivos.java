package tiposPrimitivos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var3, var4, var5, var6 = 8;
		int var1 = 5, var2 = 50;

		byte minumero = (byte) 12;
		System.out.println(minumero);
		short v2 = minumero;
		System.out.println(v2);
		int v3 = 128;
		// Convierte entero a byte
		minumero = (byte) v3;
		System.out.println(minumero);

		// caracteres
		char c = 217;
		System.out.println(c);

		int entero12 = c;
		System.out.println(entero12);

		char c11 = 82;
		char c12 = 'R';
		if (c11 == c12) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		System.out.println(c11);
		int entero1 = c11;
		System.out.println(entero1);
		
		// Enteros largos
		long milong = 23423L;
	}

}
