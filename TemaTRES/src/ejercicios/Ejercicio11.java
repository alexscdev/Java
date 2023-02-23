package ejercicios;



public class Ejercicio11 {
	/** Saber cuantos clientes podemos atender con la cantidad que tenemos de comida */
	
	static double chocos;
	static double papas;


	
	// Metodos
	public static void addChocos(double x) {
		chocos += x;
	}
	
	public static void addPapas(double x) {
		papas += x;
	}
	
	public static void showChocos() {
		System.out.println("En el almacen hay "+ chocos +" kilos de choco");
	}
	
    public static void showPapas() {
    	System.out.println("En el almacen hay "+ papas +" kilos de papas");
	}
	
    
    
public static int saberClientes() {
		
		int clientes = 0;
		
		
		while(papas >= 1 && chocos >= 0.5) {
			clientes +=3;
			papas -= 1.0;
			chocos -= 0.5;
		}
		
		
		return clientes;
	}


	
	public static void main(String[] args) {
		
		
		addChocos(5.0);
		addPapas(7.5);
		
		
		System.out.println("Puede atender a: "+saberClientes()+" clientes");
		
		showPapas();
		showChocos();
		
	}
}
