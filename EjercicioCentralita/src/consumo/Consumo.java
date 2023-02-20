package consumo;

public class Consumo {
	
	private double kms;
	private double litros;
	private double vmed;
	private double pgas;
	
	
	public Consumo(double kms, double litros, double vmed, double pgas) {
		this.kms = kms;
		this.litros = litros;
		this.vmed = vmed;
		this.pgas = pgas;
	}

    public double getTiempo() {
		return kms/vmed;
	}
	
	public double consumoMedio(){
		return litros/(kms/100);
	}
	
	public double consumoEuros(){
		return  ((litros/(kms/100))*pgas);
	}
	
	

	//Implementamos los setters

	public void setKms(int kms) {
		this.kms = kms;
	}

	public void setLitros(int litros) {
		this.litros = litros;
	}

	public void setVmed(int vmed) {
		this.vmed = vmed;
	}

	public void setPgas(float pgas) {
		this.pgas = pgas;
	}
	
	public static void main (String [] args) {
		Consumo consumo1 = new Consumo(800, 50, 100, 1.80);
		
		System.out.println(consumo1.getTiempo());
		
		System.out.println(consumo1.consumoMedio());
		
		System.out.println(consumo1.consumoEuros());
		
	}
}
