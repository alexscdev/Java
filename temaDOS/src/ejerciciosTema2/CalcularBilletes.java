package ejerciciosTema2;

public class CalcularBilletes {
	
	public static String pasaBilletes(int euros) {
		int cantidad = euros;
		int reserva;
		int suma = 0;
		
		int billetes500 = cantidad/500;
		    cantidad = cantidad%500;
		    suma += billetes500*500;
		
		int billetes200 = cantidad/200;
		    cantidad = cantidad/200;
		    suma += billetes200*200;
		
		int billetes100 = cantidad%100;
		    cantidad = cantidad%100;
		    suma += billetes100*100;
		    
		int billetes50 = cantidad%50;
		    cantidad = cantidad%50;
		    suma += billetes50*50;
		    
		int billetes20 = cantidad%20;
		    cantidad = cantidad%20;
		    suma += billetes20*20;
		    
		int billetes10 = cantidad%10;
		    cantidad = cantidad%10;
		    suma += billetes10*10;
		    
		    
		    //TODO Queda calcular lo que queda en monedas
		int billetes5 = cantidad%5;
		    cantidad = cantidad%5;
		    suma += billetes5*5;
		    
		    
		return billetes500 + " " + billetes200 + " " + billetes100
				+ " " + billetes50 + " " + billetes20 + " " + billetes10
				+ " " + billetes5 + " " ;
		
	}
	
	
	
	public static void main (String [] args) {
		
		System.out.println(pasaBilletes(1856));
		
	}

}
