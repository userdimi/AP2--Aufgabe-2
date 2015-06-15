import static org.junit.Assert.*;

import org.junit.Test;


public class TestLinkedList {

	@Test
	public void test() {
		
		AbstractListType list = new SinglyLinkedList();
		

		SingleChoiceFrage qf = new SingleChoiceFrage("\nWenn das Wetter gut ist, wir der Bauer bestimmt den Eber, das Ferkel und..?", 50,
				new QuizAntworten("...einen drauf machen", "A", false), 
				new QuizAntworten("...die Nacht durchzechen", "B", false),
				new QuizAntworten("...die Sau rauslassen", "C", true), 
				new QuizAntworten("...auf die Kacke hauen", "D", false));

		SingleChoiceFrage qf1 = new SingleChoiceFrage("\nWas ist ziemlich viel?", 100,
				new QuizAntworten("stolze Summe", "A", true), 
				new QuizAntworten("selbstbewusste Differenz", "B", false), 
				new QuizAntworten("arroganter Quotient", "C", false),
				new QuizAntworten("hochm�tiges Produkt", "D", false));


		SingleChoiceFrage qf2 = new SingleChoiceFrage("\nWessen Genesung schnell voranschreitet, der erholt sich...?", 200,
				new QuizAntworten("...hinguckends", "A", false), 
				new QuizAntworten("...anschauends", "B", false), 
				new QuizAntworten("...zusehends", "C", true),
				new QuizAntworten("...glotzends", "D", false));

		SingleChoiceFrage qf3 = new SingleChoiceFrage("\nNat�rlich spielten musikalische Menschen auch im...?", 300,
				new QuizAntworten("...Westsaxo Fon", "A", false), 
				new QuizAntworten("...Nordklari Nette", "B", false), 
				new QuizAntworten("...S�dpo Saune", "C", false),
				new QuizAntworten("...Ostblock Fl�te", "D", true));
     
		SingleChoiceFrage qf4 = new SingleChoiceFrage("\nWobei gibt es keine geregelten �ffnungszeiten?", 500,
				new QuizAntworten("Baum�rkte", "A", false), 
				new QuizAntworten("M�belh�user", "B", false), 
				new QuizAntworten("Teppichgesch�fte", "C", false),
				new QuizAntworten("Fensterl�den", "D", true));

		SingleChoiceFrage qf5 = new SingleChoiceFrage("\nWobei gibt es keine geregelten �ffnungszeiten?", 1000,
				new QuizAntworten("Baum�rkte", "A", false), 
				new QuizAntworten("M�belh�user", "B", false), 
				new QuizAntworten("Teppichgesch�fte", "C", false),
				new QuizAntworten("Fensterl�den", "D", true));

		SingleChoiceFrage qf6 = new SingleChoiceFrage("\nWas war bereits seit Mai 1969 ein beliebtes Zahlungsmittel im europ�ischen Raum?", 2000,
				new QuizAntworten("Euronoten", "A", false), 
				new QuizAntworten("Eurocheques", "B", true), 
				new QuizAntworten("Euroscheine", "C", false),
				new QuizAntworten("Eurom�nzen", "D", false));

		SingleChoiceFrage qf7 = new SingleChoiceFrage("\nMaul Dreyer profitierte Anfang des Jahres von...?", 4000,
				new QuizAntworten("...Oettingers Sattelstange", "A", false), 
				new QuizAntworten("...Veltins Fahrradkette", "B", false), 
				new QuizAntworten("...Diebels Vorderreifen", "C", false),
				new QuizAntworten("...Becks R�cktritt", "D", true));

		SingleChoiceFrage qf8 = new SingleChoiceFrage("\nWoraus besteht in der Regel eine Entourage?", 8000,
				new QuizAntworten("Baguette & Rotwein", "A", false), 
				new QuizAntworten("Mascara & Liedschatten", "B", false), 
				new QuizAntworten("Freunde & Bekannte", "C", true),
				new QuizAntworten("Sofa & Sessel", "D", false));
		
		list.addFirstQuestion(qf);
		list.addFirstQuestion(qf1);
		list.addFirstQuestion(qf3);
		list.questionCount();
		list.randomQuestion();
		//list.addLastQuestion(qf2);
		
	}

}
