package consumo;

public class Consumo {
	
	private int kms;
	private int litros;
	private int vmed;
	private double pgas;
	
	
	public Consumo() {
		kms = 123945;
		litros = 53;
		vmed = 67;
		pgas = 1.80;
	}

    int getTiempo(int tiempo) {
		return tiempo;
	}
	
	int consumoMedio(){
		return (litros/(kms/100));
	}
	
	int consumoEuros(){
		return (int) ((litros/(kms/100))*pgas);
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

	public void setPgas(double pgas) {
		this.pgas = pgas;
	}
}
