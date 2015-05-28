import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

public class QuizApp extends Fragenkatalog  {
		
		//Arraylist für Fragen
		static ArrayList<QuizFragen> fragen = new ArrayList<QuizFragen>();
		//ArrayList für eigene Fragen
		static ArrayList <QuizFragen> eigeneFragen = new ArrayList<QuizFragen>();

		static int random = (int)( Math.random() * fragen.size());
		
		public static void setZufall () {
			random = (int) (Math.random() * fragen.size());
		}
		
		public static QuizFragen getRandom () {
			return fragen.get(random);
		}

	public static void main(String[] args) {
		
		
		//Initialisierung der Scannervariable
		Scanner s = new Scanner (System.in);
		//Variable für Startverhalten
		boolean start = true;
		
		//Hauptmenü
		while (start) {
			System.out.println("Willkommen zum Quizspiel!");
			System.out.println("-------------------------");
			System.out.println("Bitte wählen Sie aus: ");
			System.out.println("A: Quiz starten");
			System.out.println("B: Eigene Fragen hinzufügen");
			System.out.println("C: Quiz beenden");
			
			//Eingabe Menüauswahl
			String eingabe = s.nextLine();
			
			if (eingabe.contains("a")) {
				
				//Hinzufuegen der Fragen aus dem Fragenkatalog der ArrayList
				fragen.add(qf);
				fragen.add(qf1);
				fragen.add(qf2);
				fragen.add(qf3);
				fragen.add(qf4);
				
				//Zufällige Frage
				
			
				
				//Ausgabe der Fragen aus der ArrayList nacheinander
				
				QuizFrame quiz = new QuizFrame();
				
				for (QuizFragen i : fragen) {
					quiz.addFrage(i);
					i.frageStellen(quiz);
				}
					
					
				
			
			} else if (eingabe.contains("b")) {
				
				//Menüvariable
				boolean nochNeFrage = true;
				
				//Menü
				while (nochNeFrage) {
					
					System.out.println("Bitte Frage eingeben: ");
					//Liest die Frage als String ein
					String frage = s.nextLine();
					//Erstellt Array mit 4 Antwortmöglichkeiten
					QuizAntworten [] eigeneAntworten = new QuizAntworten [4];
					//Definiert die Punkte für die Frage
					int punkte = 0;
					//Richtigkeit Variable
					boolean k = false;
					
					//Eingabe der 4 Antwortmöglichkeiten
					for (int i = 0; i < eigeneAntworten.length; i++) {
						
						System.out.println ("Bitte Antwortmöglichkeit: eingeben ");
						//Liest die Antwortmöglichkeiten ein
						String aText = s.nextLine();
						
						System.out.println("Geben Sie das Symbol für die Frage ein");
						//Liest das Symbol ein
						String sy = s.nextLine();
						
						System.out.println("Ist diese Antwortmöglichkeit korrekt?");
						System.out.println ("J " + "N");
						//Legt fest, ob die Antwortmöglichkeit richtig ist
						String w = s.nextLine();
						//Abfrage ob die Eingabe Korrekt ist
						if (w.contains("j")) {
							k = true;
						} else if (w.contains("n")) {
							k = false;
						} else {
							System.out.println("Falsche Eingabe");
						}	//Eingabe in eigeneAntworten speichern 
							eigeneAntworten[i] = new QuizAntworten(aText, sy, k);
					}
					
					System.out.println("Wieviele Punkte: ");
					//Liest die Punkte ein
					punkte = s.nextInt();
					s.nextLine();
						
						//Erstellt ein Objekt eigeneFrage vom Typ SingelChoiceFrage
						QuizFragen eigeneFrage = new SingleChoiceFrage(frage, punkte, eigeneAntworten);
					
						//Fügt eigeneFragen der ArrayList hinzu
						eigeneFragen.add(eigeneFrage);
						System.out.println("Möchten Sie noch eine Frage eintragen?");
						System.out.println("Bitte eingeben: J oder N");
						
						//Liest die Eingabe ein
						String nextFrage = s.nextLine();
						
						//weitere Frage wird eingelesen
						if (nextFrage.contains("j")) {
							nochNeFrage = true;
						} else if (nextFrage.contains("n")){
							//keine weitere Frage mehr, zurück ins Hauptmenü
							nochNeFrage = false;
						} else {
							System.out.println ("Falsche Eingabe:");
						}
						
				}
				//eigeneFragen der ArrayList fragen hinzufügen
			 	fragen.addAll(eigeneFragen);
			 	//Beendet das Spiel
			} else if (eingabe.contains("c")) {
				System.out.println("Danke für das Spielen");
				start = false;
				System.exit(-1);
			}
		}	
	}

	private static void getZufall() {
		// TODO Auto-generated method stub
		
	}

	private static void random() {
		// TODO Auto-generated method stub
		
	}
}
