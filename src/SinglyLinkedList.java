import java.util.NoSuchElementException;


public class SinglyLinkedList implements AbstractListType {
	//erster Knoten zeigt auf Null -> Liste ist leer
	private Node first = null;
	
	
	//Fügt am Anfang der Liste eine neue Frage hinzu
	@Override
	public void addFirstQuestion(QuizFragen fragen) {
		Node next = new Node(fragen, first);
		
	}
	
	//Fügt am Ende der Liste eine neue Frage hinzu
	@Override
	public void addLastQuestion(QuizFragen frage) {
		
		//Fehler falls Liste leer
		if (isEmpty()) throw new NoSuchElementException();
		// runPointer erstellen und auf den ersten Knoten setzen
		Node runPointer = first;
		
		//Setze den runPointer ein Knoten weiter solange bis der runPointer auf null zeigt -> letztes Element
		while (runPointer != null) {
			runPointer = runPointer.next;
		}	
			//fügt an der Stelle des runPointers einen neuen Knoten an
			runPointer = new Node (frage, null);
	}
	
	//Die Liste ist leer, wenn der erste Knoten auf nulll zeigt
	@Override
	public boolean isEmpty() {
		return first == null;
	}
	
	//Zählt alle Fragen in der Liste
	@Override
	public int questionCount() {
		//gibt 0 aus, wenn die Liste leer ist
		if (isEmpty()) return 0;
		
		Node runPointer = first;
		int size = 0;
		//Setze den runPointer ein Knoten weiter solange bis der runPointer auf null zeigt -> letztes Element und erhöhe size um 1
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
		//Prüfen ob die Liste leer ist
		if (isEmpty()) throw new NoSuchElementException("Die Liste ist leer!");
		
		Node runPointer = first;
		int position = 0;
		
		//Solange der runPointer nicht auf null zeigt, prüfe ob die position mit n gleich ist, 
		//wenn ja, gebe das Objekt aus, wenn nein, position und runPointer um 1 erhöhen		
		while (runPointer != null) {
			if(position == n) return (QuizFragen) runPointer.data;
			
			position++;
			runPointer = runPointer.next;
		}
		//Fehler wenn am Ende der Liste kein Ergebnis vorliegt
		throw new NoSuchElementException();
	}
	
	//Gibt eine zufällige Frage aus
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
		//Referenz auf den nächsten Knoten
		Node next;
		
		//Konstruktor für die Klasse Node 
		public Node (Object o, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	
	
}
