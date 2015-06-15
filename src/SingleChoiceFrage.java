import javax.swing.JCheckBox;

public class SingleChoiceFrage extends QuizFragen {

	private String frage;
	private int punkte = 0;
	private QuizAntworten [] antwortmoeglichkeiten = new QuizAntworten [4];
	
	public SingleChoiceFrage(String frage, int punkte, QuizAntworten... antworten) {
		super(frage, antworten);
		this.punkte = punkte;
		for (int i = 0; i < antwortmoeglichkeiten.length; i++) {
			antwortmoeglichkeiten[i] = antworten[i];
					
		}
	}
	
	public int counter(JCheckBox input, int punkte){
		total = total + punkte;
		System.out.println("Sie haben " + total + " Euro gewonnen!");
		return total;
	}
	
	public int getPunkte () {
		return punkte;
	}
	
	public boolean isSingel () {
		int index = 0;
		for (int i = 0; i < antwortmoeglichkeiten.length; i++) {
			if (antwortmoeglichkeiten[i].getKorrekt()) 
				index++;
		}
			if (index == 1)
				return true;		
			return false;
	}		
	
	@Override
	public void frageStellen () {
		System.out.println("" +punkte + " € Frage"); 
		System.out.println(frage);
		super.frageStellen();
		total = counter(input, punkte);
		
	}
}
