import java.util.NoSuchElementException;

public class SinglyLinkedList implements AbstractListType {
	// erster Knoten zeigt auf Null -> Liste ist leer
	private Node first = null;
	private Node last = null;

	// Fügt am Anfang der Liste eine neue Frage hinzu
	@Override
	public void addFirstQuestion(QuizFragen fragen) {
		first = new Node(fragen, first);
	}

	// Fügt am Ende der Liste eine neue Frage hinzu
	@Override
	public void addLastQuestion(QuizFragen fragen) {

		// neuen Knoten erzeugen
		last = new Node(fragen, null);

		// wenn noch kein Knoten vorhanden, so wird dieser Knoten zum ersten
		// Knoten
		if (first == null)
			first = last;

		// letzten Knoten suchen
		Node runPointer = first;

		while (runPointer.next != null) {
			runPointer = runPointer.next;
		}
		// Knoten ans Ende anhängen
		runPointer.next = last;
	}

	// Die Liste ist leer, wenn der erste Knoten auf nulll zeigt
	@Override
	public boolean isEmpty() {
		return first == null;
	}

	// Gibt die erste Frage aus der Liste aus
	@Override
	public QuizFragen getFirst() {
		if (isEmpty())
			throw new NoSuchElementException();
		return (QuizFragen) first.data;
	}

	// Gibt die letzte Frage aus der Liste aus
	@Override
	public QuizFragen getLast() {

		// Fehler wenn die Liste leer ist
		if (first == null)
			throw new NoSuchElementException();

		return (QuizFragen) last.data;
	}

	// Zählt alle Fragen in der Liste
	@Override
	public int questionCount() {
		// gibt 0 aus, wenn die Liste leer ist
		if (isEmpty())
			return 0;

		Node runPointer = first;
		int size = 0;
		// Setze den runPointer ein Knoten weiter solange bis der runPointer auf
		// null zeigt -> letztes Element und erhöhe size um 1
		while (runPointer != null) {
			runPointer = runPointer.next;
			size++;
		}
		// Gibt die Anzahl der Elemente wieder
		return size;
	}

	// Gibt die Frage an der Position n aus
	@Override
	public QuizFragen getQuestion(int n) {
		// Prüfen ob die Liste leer ist
		if (isEmpty())
			throw new NoSuchElementException("Die Liste ist leer!");

		Node runPointer = first;
		int position = 0;

		// Solange der runPointer nicht auf null zeigt, prüfe ob die position
		// mit n gleich ist,
		// wenn ja, gebe das Objekt aus, wenn nein, position und runPointer um 1
		// erhöhen
		while (runPointer != null) {

			if (position == n)
				return (QuizFragen) runPointer.data;

			position++;
			runPointer = runPointer.next;
		}
		// Fehler wenn am Ende der Liste kein Ergebnis vorliegt
		throw new NoSuchElementException();
	}

	// Gibt eine zufällige Frage aus
	@Override
	public QuizFragen randomQuestion() {
		// Zufallsvariable wird aus anhand der Gesamtfragen in der Liste
		// erstellt
		int random = (int) (Math.random() * questionCount());
		// Gibt die Frage an Stelle der Zufallsvariable aus
		QuizFragen fragetmp = (getQuestion(random));
		delete(fragetmp);
		return fragetmp;

	}

	// Innere Klasse Node
	private class Node {
		// Referenz auf das Datenobjekt
		Object data;
		// Referenz auf den nächsten Knoten
		Node next;

		// Konstruktor für die Klasse Node
		private Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setDataa(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	@Override
	public void delete(QuizFragen fragen) {

		if (first == null) {

		} else if (first.data.equals(fragen)) {
			first = first.next;
		} else {
			Node runPointer = first;
			while (runPointer.next != null
					&& !runPointer.next.data.equals(fragen)) {
				runPointer = runPointer.next;
			}
			if (runPointer != null) {
				runPointer.next = runPointer.next.next;
			}

		}

	}

	@Override
	public void addSorted(QuizFragen frage) {
		// Wenn die Liste leer ist, füge den Knoten an Anfang an
		if (isEmpty()) {
			first = new Node(frage, first);
			return;
		}

		// Laufvariable erstellen
		Node runPointer = first;
		int index = 0;
		// Durchlaufen der Liste
		while (runPointer != null) {

			// Ergebnis aus dem Vergleich beider Fragen wird in die Variable
			// gespeichert
			int res = getQuestion(index).getFrage().compareTo(
					frage.getFrage());

			System.out.println("numPointer.data = "
					+ String.valueOf(getQuestion(index).getFrage()));
			System.out.println("frage = " + frage.getFrage().toString());
			System.out.println("Vergleichsergebnis = " + res);
			System.out.println("-----");

			// Wenn der Wert aus res > 0 ist, dann vor dem aktuellen Knoten
			// einfügen
			if (res < 0) {
				if (runPointer.next == null) {
					addLastQuestion(frage);
					return;
				}
				runPointer = runPointer.next;
				index++;

			} else if (res > 0) {

				addOnPosition(frage, (index));
				return;
			}

			System.out.println(index);
			

		}
	}

	@Override
	public void reverse() {
	    Node prev = null; 
	    Node current = first; 
	    Node next = current.next;
	    
	    while(current.next != null) {
	        current.next = prev;
	        prev = current;
	        current = next;
	        next = current.next;
	    }
	    current.next = prev;
	    first = current;
	}	

	@Override
	public void sort() {
		
		AbstractListType list = new SinglyLinkedList();
		
		int SchleifenIndex = questionCount();
		int ListenIndex = 0;
		
		while (SchleifenIndex != 0) {
			
			
			
		}
		
		SchleifenIndex--;
		ListenIndex++;
		

	}

	// Liefert wahr, wenn die Liste sortiert ist
	@Override
	public boolean isSorted() {
		// ist sortiert, wenn die Liste leer ist
		if (isEmpty() || questionCount() == 1) {
			return true;
		}
		return false;
	}

	// Fügt an einer bestimmten Position in der Liste eine Frage ein
	@Override
	public void addOnPosition(QuizFragen fragen, int index) {
		// Neuer Knoten wird erstellt
		Node runPointer = new Node(fragen, null);
		// aktueller Knoten wird auf anfang gesetzt
		Node current = first;

		if (index == 0) {
			addFirstQuestion((QuizFragen) runPointer.data);

		} else {

			for (int i = 0; i < index-1 && current.getNext() != null; i++) {
				current = current.getNext();
			}

			runPointer.setNext(current.getNext());
			current.setNext(runPointer);
		}

	}

	@Override
	public int indexOf(QuizFragen frage) {

		Node runPointer = first; // Start am Anfang der Liste

		int i = 0; // Laufvariable

		// Suchen solange das gesuchte Element nicht gefunden wurde

		for (; !runPointer.data.equals(frage) && runPointer != null; i++) {
			runPointer = runPointer.next;
		}

		if (i == questionCount())
			return -1; // Wenn nichts gefunden wurde

		return i; // Gibt die Stelle an der das Element ist
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node p = first;
		final StringBuilder builder = new StringBuilder();
		builder.append("SinglyLinkedList(");
		while(p!=null) {
			final QuizFragen currentFrage = (QuizFragen) p.data;
			builder.append(currentFrage.getFrage() + ", ");
			p = p.next;
		}
		
		return builder.toString().substring(0, builder.length() - 2) + ")";
	}

}
