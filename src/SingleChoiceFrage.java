public class SingleChoiceFrage extends QuizFragen {

	private String frage;
	private int punkte = 0;
	private QuizAntworten [] antwortmoeglichkeiten = new QuizAntworten [4];
	
	public SingleChoiceFrage(String frage, QuizAntworten antwort0, QuizAntworten antwort1, QuizAntworten antwort2, QuizAntworten antwort3, int punkte) {
		super(frage, antwort0, antwort1, antwort2, antwort3);
		this.punkte = punkte;
	}
	
	public int counter(String input, int punkte){
		total = total + punkte;
		System.out.println("Sie haben " + total + " Euro gewonnen!");
		return total;
	}
	
	/*
	public void frageStellen(){
		System.out.println(frage + " (" + punkte + " erreichbar)");
		for ( QuizAntworten i : antwortmoeglichkeiten) {
			System.out.println(i.getSymbol() + ": " + i.getAntwortsText());
		}
 	
		System.out.println("\nWaehlen Sie die richtigen Antwortmoeglichkeiten: ");
		input = getInput();
		//System.out.println(input);
		total = counter(input, punkte);
	}*/
	
	
	@Override
	public void frageStellen () {
		System.out.println("" +punkte + " € Frage"); 
		System.out.println(frage);
		super.frageStellen();
		total = counter(input, punkte);
		
	}
}
