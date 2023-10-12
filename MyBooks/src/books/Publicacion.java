package books;

public abstract class Publicacion implements CanRead {

	// Registro de ID creados
	private static long nextID = 1;

	private String titulo;
	private int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;
	private int ID;
	private int pagActual;
	private boolean leido;

	public Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		this.pagActual = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		this.ID = (int) nextID;
		nextID += 1;
	}

	// toString
	@Override
	public String toString() {
		return "Publicacion " + titulo + " con " + numPags + " páginas y precio " + precio + " € ";
	}

	// Geters y Seters
	public String getTitulo() {
		return titulo;
	}

	public int getNumPags() {
		return numPags;
	}

	public int getPagInicial() {
		return pagInicial;
	}

	public boolean isFormatoDigital() {
		return formatoDigital;
	}

	public double getPrecio() {
		return precio;
	}

	public int getID() {
		return ID;
	}

	public int getPagActual() {
		return pagActual;
	}

	public boolean isLeido() {
		return leido;
	}

	public void setPagActual(int pagActual) {
		this.pagActual = pagActual;
	}
	
	public void show(Publicacion p) {
		if (p instanceof Libro) {
			System.out.println(((Libro) p).getMensajeCabecera() + "Titulo: " + p.getTitulo() + "\n" + "Autor: "
					+ ((Libro) p).getAutor() + "\n" + "Id: " + p.getID() + "\n" + "Paginas: " + p.getNumPags() + "\n"
					+ "Pagina Inicial: " + p.getPagInicial() + "\n" + "Pagina Actual: " + p.getPagActual() + "\n"
					+ "Precio: " + p.getPrecio() + "\n" + "Formato digital: " + p.isFormatoDigital() + "\n" + "Leido: "
					+ p.isLeido() + "\n");
		} else {

			System.out.println(((Revista) p).getMensajeCabecera() + "Titulo: " + p.getTitulo() + "\n" + "Id: "
					+ p.getID() + "\n" + "Paginas: " + p.getNumPags() + "\n" + "Pagina Inicial: " + p.getPagInicial()
					+ "\n" + "Pagina Actual: " + p.getPagActual() + "\n" + "Precio: " + p.getPrecio() + "\n"
					+ "Formato digital: " + p.isFormatoDigital() + "\n" + "Leido: " + p.isLeido() + "\n");
		}
	}
	

	public static void showStatic(Publicacion p) {
		p.show(p);
	}
	
	

	public static void leePaginaStatic(boolean silenciosamente, Publicacion p) {
		if (p instanceof Libro) 
			((Libro) p).leePagina(silenciosamente);
		
		if (p instanceof Revista)
			((Revista) p).leePagina(silenciosamente);
	}

}
