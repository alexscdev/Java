package _collections;

import java.util.Random;

public enum Color {
	RO("Rojo"), NA("Naranja"), AM("Amarillo"), VE("Verde"), AZ("Azul"), IN("Indigo"), VI("Violeta");

	private String color;
	private static Random r = new Random();

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public static Color colorAleatorio() {
		
		return Color.values()[r.nextInt(Color.values().length)];
	}

}
