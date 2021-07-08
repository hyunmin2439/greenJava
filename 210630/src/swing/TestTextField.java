package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestTextField extends JFrame {

	public TestTextField() {
		JPanel pnlNorth = new JPanel();
		JLabel lblName = new JLabel("이름?");
		JTextField tfName = new JTextField(10); //10 가로 길이
		pnlNorth.add(lblName);
		pnlNorth.add(tfName);
		
		JPanel pnlSouth = new JPanel();
		JLabel lblDesc = new JLabel("설명?");
		JTextField tfDesc = new JTextField(30);
		pnlSouth.add(lblDesc);
		pnlSouth.add(tfDesc);
		
		add(pnlNorth, "North");
		add(pnlSouth, "South");
		
		setSize(500, 500); // 실행시 위, 아래가 너무 띄워져 있음
		pack(); // 크기가 딱맞게 조정해준다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TestTextField();
	}

}
