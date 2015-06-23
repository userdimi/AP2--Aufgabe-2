
public interface AbstractListType {
	
	/**
	 * Fügt am Anfang der Liste eine neue Frage hinzu
	 * @param fragen wird am Anfang der Liste hinzugefügt
	 */
	public void addFirstQuestion (QuizFragen fragen);
	
	/**
	 * Fügt eine QuizFrage am Ende der Liste ein
	 * @param frage wird als letztes Element der Liste eingefügt
	 */
	public void addLastQuestion (QuizFragen fragen);
	
	/**
	 * Gibt die erste Frage aus
	 * @return erste Frage 
	 */
	public QuizFragen getFirst ();
	
	/**
	 * Gibt die letzte Frage aus
	 * @return letzte Frage
	 */
	public QuizFragen getLast ();

	
	/**
	 * 
	 * @return wahr, wenn die Liste leer ist
	 */
	public boolean isEmpty ();
	
	
	/**
	 * 
	 * @return Anzahl der Quiz-Fragen, die in der Liste vorhanden sind
	 */
	public int questionCount();
	
	/**
	 * 
	 * @param n gibt eine bestimmte Position der Frage an
	 * @return QuizFragen an der Position n
	 */
	public QuizFragen getQuestion (int n);
	
	
	/**
	 * 
	 * @return liefert eine zufällige Quiz-Frage der Liste 
	 */
	public QuizFragen randomQuestion ();
	
	/**
	 * Entfernt die Frage aus der Liste
	 */
	public void delete(QuizFragen fragen);
	
	/**
	 * Fügt eine QuizFrage sortiert ein. Sortiert wird nach dem Fragetext, 
	 * z.B steht "Wie viele Einwohner hat Köln" alphabetisch hinter 
	 * "An welchem Tag beginnt das neue Jahr?".
	 * @param frage wird alphabetisch (nach Fragetext der QuizFrage) einsortiert
	 */
	public void addSorted (QuizFragen frage);
	
	/**
	 * Sortiert die vorhandenen Elemente der Liste
	 */
	public void sort ();
	
	/**
	 * 
	 * @return wahr, wenn alle Elemente der Liste sortiert sind
	 */
	public boolean isSorted ();
}
