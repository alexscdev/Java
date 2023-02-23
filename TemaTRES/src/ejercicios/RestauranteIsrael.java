package ejercicios;

public class RestauranteIsrael {
	
	double papas;
	double chocos;
	
	static int CalculaComensales(float papas, float chocos) throws RestauranteException {
		
		float papasParaPlato = papas*3;
		float chocosParaPlato= chocos*6;
		
		float cantidadMenor=papasParaPlato;
		
		if(chocosParaPlato<papasParaPlato)
			cantidadMenor=chocosParaPlato;
		if(cantidadMenor>1)
			return (int)cantidadMenor;
		
		throw new RestauranteException("no hay comida");
	}
	
static int CalculaComensalesTry(float papas, float chocos) {
	int test = 0;
	
		
		try {
			test = CalculaComensales(papas, chocos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return test;
	}

	
	public static void main (String [] args) throws RestauranteException {
		
		System.out.println(CalculaComensales((float) 7.5,(float) 5));
		
		
		
		
	}
}
