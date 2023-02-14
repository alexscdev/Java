package ejercicioNumero;

public class Numero {
	int numero;
	
	Numero(){
		numero = 0;
	}
	
	Numero(int nuevoNumero){
	    numero = nuevoNumero;
	}
	
	int aniade() {
		return numero+1;
	}
	
	int resta() {
		return numero+1;
	}
	
	int getValor() {
		return numero;
	}
	
	int getDoble() {
		return numero*2;
	}
	
	int getTriple() {
		return numero*3;
	}
	
	public void setNumero(int nuevoNumero) {
		numero = nuevoNumero;
	}

	public static void main (String [] args) {
		
		Numero n1 = new Numero();
		System.out.println(n1.getDoble());
		n1.setNumero(2);
		
		System.out.println(n1.getDoble());
		
	}

}
