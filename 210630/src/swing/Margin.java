package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyAction implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
//		String[] str = e.paramString().trim().split(",");
//		String name = str[1].substring(4);
		String name = e.getActionCommand();
		
		switch(name) {
		case "LEFT": 
			break;
		case "CENTER":
			Margin.north.setLayout(new FlowLayout(FlowLayout.CENTER));
			break;
		case "RIGHT": 
			break;
		case "HGap++": 
			break;
		case "HGap--": 
			break;
		}
	}
	
}

public class Margin extends JFrame{
	static JPanel north = new JPanel();
	static JButton button1 = new JButton("Button1");
	static JButton button2 = new JButton("Button2");
	static JButton button3 = new JButton("Button3");

	static JPanel south = new JPanel();
	static JButton btnLeft = new JButton("LEFT");
	static JButton btnCenter = new JButton("CENTER");
	static JButton btnRight = new JButton("RIGHT");
	static JButton hGapPlus = new JButton("HGap++");
	static JButton hGapMinus = new JButton("HGap--");
	
	
	public Margin() {
		north.add(button1);
		north.add(button2);
		north.add(button3);
		
		south.add(btnLeft);
		south.add(btnCenter);
		south.add(btnRight);
		south.add(hGapPlus);
		south.add(hGapMinus);
		
		
		
		add(north, "North");
		add(south, "South");

		btnLeft.addActionListener( new MyAction() );
		btnCenter.addActionListener( new MyAction() );
		btnRight.addActionListener( new MyAction() );
		hGapPlus.addActionListener( new MyAction() );
		hGapMinus.addActionListener( new MyAction() );
		
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Margin();
	}

}
