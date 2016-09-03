import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test implements ActionListener {
	JButton BLUEb;
	JButton REDb;
	JButton YELLOWb;
	JButton GREENb;
	JFrame f1;
	JPanel p1;

	public static void main(String[] args) {
		Test m = new Test();
	}

	Test() {
		BLUEb = new JButton();
		REDb = new JButton();
		YELLOWb = new JButton();
		GREENb = new JButton();
		f1 = new JFrame();
		p1 = new JPanel();
		f1.add(p1);
		p1.add(BLUEb);
		p1.add(REDb);
		p1.add(YELLOWb);
		p1.add(GREENb);
		f1.pack();
		f1.setVisible(true);
		BLUEb.setBackground(Color.BLUE);
		BLUEb.setOpaque(true);
		REDb.setBackground(Color.RED);
		REDb.setOpaque(true);
		GREENb.setBackground(Color.GREEN);
		GREENb.setOpaque(true);
		YELLOWb.setBackground(Color.YELLOW);
		YELLOWb.setOpaque(true);
		REDb.addActionListener(this);
		GREENb.addActionListener(this);
		YELLOWb.addActionListener(this);
		BLUEb.addActionListener(this);
	}

		void speak(String words) {
			try {
				  Runtime.getRuntime().exec("say " + words);
			} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == REDb){
			speak("This is the color Red");
		}
		if(e.getSource() == GREENb){
			speak("This is the color Green");
		}
		if(e.getSource() == BLUEb){
			speak("This is the color Blue");
		}
		if(e.getSource() == YELLOWb){
			speak("This is the color Yellow");
		}
	}
}