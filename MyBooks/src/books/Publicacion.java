package books;

public abstract class Publicacion implements CanRead {

	// Registro de ID creados
	private static long nextID = 1;

	private String titulo;
	private int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;
	private int id;
	private int pagActual;
	private boolean leido;

	public Publicacion(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		this.pagActual = pagInicial;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		this.id = (int) nextID;
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
		return id;
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
	
	
	public void leePagina() {
		if (getPagActual() != getNumPags())
			setPagActual(getPagActual() + 1);
	}
	

	
	

}
