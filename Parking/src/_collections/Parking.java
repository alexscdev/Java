package _collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Parking {

	private String nombre;
	private int totalPlazas;
	private List<Coche> coches;
	Map<Color, Integer> mapColores;
	Map<Marca, Integer> mapMarcas;
	Map<Coche, Integer> mapCoches;
	Set<Coche> setCoches;
	private static Random r = new Random();

	// Constructor
	public Parking(String nombre, int totalPlazas) {
		this.nombre = nombre;
		this.totalPlazas = totalPlazas <= 0 ? 1 : totalPlazas > 10_000_00 ? 10_000_00 : totalPlazas;
		this.coches = new ArrayList<>();
		this.mapColores = new TreeMap<>();
		this.mapMarcas = new TreeMap<>();
		this.mapCoches = new TreeMap<>();
		this.setCoches = new TreeSet<Coche>();
	}

	// Comprueba si esta el coche en el parking
	private boolean compruebaCoche(Coche c) {
		// Metodo para recorrer la lista y comprobar cada coche

		for (Coche coche : coches) {
			if (coche == c)
				return true;
		}
		// coches.stream().filter(t -> t==c).anyMatch(t -> t.equals(c))

		return false;
	}

	// Entra un coche en el parking
	public boolean entraCoche(Coche c) {
		boolean hayHueco = (coches.size() <= totalPlazas || coches.isEmpty());

		if (hayHueco && !compruebaCoche(c)) {
			coches.add(c);
			mapColores.put(c.getColor(), mapColores.containsKey(c.getColor()) ? mapColores.get(c.getColor()) + 1 : 1);
			mapMarcas.put(c.getMarca(), mapMarcas.containsKey(c.getMarca()) ? mapMarcas.get(c.getMarca()) + 1 : 1);
			// mapCoches.put(c.toString(), mapCoches.containsKey(c.toString()) ?
			// mapCoches.get(c.toString()) + 1 : 1);
			// mirar si hay un coche igual
			mapCoches.put(c, mapCoches.containsKey(c) ? mapCoches.get(c) + 1 : 1);
			setCoches.add(c);

		}

		return hayHueco;
	}

	// Metodo que saca los coches pero no los elimina
	public boolean saleCoche(Coche c) {
		boolean resultado = compruebaCoche(c);

		if (resultado) {
			coches.remove(c);
			mapColores.put(c.getColor(), mapColores.get(c.getColor()) > 1 ? mapColores.get(c.getColor()) - 1 : 0);
			mapMarcas.put(c.getMarca(), mapMarcas.get(c.getMarca()) > 1 ? mapMarcas.get(c.getMarca()) - 1 : 0);
			// mapCoches.put(c.toString(), mapCoches.get(c.toString()) > 1 ?
			// mapCoches.get(c.toString()) - 1 : 0);
			mapCoches.put(c, mapCoches.get(c) > 1 ? mapCoches.get(c) - 1 : 0);

			if (mapCoches.get(c) == 0) {
				setCoches.remove(c);
			}

			// mapColores.forEach((t, u) -> (u==0) mapCoches.remove(t));

			/*
			 * for (Entry<Color, Integer> entry : mapColores.entrySet()) { if
			 * (entry.getValue() == 0) mapColores.remove(entry.getKey()); }
			 */

		}

		return resultado;
	}

	// Saco coche aleatorio del parking
	public boolean saleCocheAleatrorio() {

		return coches.isEmpty() ? false : saleCoche(coches.get(r.nextInt(coches.size())));

		/*
		 * if(!coches.isEmpty()) { return
		 * saleCoche(coches.get(r.nextInt(coches.size()))); }else return false;
		 */

	}

	// Se vacia el parking entero
	public boolean vaciaParking() {

		if (coches.isEmpty()) {
			return false;
		} else {
			for (int i = coches.size() - 1; i >= 0; i--) {
				coches.remove(i);
				mapColores.clear();
				mapMarcas.clear();
				mapCoches.clear();
				setCoches.clear();
			}
			return true;
		}
	}

	// Saca un reporte de los colores existentes en el parking
	public void reportParking() {

		if (coches.size() == 0) {
			System.out.println("\nParking vacio");
		} else {
			System.out.println("\nLISTADO COCHES\n-----------" + "\nParking: " + nombre);
			coches.stream().forEach(System.out::println);

			/*
			 * for (Coche coche : coches) System.out.println(coche);
			 */

			System.out.println("Total coches: " + coches.size() + " plazas libres :" + (totalPlazas - coches.size()));
		}
	}

	// Saca un reporte de los colores existentes en el parking
	public void reportColores() {

		if (coches.size() == 0) {
			System.out.println("Parking vacio");
		} else {
			System.out.println("\nREPORT DE COLORES\n-----------" + "\nParking: " + nombre);
			mapColores.forEach(
					(k, v) -> System.out.println("El coche de color " + k.getColor() + " se repite " + v + " veces."));

			System.out.println("Total coches: " + coches.size());

		}
	}

	// Saca un reporte de las marcas existentes en el Parking
	public void reportMarcas() {
		if (coches.size() == 0) {
			System.out.println("Parking vacio");
		} else {
			System.out.println("\nREPORT DE MARCAS\n-----------" + "\nParking: " + nombre);
			mapMarcas.forEach(
					(k, v) -> System.out.println("El coche de marca " + k.getMarca() + " se repite " + v + " veces."));

			System.out.println("Total coches: " + coches.size());

		}
	}

	// Saca un reporte de los coches existentes en el Parking y su cantidad
	public void reportCochesIguales() {
		if (coches.size() == 0) {
			System.out.println("Parking vacio");
		} else {
			System.out.println("\nREPORT DE COCHES IGUALES\n-----------" + "\nParking: " + nombre);
			mapCoches.forEach((k, v) -> System.out.println(k + " se repite " + v + " veces."));

			System.out.println("Total coches: " + coches.size());

		}
	}

	// Saca un reporte de los coches existentes en el Parking sin repetirlo
	public void reportSetCoches() {
		if (coches.size() == 0) {
			System.out.println("Parking vacio");
		} else {
			System.out.println("\nREPORT SET DE COCHES\n-----------" + "\nParking: " + nombre);
			// setCoches.forEach(t -> System.out.println(t.toString()));
			setCoches.stream().sorted((o1, o2) -> o2.compareTo(o1)).forEach(t -> System.out.println(t.toString()));
			System.out.println("Total coches: " + coches.size());

		}
	}

	public void listaCochesRojos() {
		List<Coche> cochesRojos = coches.stream().filter(t -> t.getColor() == Color.RO).toList();

		coches.stream()
			.sorted(Comparator.comparing(Coche::getMarca).thenComparing(Coche::getColor));

		System.out.println(cochesRojos.size());
	}

	// Saca un coche del parking y lo elimina de todos sitios
	/*
	 * public boolean saleCocheYElimina(Coche c) { boolean resultado =
	 * compruebaCoche(c);
	 * 
	 * if (resultado) { coches.remove(c); mapColores.put(c.getColor(),
	 * mapColores.get(c.getColor()) > 1 ? mapColores.get(c.getColor()) - 1 : 0);
	 * mapMarcas.put(c.getMarca(), mapMarcas.get(c.getMarca()) > 1 ?
	 * mapMarcas.get(c.getMarca()) - 1 : 0); //mapCoches.put(c.toString(),
	 * mapCoches.get(c.toString()) > 1 ? mapCoches.get(c.toString()) - 1 : 0);
	 * mapCoches.put(c, mapCoches.get(c) > 1 ? mapCoches.get(c) - 1 : 0);
	 * 
	 * 
	 * if (mapCoches.get(c) == 0) { setCoches.remove(c.toString()); }
	 * 
	 * mapColores.entrySet().stream().filter(t -> t.getValue() == 0);
	 * 
	 * if (mapColores.get(c.getColor()) == 0 && mapMarcas.get(c.getMarca()) == 0) {
	 * mapColores.remove(c.getColor()); mapMarcas.remove(c.getMarca());
	 * 
	 * if (mapCoches.get(c.toString()) == 0) mapCoches.remove(c.toString());
	 * 
	 * } else if (mapColores.get(c.getColor()) == 0) {
	 * mapColores.remove(c.getColor());
	 * 
	 * if (mapCoches.get(c.toString()) == 0) mapCoches.remove(c.toString());
	 * 
	 * } else if (mapMarcas.get(c.getMarca()) == 0) {
	 * mapMarcas.remove(c.getMarca());
	 * 
	 * if (mapCoches.get(c.toString()) == 0) mapCoches.remove(c.toString()); }
	 * 
	 * }
	 * 
	 * return resultado; }
	 */

}