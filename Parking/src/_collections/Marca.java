package _collections;

import java.util.Random;

public enum Marca {
	ME("Mecedes-Benz"), SE("Seat"), VW("Volskwagen"), BM("BMW"), SK("Skoda"), FE("Ferrari"), AU("Audi");

	private String marca;
	private static Random r = new Random();

	private Marca(String marca) {
		this.marca = marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public static Marca marcaAleatoria() {
		return Marca.values()[r.nextInt(Marca.values().length)];
	}
	

}