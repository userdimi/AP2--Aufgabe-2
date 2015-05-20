import java.util.ArrayList;

public class QuizApp extends Fragenkatalog  {
	
	public static void main(String[] args) {
		
		//Erzeugen eine ArraList mit Fragen
		ArrayList<QuizFragen> fragen = new ArrayList<QuizFragen>();
		
		//Hinzufuegen der Fragen aus dem Fragenkatalog der ArrayList
		fragen.add(qf);
		fragen.add(qf1);
		fragen.add(qf2);
		fragen.add(qf3);
		fragen.add(qf);
		
		//Ausgabe der Fragen aus der ArrayList nacheinander
		for (int i = 0; i < fragen.size(); i++ ) {
			fragen.get(i).frageStellen();
		}
	}
}
