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
			AlignAndGap.layout.setAlignment(FlowLayout.LEFT);
			break;
		case "CENTER":
			AlignAndGap.layout.setAlignment(FlowLayout.CENTER);
			break;
		case "RIGHT": 
			AlignAndGap.layout.setAlignment(FlowLayout.RIGHT);
			break;
		case "HGap++":
			AlignAndGap.layout.setHgap(AlignAndGap.layout.getHgap() + 1);
			break;
		case "HGap--":
			AlignAndGap.layout.setHgap(AlignAndGap.layout.getHgap() - 1);
			break;
		}
		
		AlignAndGap.north.revalidate();
		AlignAndGap.north.repaint();
	}
	
}

public class AlignAndGap extends JFrame{
	static FlowLayout layout;
	static JPanel north;
	static JButton button1;
	static JButton button2;
	static JButton button3;

	static JPanel south;
	static JButton btnLeft;
	static JButton btnCenter;
	static JButton btnRight;
	static JButton hGapPlus;
	static JButton hGapMinus;
	
	
	public AlignAndGap() {
		layout = new FlowLayout();
		north = new JPanel(layout);
		button1 = new JButton("Button1");
		button2 = new JButton("Button2");
		button3 = new JButton("Button3");

		south = new JPanel();
		btnLeft = new JButton("LEFT");
		btnCenter = new JButton("CENTER");
		btnRight = new JButton("RIGHT");
		hGapPlus = new JButton("HGap++");
		hGapMinus = new JButton("HGap--");
		
		// 액션 추가
		btnLeft.addActionListener( new MyAction() );
		btnCenter.addActionListener( new MyAction() );
		btnRight.addActionListener( new MyAction() );
		hGapPlus.addActionListener( new MyAction() );
		hGapMinus.addActionListener( new MyAction() );
		
		north.add(button1);
		north.add(button2);
		north.add(button3);
		
		south.add(btnLeft);
		south.add(btnCenter);
		south.add(btnRight);
		south.add(hGapPlus);
		south.add(hGapMinus);
		
		add(north);
		add(south, "South");

		showGUI();
	}
	
	private void showGUI() {
		setSize(800, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AlignAndGap();
	}

}
