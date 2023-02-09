package ejercicio8;


public class Ejercicio8 {
	
	public static void ejercicio8(){
		int numeroAleatorio = (int) (Math.random()* 26 + 65);
		
	    char letraAleatoria =  (char)numeroAleatorio;
	
		if(letraAleatoria == 'A' || letraAleatoria == 'E' || letraAleatoria == 'I' || letraAleatoria == 'O' || letraAleatoria == 'U'){
			System.out.println("La letra '" + letraAleatoria + "' es una vocal");
		}else {
			System.out.println("La letra '" + letraAleatoria + "' es una consonante");
		}
		
	}

	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			
		ejercicio8();
		}
	}

}
