package books;

public class Libro extends Publicacion {

	private static String mensajeCabecera = "\nDATOS LIBRO\n=============\n";

	private String autor;

	public Libro(String titulo, String autor, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, formatoDigital, precio);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}
	
	public void show() {
		System.out.println(mensajeCabecera + "Titulo: " + getTitulo() + "\n" + "Autor: "
				+ getAutor() + "\n" + "Id: " + getID() + "\n" + "Paginas: " + getNumPags() + "\n"
				+ "Pagina Inicial: " + getPagInicial() + "\n" + "Pagina Actual: " + getPagActual() + "\n"
				+ "Precio: " + getPrecio() + "\n" + "Formato digital: " + isFormatoDigital() + "\n" + "Leido: "
				+ isLeido() + "\n");
	}
	
	
	public static void showStatic(Libro l) {
		l.show();
	}

	

	@Override
	public void leePagina(boolean silenciosamente) {
		if (silenciosamente == true) {
			super.leePagina();
		} else {
			if (getPagActual() == getNumPags()) {
				System.out.println("Libro titulado " + getTitulo() + " del autor " + getAutor() + " ya ha sido leido");
			} else if (getPagActual() == (getNumPags() - 1)) {
				setPagActual(getPagActual() + 1);
				System.out.println("Ultima pagina (" + getNumPags() + ") leida del libro titulado " + getTitulo()
						+ " del autor " + getAutor());
			} else {
				setPagActual(getPagActual() + 1);
				System.out.println("Pagina " + getPagActual() + " leida del libro titulado " + getTitulo()
						+ " del autor " + getAutor());
			}
		}
	}
	
	public static void leePaginaStatic(boolean silenciosamente, Libro l) {
		l.leePagina(silenciosamente);
	}

}
