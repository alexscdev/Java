package ejercicioMiNumero;

public class MiNumero {
	double numero;
	
	MiNumero(){
		numero = 2;
	}

	
	double cambioDoble() {
		return numero*2;
	}
	
	double cambioTriple() {
		return numero*3;
	}
	
	double cambioCuadruple() {
		return numero*4;
	}
	
	
	
	public static void main (String [] args) {
		MiNumero n1 = new MiNumero();
		System.out.println(n1.cambioDoble());
		System.out.println(n1.cambioTriple());
		System.out.println(n1.cambioCuadruple());
	}
}
