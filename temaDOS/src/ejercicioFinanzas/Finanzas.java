package ejercicioFinanzas;

public class Finanzas {
	double cambioDolarEuros;
	
	Finanzas(){
	  cambioDolarEuros = 1.36;
	  
	}
	
	Finanzas(double cambio){

	}
	
	public void modificaTipoCambio(double nuevoCambio) {
		cambioDolarEuros = nuevoCambio;
	}
	
	
	double dolaresToEuros(double dolares){
		
		return dolares*cambioDolarEuros;
		
	}
	
    double eurosToDolares(double euros){
		
    	return euros/cambioDolarEuros;
    	
	}
    
    

	public static void main (String [] args) {
		
		Finanzas c = new Finanzas();
		System.out.println(c.dolaresToEuros(130.00));
		System.out.println(c.eurosToDolares(130.00));
		
		Finanzas f2 = new Finanzas(1.50);
		
		System.out.println(f2.dolaresToEuros(130.00));
		System.out.println(f2.eurosToDolares(130.00));
		
		
	}
}
