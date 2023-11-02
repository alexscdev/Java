package _collections;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		Coche c1 = new Coche();
		Coche c2 = new Coche(Marca.ME, Color.RO);
		Coche c3 = new Coche(Marca.BM, Color.NA);
		Coche c4 = new Coche(Marca.BM, Color.NA);
		Coche c5 = new Coche(Marca.BM, Color.NA);
		Coche c6 = new Coche();

		Parking p1 = new Parking("Mi primer parking", 10_000_0);
		
		long t1 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			Coche c7 = new Coche();
			p1.entraCoche(c7);
		}
		long t2 = System.nanoTime();
		
		System.out.println((t2-t1)/1_000_000_000.0);

		/*p1.entraCoche(c1);

		p1.entraCoche(c2);

		p1.entraCoche(c3);

		p1.entraCoche(c4);

		p1.entraCoche(c5);

		p1.entraCoche(c2);

		p1.entraCoche(c4);

		p1.entraCoche(c6);

		p1.reportParking();

		p1.saleCoche(c2);

	    p1.reportParking();

		p1.saleCocheAleatrorio();

	    p1.reportParking();

		// p1.vaciaParking();


		p1.reportColores();
		p1.reportMarcas();

		p1.reportCochesIguales();*/
		p1.reportSetCoches();
		
		p1.listaCochesRojos();

	}

}
