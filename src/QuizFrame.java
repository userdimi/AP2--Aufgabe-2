import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class QuizFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Label f�r den String aus der Frage
	JLabel frage;
	//Label f�r Punkteanzeige
	JLabel punkteLabel;
	//ArrayList f�r die Checkboxen
	ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();
	//Pannel f�r die Frage
	JPanel fragenPanel;
	//Pannel f�r die Buttons
	JPanel buttonPanel;
	//Pannel f�r die Checkboxen
	JPanel boxPanel;
	JPanel check;
	//Buttons
	JButton btnConfirm;
	JButton btnRandom;
	//Checkboxen
	JCheckBox box;
	//Array mit Antworten
	QuizAntworten [] antworten;
	
	
	public QuizFrame () {
		buildGui();
	}
	
	public void buildGui () {
		
		//Container f�r die Gesamtdarstellung
		Container content = getContentPane();
		
		//Pannel f�r die Frage
		fragenPanel = new JPanel(new FlowLayout());
		
		boxPanel = new JPanel();
		boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
		
		//Pannel f�r die Buttons
		buttonPanel = new JPanel(new FlowLayout());
		
		//Erstellung der Buttons
		btnConfirm = new JButton("Auswerten");
		btnRandom = new JButton("Zuf�llige Frage");
		
		//Buttons dem Button Pannel hinzuf�gen
		buttonPanel.add(btnConfirm);
		buttonPanel.add(btnRandom);
		
		//EventListener f�r die Buttons 
		btnConfirm.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < antworten.length; i++) {
					if (checkBoxList.get(i).isSelected() && antworten[i].getKorrekt())
						checkBoxList.get(i).setForeground(Color.GREEN);
					else
						checkBoxList.get(i).setForeground(Color.RED);
				}
			}		
		});
		
		btnRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				QuizApp.setZufall();
				frage.setText(QuizApp.getRandom().getFrage());
				QuizAntworten a = null;
				
				for (int i = 0; i < QuizApp.getRandom().getAntwortmoeglichkeiten().length; i++ ) {
					a = QuizApp.getRandom().getAntwortmoeglichkeiten()[i];
					checkBoxList.get(i).setText(a.getSymbol() + ": " + a.getAntwortsText());
				}	
			}
		});

		
		content.add(fragenPanel, BorderLayout.NORTH);
		content.add(buttonPanel, BorderLayout.SOUTH);
		content.add(boxPanel, BorderLayout.WEST);
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public void addFrage (QuizFragen f) {
		
		frage = new JLabel(f.getFrage());
		fragenPanel.add(frage);
		antworten = f.getAntwortmoeglichkeiten();
		
		for (QuizAntworten a : antworten) {
			check = new JPanel(new FlowLayout());
			box = new JCheckBox(a.getSymbol() + ": " + a.getAntwortsText());
			checkBoxList.add(box);
			check.add(box);
			boxPanel.add(check);
		}
		
		
		
	}

	
	
}