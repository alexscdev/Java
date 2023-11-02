package _collections;

import java.util.Objects;

public class Coche implements Comparable<Coche> {

	private Marca marca;
	private Color color;

	public Coche(Marca marca, Color color) {
		this.marca = marca;
		this.color = color;
	}

	public Marca getMarca() {
		return marca;
	}

	public Color getColor() {
		return color;
	}

	public Coche() {
		this.marca = Marca.marcaAleatoria();
		this.color = Color.colorAleatorio();
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}

	@Override
	public String toString() {
		return "Coche: " + marca + " " + color;
	}

	@Override
	public int compareTo(Coche o) {
		return this.color.getColor().compareTo(o.color.getColor()) == 0
				? this.marca.getMarca().compareTo(o.marca.getMarca())
				: this.color.getColor().compareTo(o.color.getColor());
	}

}
