package swing;

public class DefaultJFrame {

	public static void main(String[] args) {
//		JFrame frame = new JFrame("제목을 넣으면 프로그램 제목 보임"); // Constructor 사용
//		frame.setSize(500, 500);
//		Dimension d = frame.getSize(); // Dimension(치수) : 가로, 세로 값 가지고 있음.
//		System.out.println(d.height);
//		System.out.println(d.width);
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		// 닫기 버튼을 눌러도 프로그램이 돌아가고 있다.
//		// 때문에 닫기버튼을 눌렀을 때 프로그램을 꺼달라고 하는 것이다.
//		frame.setLocationRelativeTo(null);
//		frame.setVisible(true); // true : 화면 보임  / false : 화면 안보임
		
		MyFrame my = new MyFrame("버튼");
	}

}
