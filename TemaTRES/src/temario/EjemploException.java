package temario;

public class EjemploException {

	
	
	
	public static void main(String [] args) {
		
		try {
			int a = 4/5;
			
		}catch (ArithmeticException e) {
			System.out.println("Se ha producido una exception aritmetica");
			
		}catch (Exception e) {
			System.out.println("Se ha producido una exception de otro tipo");
			
		}finally {
			System.out.println("Bloque finally");
			
		}
	}
}
