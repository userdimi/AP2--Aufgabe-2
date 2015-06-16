import java.util.NoSuchElementException;


public class SinglyLinkedList implements AbstractListType {
	//erster Knoten zeigt auf Null -> Liste ist leer
	private Node first = null;
	private Node last = null;
	
	//F�gt am Anfang der Liste eine neue Frage hinzu
	@Override
	public void addFirstQuestion(QuizFragen fragen) {
		first = new Node (fragen, first);
	}
	
	//F�gt am Ende der Liste eine neue Frage hinzu
	@Override
	public void addLastQuestion(QuizFragen fragen) {
		
		//neuen Knoten erzeugen
		last = new Node(fragen, null);
		
		//wenn noch kein Knoten vorhanden, so wird dieser Knoten zum ersten Knoten
		if (first == null) first = last;
		
		//letzten Knoten suchen
		Node runPointer = first;
		
		while (runPointer.next != null) {
			runPointer = runPointer.next;
		}
		// Knoten ans Ende anh�ngen
		runPointer.next = last;		
	}
		
	//Die Liste ist leer, wenn der erste Knoten auf nulll zeigt
	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	//Gibt die erste Frage aus der Liste aus
		@Override
		public QuizFragen getFirst() {
			if (isEmpty()) throw new NoSuchElementException();
			return (QuizFragen) first.data;
		}
		
	//Gibt die letzte Frage aus der Liste aus
		@Override
		public QuizFragen getLast() {
			
			//Fehler wenn die Liste leer ist
			if (first == null) throw new NoSuchElementException();	
			
			return (QuizFragen) last.data;
		}
		
	//Z�hlt alle Fragen in der Liste
	@Override
	public int questionCount() {
		//gibt 0 aus, wenn die Liste leer ist
		if (isEmpty()) return 0;
		
		Node runPointer = first;
		int size = 0;
		//Setze den runPointer ein Knoten weiter solange bis der runPointer auf null zeigt -> letztes Element und erh�he size um 1
		while (runPointer != null) {
			runPointer = runPointer.next;
			size++;
		}
		//Gibt die Anzahl der Elemente wieder
		return size;
	}
	
	//Gibt die Frage an der Position n aus
	@Override
	public QuizFragen getQuestion(int n) {
		//Pr�fen ob die Liste leer ist
		if (isEmpty()) throw new NoSuchElementException("Die Liste ist leer!");
		
		Node runPointer = first;
		int position = 0;
		
		//Solange der runPointer nicht auf null zeigt, pr�fe ob die position mit n gleich ist, 
		//wenn ja, gebe das Objekt aus, wenn nein, position und runPointer um 1 erh�hen		
		while (runPointer != null) {
			
			if(position == n) return (QuizFragen) runPointer.data;
			
			position++;
			runPointer = runPointer.next;
		}
		//Fehler wenn am Ende der Liste kein Ergebnis vorliegt
		throw new NoSuchElementException();
	}
	
	//Gibt eine zuf�llige Frage aus
	@Override
	public QuizFragen randomQuestion() {
		//Zufallsvariable wird aus anhand der Gesamtfragen in der Liste erstellt
		int random = (int)( Math.random() * questionCount());
		//Gibt die Frage an Stelle der Zufallsvariable aus
		return getQuestion(random);
		
	}
	
	//Innere Klasse Node
	private class Node {
		//Referenz auf das Datenobjekt
		Object data;
		//Referenz auf den n�chsten Knoten
		Node next;
		
		//Konstruktor f�r die Klasse Node 
		private Node (Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
}
