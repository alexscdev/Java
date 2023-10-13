package books;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		Libro lib1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		Libro lib2 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib3 = new Libro("1984", "George Orwell", 122, 9, false, 25.99);
		Libro lib4 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 22.99);
		Libro lib5 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib6 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib7 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		Libro lib8 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib9 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib10 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);

		Revista rev1 = new Revista("Muy Interesante", 45, 1, true, 5.99);
		Revista rev2 = new Revista("Hola!", 30, 1, false, 1.99);
		Revista rev3 = new Revista("Lecturas", 30, 1, true, 3.00);
		Revista rev4 = new Revista("autofacil", 30, 1, false, 1.99);
		Revista rev5 = new Revista("Transporte Mundial", 30, 1, false, 1.99);

		// Creacion del array de Publicaciones
		Publicacion[] publicaciones = { lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9, lib10, rev1, rev2, rev3,
				rev4, rev5 };

		System.out.println("\nTodas las publicaciones");
		// Todas las publicaciones del array publicaciones con título y ID.
		for (int i = 0; i < publicaciones.length; i++) // Optimizar con for Each
			System.out.println("Titulo: " + publicaciones[i].getTitulo() + " --ID: " + publicaciones[i].getID());

		System.out.println("\nSolo Libros");
		// Solo libros
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i] instanceof Libro)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " --ID: " + publicaciones[i].getID());

		System.out.println("\nSolo Revistas");
		// Solo revistas
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i] instanceof Revista)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " --ID: " + publicaciones[i].getID());

		System.out.println("\nPublicaciones con precio mayor que 20€");
		// Publicaciones con precio mayor que 20€
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i].getPrecio() > 20.00)
			System.out.println("Titulo: " + publicaciones[i].getTitulo() + " --ID: " + publicaciones[i].getID()
					+ " Precio: " + publicaciones[i].getPrecio());

		System.out.println("\nLibros con precio mayor que 20€");
		// Libros con precio mayor que 20€
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i] instanceof Libro && publicaciones[i].getPrecio() > 20.00)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " --ID: " + publicaciones[i].getID()
						+ " Precio: " + publicaciones[i].getPrecio());

		System.out.println("\nRevistas con precio mayor que 3€");
		// Revistas con precio mayor que 3€
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i] instanceof Revista && publicaciones[i].getPrecio() > 3.00)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " --ID: " + publicaciones[i].getID()
						+ " Precio: " + publicaciones[i].getPrecio());

		ArrayList<Publicacion> publicacionesList = new ArrayList<>(Arrays.asList(lib1, lib2, lib3, lib4, lib5, lib6,
				lib7, lib8, lib9, lib10, rev1, rev2, rev3, rev4, rev5));

		Libro libroUlises = (Libro) publicacionesList.get(7);

		System.out.println("\nTodas las publicaciones");
		// Todas las publicaciones del array publicaciones con título y ID.
		for (int i = 0; i < publicacionesList.size(); i++) // Optimizar con for Each
			System.out.println(
					"Titulo: " + publicacionesList.get(i).getTitulo() + " --ID: " + publicacionesList.get(i).getID());

		System.out.println("\nSolo Libros");
		// Solo libros
		for (int i = 0; i < publicacionesList.size(); i++)
			if (publicaciones[i] instanceof Libro)
				System.out.println("Titulo: " + publicacionesList.get(i).getTitulo() + " --ID: "
						+ publicacionesList.get(i).getID());

		System.out.println("\nSolo Revistas");
		// Solo revistas
		for (int i = 0; i < publicacionesList.size(); i++)
			if (publicaciones[i] instanceof Revista)
				System.out.println("Titulo: " + publicacionesList.get(i).getTitulo() + " --ID: "
						+ publicacionesList.get(i).getID());

		System.out.println("\nPublicaciones con precio mayor que 20€");
		// Publicaciones con precio mayor que 20€
		for (int i = 0; i < publicacionesList.size(); i++)
			System.out.println("Titulo: " + publicacionesList.get(i).getTitulo() + " --ID: "
					+ publicacionesList.get(i).getID() + " Precio: " + publicacionesList.get(i).getPrecio());

		System.out.println("\nLibros con precio mayor que 20€");
		// Libros con precio mayor que 20€
		for (int i = 0; i < publicacionesList.size(); i++)
			if (publicacionesList.get(i) instanceof Libro && publicacionesList.get(i).getPrecio() > 20.00)
				System.out.println("Titulo: " + publicacionesList.get(i).getTitulo() + " --ID: "
						+ publicacionesList.get(i).getID() + " Precio: " + publicacionesList.get(i).getPrecio());

		System.out.println("\nRevistas con precio mayor que 3€");
		// Revistas con precio mayor que 3€
		for (int i = 0; i < publicacionesList.size(); i++)
			if (publicaciones[i] instanceof Revista && publicaciones[i].getPrecio() > 3.00)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " --ID: " + publicaciones[i].getID()
						+ " Precio: " + publicaciones[i].getPrecio());

		libroUlises.showStatic(libroUlises);

		for (int i = 0; i < 300; i++)
			Publicacion.leePaginaStatic(true, libroUlises);
		// get pagina actual
		for (int i = 0; i < 5; i++)
			Publicacion.leePaginaStatic(false, libroUlises);

		for (int i = 0; i < 10; i++)
			libroUlises.leePagina(false);

		for (int i = 0; i < 1000; i++)
			libroUlises.leePagina(false);

	}

}
