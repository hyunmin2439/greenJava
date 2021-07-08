package loader;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestResource extends JFrame {
	public TestResource() {
		JPanel pnl = new JPanel();
		
		// ClassLoader 자신의 패키지부터 찾아본다.
		ClassLoader loader = this.getClass().getClassLoader(); 
//		ClassLoader loader2 = TestResource.class.getClassLoader();
		URL url = loader.getResource("insrc.png"); // 위치를 찾아내서 URL로 반환
		ImageIcon icon = new ImageIcon(url);
		JLabel lbl = new JLabel(icon);
		pnl.add(lbl);
		
				  // 자신의 패키지에 있는 것에 찾는다.
		URL url2 = TestResource.class.getResource("inpack.png"); // 이미지를 src로 빼면 인식 X
																 // 그럴땐 "/inpack.png"를하면 인식
																 // /는 root를 의미
		ImageIcon icon2 = new ImageIcon(url2);
		JLabel lbl2 = new JLabel(icon2);
		pnl.add(lbl2);
		
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestResource();
	}
}
