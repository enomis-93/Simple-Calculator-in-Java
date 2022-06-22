package it.corso.java;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Boolean continueCalc = true;
		
		Calcolatrice calc = new Calcolatrice();
		while (continueCalc) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digita il tipo di operazione che vuoi effettuare tra le seguenti: \n"+
						"'somma' \n"+
						"'sottrazione' \n"+
						"'moltiplicazione' \n"+
						"'divisione' \n"+
						"'radice quadrata' \n"+
						"'potenza' \n" +
						"o digita 'exit' per uscire"
						
						);
			
				String operation = scanner.nextLine();
				
					
				
				switch(operation) {
				case "somma": {
					System.out.println("Inserisci un numero");
					double a = scanner.nextDouble();
					System.out.println("Inserisci il numero da sommare");
					double b = scanner.nextDouble();
					
					System.out.println("risultato " + calc.somma(a, b));
				}
					break;
					
				case "sottrazione":{
					System.out.println("Inserisci un numero");
					double a = scanner.nextDouble();
					System.out.println("Inserisci il numero da sottrarre");
					double b = scanner.nextDouble();
					
					System.out.println("risultato " + calc.sottrazione(a, b));
				}
					break;
					
				case "divisione":{
					System.out.println("Inserisci un numero da dividere");
					double a = scanner.nextDouble();
					System.out.println("Per quanto vuoi dividere il tuo numero ?");
					double b = scanner.nextDouble();
					if(b != 0) {
						System.out.println("risultato " + calc.divisione(a, b));
					} else {
						System.out.println("Impossibile dividere un numero per 0");
					}
					
				}
					break;
					
				case "moltiplicazione":{
					System.out.println("Inserisci un numero");
					double a = scanner.nextDouble();
					System.out.println("Per quanto vuoi moltiplicare il tuo numero ?");
					double b = scanner.nextDouble();
					
					System.out.println("risultato " + calc.moltiplicazione(a, b));
				}
					break;
					
				case "radice quadrata":{
					System.out.println("Di che numero vuoi la radice quadrata?");
					double a = scanner.nextDouble();
					
					System.out.println("risultato " + calc.radiceQuadrata(a));
				}
					break;
				case "potenza":{
					System.out.println("Inserisci il numero che vuoi elevare a potenza");
					double a = scanner.nextDouble();
					System.out.println("Inserisci l'esponente");
					double b = scanner.nextDouble();
					
					System.out.println("risultato " + calc.potenza(a, b));
				}
					break;
					
				case "exit":{
					continueCalc = false;
					System.out.println("Calcoli terminati, Arrivederci!");
				}
					break;
				default: System.out.println("L'operazione da te richiesta non esiste!");
					
				}
		
		}
		
				
			
		
				
			
	}

}
