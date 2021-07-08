package dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NextFrame extends JFrame {
	private JDialog dialog;
	
	public NextFrame() {
		dialog = new JDialog();
		dialog.setSize(300, 300);
		
		JPanel pnl = new JPanel();
		JButton btn = new JButton("버튼");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		pnl.add(btn);
		add(pnl);
		
		addComponentListener(new ComponentAdapter() {
			
			@Override
			public void componentMoved(ComponentEvent e) {
				// 컴포넌트가 움직일 때, 다이얼 로그 창도 같이 움직이도록 하는것.
				int x = NextFrame.this.getX() + NextFrame.this.getWidth();
				int y = NextFrame.this.getY();
				
				dialog.setLocation(x, y);
			}
			
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NextFrame();
	}
}
