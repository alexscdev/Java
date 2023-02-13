package ejerciciosTema2;
import java.util.*;


public class CalcularBilletes {
	
	// Este metodo de encarga de calcular los billetes necesarios para cierta cantidad
	public static String pasarBilletes() {
		
		//Pedimos los billetes al usuario
		System.out.println("Introduce los euros: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		scanner.close();
		
		//Declaramos la variables y una lista con los billetes
		int billetes []= {500,200,100,50,20,10,5};
		int euros = numero;
		int eurosStatic = numero;
		int cantidad = 0;
		
		//LinkedHashMap para ordenar los billetes y sus cantidades
	 LinkedHashMap<Integer,Integer> recuentoBilletes=new LinkedHashMap<Integer,Integer>();
		
		for (int i = 0; i< billetes.length; i++) {
			
			int billetitos = euros/billetes[i];
			euros = euros%billetes[i];
			recuentoBilletes.put(billetes[i], billetitos);
				}
		
		System.out.println("Necesitara los siguientes billetes: ");
		// Hacemos recuento de los billetes y los mostramos
		for (int o : recuentoBilletes.keySet()) {
	          
	        
		      switch(o) {
		        case 500:
		          System.out.println("500: "+recuentoBilletes.get(500));
		          cantidad += recuentoBilletes.get(500)*500;
		          break;
		        case 200:
		          System.out.println("200: "+recuentoBilletes.get(200));
		          cantidad += recuentoBilletes.get(200)*200;
		          break;
		        case 100:
		          System.out.println("100: "+recuentoBilletes.get(100));
		          cantidad += recuentoBilletes.get(100)*100;
		          break;
		        case 50:
		          System.out.println("50: "+recuentoBilletes.get(50));
		          cantidad += recuentoBilletes.get(50)*50;
		          break;
		        case 20:
			      System.out.println("20: "+recuentoBilletes.get(20));
			      cantidad += recuentoBilletes.get(20)*20;
			      break;
		        case 10:
			      System.out.println("10: "+recuentoBilletes.get(10));
			      cantidad += recuentoBilletes.get(10)*10;
			      break;
		        case 5:
			      System.out.println("5: "+recuentoBilletes.get(5));
			      cantidad += recuentoBilletes.get(5)*5;
			      break;
		        default:
		          System.out.println("Error");
		      }
		      
		      
		    }
		
		//Calculamos la cantidad que no podemos pagar con billetes
		int sobrante = eurosStatic-cantidad;
		return "Sobra: "+sobrante+"€";

		}
			

		public static void main(String[] args) {
			
			System.out.println(pasarBilletes());
			
			
		}
}
