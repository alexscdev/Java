package temaDOS;
import java.util.Scanner;

public class EntradaPorConsola {

	public static void main(String[] args) {
		String name = "vacio";
		
		try {
			// create an object of scanner
			
			if(args.lenght==0) {
				Scanner input = new Scanner(System.in);
			}

			//Take input from the user
			String name= input.next();
			input.close();
			
			
			System.out.println("Hello! "+name);
		}catch (Exception e) {
			e.getMessage();
		}

	}

}
