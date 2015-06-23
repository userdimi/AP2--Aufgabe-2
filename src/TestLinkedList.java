import org.hamcrest.core.IsEqual;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestLinkedList {
	
	SingleChoiceFrage qf = new SingleChoiceFrage("\nWenn das Wetter gut ist, wir der Bauer bestimmt den Eber, das Ferkel und..?", 50,
			new QuizAntworten("...einen drauf machen", "A", false), 
			new QuizAntworten("...die Nacht durchzechen", "B", false),
			new QuizAntworten("...die Sau rauslassen", "C", true), 
			new QuizAntworten("...auf die Kacke hauen", "D", false));

	SingleChoiceFrage qf1 = new SingleChoiceFrage("\nWas ist ziemlich viel?", 100,
			new QuizAntworten("stolze Summe", "A", true), 
			new QuizAntworten("selbstbewusste Differenz", "B", false), 
			new QuizAntworten("arroganter Quotient", "C", false),
			new QuizAntworten("hochmütiges Produkt", "D", false));


	SingleChoiceFrage qf2 = new SingleChoiceFrage("\nWessen Genesung schnell voranschreitet, der erholt sich...?", 200,
			new QuizAntworten("...hinguckends", "A", false), 
			new QuizAntworten("...anschauends", "B", false), 
			new QuizAntworten("...zusehends", "C", true),
			new QuizAntworten("...glotzends", "D", false));

	SingleChoiceFrage qf3 = new SingleChoiceFrage("\nNatürlich spielten musikalische Menschen auch im...?", 300,
			new QuizAntworten("...Westsaxo Fon", "A", false), 
			new QuizAntworten("...Nordklari Nette", "B", false), 
			new QuizAntworten("...Südpo Saune", "C", false),
			new QuizAntworten("...Ostblock Flöte", "D", true));
 
	SingleChoiceFrage qf4 = new SingleChoiceFrage("\nWobei gibt es keine geregelten Öffnungszeiten?", 500,
			new QuizAntworten("Baumärkte", "A", false), 
			new QuizAntworten("Möbelhäuser", "B", false), 
			new QuizAntworten("Teppichgeschäfte", "C", false),
			new QuizAntworten("Fensterläden", "D", true));

	SingleChoiceFrage qf5 = new SingleChoiceFrage("\nWobei gibt es keine geregelten Öffnungszeiten?", 1000,
			new QuizAntworten("Baumärkte", "A", false), 
			new QuizAntworten("Möbelhäuser", "B", false), 
			new QuizAntworten("Teppichgeschäfte", "C", false),
			new QuizAntworten("Fensterläden", "D", true));

	SingleChoiceFrage qf6 = new SingleChoiceFrage("\nWas war bereits seit Mai 1969 ein beliebtes Zahlungsmittel im europäischen Raum?", 2000,
			new QuizAntworten("Euronoten", "A", false), 
			new QuizAntworten("Eurocheques", "B", true), 
			new QuizAntworten("Euroscheine", "C", false),
			new QuizAntworten("Euromünzen", "D", false));

	SingleChoiceFrage qf7 = new SingleChoiceFrage("\nMaul Dreyer profitierte Anfang des Jahres von...?", 4000,
			new QuizAntworten("...Oettingers Sattelstange", "A", false), 
			new QuizAntworten("...Veltins Fahrradkette", "B", false), 
			new QuizAntworten("...Diebels Vorderreifen", "C", false),
			new QuizAntworten("...Becks Rücktritt", "D", true));

	SingleChoiceFrage qf8 = new SingleChoiceFrage("\nWoraus besteht in der Regel eine Entourage?", 8000,
			new QuizAntworten("Baguette & Rotwein", "A", false), 
			new QuizAntworten("Mascara & Liedschatten", "B", false), 
			new QuizAntworten("Freunde & Bekannte", "C", true),
			new QuizAntworten("Sofa & Sessel", "D", false));
/*
	@Test
	public void test() {
		
		AbstractListType list = new SinglyLinkedList();
		
		list.addFirstQuestion(qf);
		list.addFirstQuestion(qf1);
		list.addFirstQuestion(qf2);
		list.addFirstQuestion(qf3);
		list.addFirstQuestion(qf4);
		list.addFirstQuestion(qf5);
		list.addFirstQuestion(qf6);
		
		System.out.println("Anzahl der Fragen: " +list.questionCount());
		
		list.addLastQuestion(qf7);
		list.addLastQuestion(qf8);
		
		System.out.println("Anzahl der Fragen: " + list.questionCount());
		
		System.out.println("Erste Frage aus der Liste");
		System.out.println("===========================");
		System.out.println("                            ");
		list.getFirst().frageStellen();
		
		System.out.println("Letzte Frage aus der Liste");
		System.out.println("===========================");
		System.out.println("                            ");
		list.getLast().frageStellen();
		
		System.out.println("Zufällige Frage aus der Liste");
		System.out.println("===========================");
		System.out.println("                            ");
		
		int n = list.questionCount();
		
		while (!list.isEmpty()) {
			System.out.println(list.randomQuestion().getFrage());
			System.out.println("Anzahl der Fragen: " + list.questionCount());
			n--;
			assertTrue(n == list.questionCount()); 
		}
	} */
	
	/*
	@Test
	public void testIsSorted() {
		
		//neue Liste wird erstellt
		AbstractListType list = new SinglyLinkedList();
		
		//Zu testende Methode
		list.isSorted();
		
		//Leere Liste ist sortiert
		assertTrue(list.isEmpty());
		
		//Liste mit einem Element ist sortiert
		list.addFirstQuestion(qf);
		assertTrue(list.questionCount() == 1);
		
		//Liste nach dem sortrieren ist sortiert
	}*/
	
	@Test
	public void testAddSorted () {
		
		//neue Liste wird erstellt 
		AbstractListType list = new SinglyLinkedList();
		
		//list.addFirstQuestion(qf1);
		//list.addBefore(qf);
		
		
		//Zu testende Methode
		list.addSorted(qf);
		list.addSorted(qf7);
		list.addSorted(qf3);
		System.out.println(list.getFirst().getFrage());
		System.out.println(list.getLast().getFrage());
		
		//Wurden die Elemente hinzugefügt?
		assertFalse(list.isEmpty());
		
		//Werden die Strings vergliechen?
	
		
	}
}
