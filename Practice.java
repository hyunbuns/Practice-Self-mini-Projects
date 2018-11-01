import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Practice extends Applet {
	
	Image image;
	Button button;
	TextField textfield;
	Panel panel;
	Panel panel2;
	Label label;
	
	int flag = 0; //button not clicked
	
	int buttonClicked  = 0; //button click counter
	
	public void init() {
	//initialize
		add(button = new Button("Click me!!"));
		image = getImage(getDocumentBase(), "mee.jpg");
		textfield = new TextField();
		panel = new Panel();
		panel2 = new Panel();
		label = new Label("", Label.CENTER);

		Font font = new Font ("Helvatica", Font.PLAIN, 30);
		setFont(font);		
		
		Font font2 = new Font("Helvatica", Font.BOLD, 50);
		label.setFont(font2);
		
		setLayout(new BorderLayout());
		
		add("North",textfield);
		add("South", panel);
		add("Center", panel2);
		
		panel2.setLayout(new GridLayout(2,1));
		panel2.add(label);	
	
		panel.setLayout(new GridLayout(1,3));
		panel.add("Center", button);

		//ActionListener - ButtonClicked
		button.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e ) {
				flag = 1;
				repaint();
			}
		});

	
	}
	public void paint(Graphics g) {
		if(flag == 0); //button not clicked
		else { //button clicked
			label.setText("Hello, "+textfield.getText()+".");
			add(new JLabel(new ImageIcon(image),JLabel.CENTER));
		}
		
	}
}
