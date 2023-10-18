package books;

public class Revista extends Publicacion {

	private static String mensajeCabecera = "\nDATOS REVISTA\n=============\n";
	

	
	
	// Constructor
	public Revista(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, formatoDigital, precio);
	}

	// Geter y Seters
	public String getMensajeCabecera() {

		return mensajeCabecera;
	}

	public void show() {
		System.out.println(mensajeCabecera + "Titulo: " + getTitulo() + "\n" + "Id: "
				+ getID() + "\n" + "Paginas: " + getNumPags() + "\n" + "Pagina Inicial: " + getPagInicial()
				+ "\n" + "Pagina Actual: " + getPagActual() + "\n" + "Precio: " + getPrecio() + "\n"
				+ "Formato digital: " + isFormatoDigital() + "\n" + "Leido: " + isLeido() + "\n");
	}
	
	public static void showStatic(Revista r) {
		r.show();
	}
	

	@Override
	public void leePagina(boolean silenciosamente) {
		if (silenciosamente ) {
			super.leePagina();
		} else {
			if (getPagActual() == getNumPags()) {
				System.out.println("Revista titulada " + getTitulo() + " ya ha sido leida");
			} else if (getPagActual() == (getNumPags() - 1)) {
				setPagActual(getPagActual() + 1);
				System.out.println("Ultima pagina (" + getNumPags() + ") leida de la revista titulada " + getTitulo());
			} else {
				setPagActual(getPagActual() + 1);
				System.out.println("Pagina " + getPagActual() + " leida de la revista titulada " + getTitulo());
			}
		}
	}
	
	public static void leePaginaStatic(boolean silenciosamente, Revista r) {
		r.leePagina(silenciosamente);
	}

}
