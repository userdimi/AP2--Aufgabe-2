import javax.swing.JCheckBox;

public class QuizAntworten {
	
	//Eigenschaften der Klasse 
	private String antwortText;
	protected boolean korrekt;
	private String symbol;
	
	//Konstruktor setzt die Eigenschaften fest
	public QuizAntworten (String antwortsText, String symbol, boolean korrekt) {
		
		this.antwortText = antwortsText;
		this.symbol = symbol;
		this.korrekt = korrekt;
	}
	
	//Liefert das Symbol
	public String getSymbol() {
		return symbol;
	}
	
	//Liefert Text des Loesungsvorschlags
	public String getAntwortsText() {
		return antwortText;
	}
	
	//Liefert den Wert der Korrektheit
	public boolean getKorrekt () {
		return korrekt;
	}
	
	
	// Prueft ob die Loesung richtig ausgewaehlt wurde
	public boolean check (String gewaehlteAntworten) {
		boolean tmp = gewaehlteAntworten.contains(symbol);
		return tmp == korrekt;
	}
	
	/*
	public boolean check (JCheckBox box) {
		boolean tmp = box.getText().contains(symbol);
		return tmp == korrekt;
	}*/
}
