public class Fragenkatalog {
	
//Anlegen der Fragen und Antwortm�glichkeiten
	
protected static SingleChoiceFrage qf = new SingleChoiceFrage("\nWenn das Wetter gut ist, wir der Bauer bestimmt den Eber, das Ferkel und..?",
            new QuizAntworten("...einen drauf machen", "A", false), 
            new QuizAntworten("...die Nacht durchzechen", "B", false),
            new QuizAntworten("...die Sau rauslassen", "C", true), 
            new QuizAntworten("...auf die Kacke hauen", "D", false), 50);

protected static SingleChoiceFrage qf1 = new SingleChoiceFrage("\nWas ist ziemlich viel?",
			new QuizAntworten("stolze Summe", "A", true), 
			new QuizAntworten("selbstbewusste Differenz", "B", false), 
			new QuizAntworten("arroganter Quotient", "C", false),
			new QuizAntworten("hochm�tiges Produkt", "D", false), 100);


protected static SingleChoiceFrage qf2 = new SingleChoiceFrage("\nWessen Genesung schnell voranschreitet, der erholt sich...?",
		new QuizAntworten("...hinguckends", "A", false), 
		new QuizAntworten("...anschauends", "B", false), 
		new QuizAntworten("...zusehends", "C", true),
		new QuizAntworten("...glotzends", "D", false), 200);

protected static SingleChoiceFrage qf3 = new SingleChoiceFrage("\nNat�rlich spielten musikalische Menschen auch im...?",
		new QuizAntworten("...Westsaxo Fon", "A", false), 
		new QuizAntworten("...Nordklari Nette", "B", false), 
		new QuizAntworten("...S�dpo Saune", "C", false),
		new QuizAntworten("...Ostblock Fl�te", "D", true), 300);
     
protected static SingleChoiceFrage qf4 = new SingleChoiceFrage("\nWobei gibt es keine geregelten �ffnungszeiten?",
		new QuizAntworten("Baum�rkte", "A", false), 
		new QuizAntworten("M�belh�user", "B", false), 
		new QuizAntworten("Teppichgesch�fte", "C", false),
		new QuizAntworten("Fensterl�den", "D", true), 500);

protected static SingleChoiceFrage qf5 = new SingleChoiceFrage("\nWobei gibt es keine geregelten �ffnungszeiten?",
		new QuizAntworten("Baum�rkte", "A", false), 
		new QuizAntworten("M�belh�user", "B", false), 
		new QuizAntworten("Teppichgesch�fte", "C", false),
		new QuizAntworten("Fensterl�den", "D", true), 1000);

protected static SingleChoiceFrage qf6 = new SingleChoiceFrage("\nWas war bereits seit Mai 1969 ein beliebtes Zahlungsmittel im europ�ischen Raum?",
		new QuizAntworten("Euronoten", "A", false), 
		new QuizAntworten("Eurocheques", "B", true), 
		new QuizAntworten("Euroscheine", "C", false),
		new QuizAntworten("Eurom�nzen", "D", false), 2000);

protected static SingleChoiceFrage qf7 = new SingleChoiceFrage("\nMaul Dreyer profitierte Anfang des Jahres von...?",
		new QuizAntworten("...Oettingers Sattelstange", "A", false), 
		new QuizAntworten("...Veltins Fahrradkette", "B", false), 
		new QuizAntworten("...Diebels Vorderreifen", "C", false),
		new QuizAntworten("...Becks R�cktritt", "D", true), 4000);

protected static SingleChoiceFrage qf8 = new SingleChoiceFrage("\nWoraus besteht in der Regel eine Entourage?",
		new QuizAntworten("Baguette & Rotwein", "A", false), 
		new QuizAntworten("Mascara & Liedschatten", "B", false), 
		new QuizAntworten("Freunde & Bekannte", "C", true),
		new QuizAntworten("Sofa & Sessel", "D", false), 4000);
}
