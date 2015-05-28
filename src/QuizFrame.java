import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.CheckboxPeer;
import java.util.ArrayList;
import java.util.function.Consumer;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class QuizFrame extends JFrame {
	//Label f�r den String aus der Frage
	JLabel frage;
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
	//Hilfsvariable
	int index = 0;
	
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
						for (JCheckBox box : checkBoxList) {
							if (box.isSelected() && antworten[i].getKorrekt()) {
								box.setForeground(Color.green); 
							} else if (box.isSelected() && (antworten[i].getKorrekt() == false)) {
								box.setForeground(Color.red);
							}
						}
					}
				}
				
		});
		
		content.add(fragenPanel, BorderLayout.NORTH);
		content.add(buttonPanel, BorderLayout.SOUTH);
		content.add(boxPanel, BorderLayout.WEST);
		
		setSize(500, 400);
		setVisible(true);
		
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