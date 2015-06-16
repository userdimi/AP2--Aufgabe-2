
public interface AbstractListType {
	
	/**
	 * F�gt am Anfang der Liste eine neue Frage hinzu
	 * @param fragen wird am Anfang der Liste hinzugef�gt
	 */
	public void addFirstQuestion (QuizFragen fragen);
	
	/**
	 * F�gt eine QuizFrage am Ende der Liste ein
	 * @param frage wird als letztes Element der Liste eingef�gt
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
	 * @return liefert eine zuf�llige Quiz-Frage der Liste 
	 */
	public QuizFragen randomQuestion ();
}
