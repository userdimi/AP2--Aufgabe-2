import java.util.Scanner;

public class QuizFragen {
	
	//Eigenschaften der Klasse
	
	protected static int total = 0;
	
	//Speichert den String der Frage ab
	private String frage;
	
	//Speichert 4 Antwortmöglichkeiten in das Array ab
	private QuizAntworten [] antwortmoeglichkeiten = new QuizAntworten [4];
	
	//Speichert die Eingabe des Benutzers
	protected String input;
	
	//Auslesen der Eingabe des Benutzers
	private Scanner scan = new Scanner(System.in);
	
	//Konstruktor zum Erstellen der Frage
	public QuizFragen (String frage, QuizAntworten antwort0, QuizAntworten antwort1, QuizAntworten antwort2, QuizAntworten antwort3) {
		this.frage = frage;
		this.antwortmoeglichkeiten[0] = antwort0;
		this.antwortmoeglichkeiten[1] = antwort1;
		this.antwortmoeglichkeiten[2] = antwort2;
		this.antwortmoeglichkeiten[3] = antwort3;
	}
	
	//Ausgabe der Frage mit Antwortmöglichkeiten
	public void frageStellen() {
		
		//Gibt den String der Frage aus
		System.out.println(frage);
		
		//gibt die Antwortmöglichkeiten der Frage aus 
		for ( QuizAntworten i : antwortmoeglichkeiten) {
				System.out.println(i.getSymbol() + ": " + i.getAntwortsText());
		}
		
		System.out.println("\nWaehlen Sie die richtigen Antwortmoeglichkeiten: ");
		
		//Speichert die Eingabe des Benutzers in die Variable input
		input = getInput();
		
		counter(input);
	}
	
	//Konvertiert die Eingabe des Benutzers
	public String getInput() {
		scan = new Scanner(System.in);
		input = scan.nextLine();
		input = input.toUpperCase();
		input = input.replaceAll("," , "");
		input = input.replaceAll(" ", "");
		return input;
	}
	
	//Beendet die Eingabe des Benutzers
	public void closeInput(){
		scan.close();
	}
	
	
	public int counter(String input){
		int nice = 0;
		
		for ( QuizAntworten i : antwortmoeglichkeiten) {
			if(i.check(input)){
				nice++;
			}else{
				//System.out.println(i.getSymbol() + " -> ist nicht richtig gewaehlt!");
				System.out.println("Ihre Antwort war leider falsch. GAME OVER!");
				System.out.println("Sie haben" + total + " € gewonnen");
				System.exit(0);
			}
		}		
		System.out.println("Sie haben " + nice + " Antworten aus " + antwortmoeglichkeiten.length + " richtig gewaehlt!");
		return nice;
	}
}
		