package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestBorderLayout extends JFrame {

	public TestBorderLayout() {
		add(new JButton("북"), "North");
		add(new JButton("남"), "South");
		add(new JButton("서"), "West");
		add(new JButton("동"), "East");
		add(new JButton("중앙"), BorderLayout.CENTER);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TestBorderLayout frame = new TestBorderLayout();
	}

}
