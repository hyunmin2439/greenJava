package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		// this.getContentPane().add( new JButton("눌러") ); // panel에 추가
		this.setLayout( new FlowLayout() );
		
		add( new JButton("눌러") );
		add( new JButton("다른버튼") );
		
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE); // this. 해서 적고 지우는게 편할 듯, 아님 붙여놓거나
		setVisible(true);
	}
}
