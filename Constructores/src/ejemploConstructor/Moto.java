package ejemploConstructor;

public class Moto {
     private String marca;
     private int velocidad;
     
     //constructores
     public Moto() {
    	 
    	 marca = "";
    	 velocidad = 0;
     }
     
     public Moto(String lamarca, int lavelocidad) {
    	 marca = lamarca;
    	 velocidad = lavelocidad;
     }
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
     
}
