package combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestCombo extends JFrame {
	public TestCombo() {
		JPanel pnl = new JPanel();
		
		String[] pets = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
		JComboBox<String> combo = new JComboBox<String>(pets);
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Object source = e.getSource();
				JComboBox<String> c = (JComboBox<String>) source;
				int index = c.getSelectedIndex();
				String selected = (String) c.getSelectedItem();
				System.out
						.println("사용자가 선택한 index: " + index + ", 해당 index 원소: " + pets[index]);
				System.out
						.println("사용자가 선택한 item: " + selected);
				System.out
						.println(combo.getItemAt(index));
			}
		});
		
		pnl.add(combo);
		
		add(pnl);
		
		showGUI();
	}
	
	private void showGUI() {
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestCombo();
	}
}
