package it.corso.java;

/**
 * Classe che implementa le operazioni aritmetiche da eseguire
 * @author Simone
 *
 */
public class Calcolatrice {
	public double somma( double a, double b) {
		return a + b;
	}
	
	public double sottrazione( double a, double b) {
		return a - b;
	}
	
	public double divisione( double a, double b) {
		return a / b;
	}
	
	public double moltiplicazione( double a, double b) {
		return a * b;
	}
	
	public double radiceQuadrata( double a) {
		return Math.sqrt(a);
	}
	
	public double potenza( double a, double b) {
		return Math.pow(a, b);
	}

	
}


