package temaDOS;
import java.util.Scanner;

public class EntradaPorConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "vacio";
		
		if(args.length==0) {
			Scanner input = new Scanner(System.in); 
			name = input.next();
			input.close();
		} else {
			name=args[0];
		}
		System.out.println("Hello " + name);

}
	
}
