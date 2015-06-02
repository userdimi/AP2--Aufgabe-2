import java.util.ArrayList;

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
	
				//Hinzufuegen der Fragen aus dem Fragenkatalog der ArrayList
				fragen.add(qf);
				fragen.add(qf1);
				fragen.add(qf2);
				fragen.add(qf3);
				fragen.add(qf4);
				
				//Ausgabe der Fragen aus der ArrayList nacheinander
				
				QuizFrame quiz = new QuizFrame();
				
				for (QuizFragen i : fragen) {
					quiz.addFrage(i);
					i.frageStellen(quiz);
				}
					
					
	}
}
