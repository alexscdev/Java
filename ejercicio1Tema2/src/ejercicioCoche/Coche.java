package ejercicioCoche;

public class Coche {
	

	private int velocidad;
	Coche(){
		velocidad = 0;
	}
	
	int getVelocidad() {
		//TODO ASC
		return velocidad;
	}
	void acelera(int mas) {
		velocidad += mas;
	}
	
	void frena(int menos) {
		velocidad -= menos;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
}
