package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Calc extends JFrame {
	
	public Calc() {
		JPanel North = new JPanel();
		JTextField number1 = new JTextField(10);
		JTextField calc = new JTextField(5);
		JTextField number2 = new JTextField(10);
		JButton click = new JButton("click");
		
		JPanel South = new JPanel();
		JLabel str = new JLabel("결과값 : ");
		JLabel result = new JLabel("0");
		
		North.add(number1);
		North.add(calc);
		North.add(number2);
		North.add(click);
		
		
		South.add(str);
		South.add(result);
		
		add(North, "North");
		add(South, "South");
		
		click.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Integer num1 = Integer.parseInt( number1.getText() );
				Integer num2 = Integer.parseInt( number2.getText() );
				String cal = calc.getText();
				
				if(num1 != null && num2 != null && cal != null) {
					switch(cal) {
					case "+": result.setText( String.valueOf(num1 + num2) ); break;
					
					case "-": result.setText( String.valueOf(num1 - num2) ); break;
					
					case "*": result.setText( String.valueOf(num1 * num2) ); break;
					
					case "/": if(num2 != 0) result.setText( String.valueOf(num1 / num2) ); break;
					}
				}
				
			}
			
		});
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Calc();
	}

}
