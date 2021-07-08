package cafe;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class swingCafeMenu extends JFrame implements ItemListener {
	JRadioButton americano;
	JRadioButton cafelatte;
	JRadioButton cafemoka;
	JRadioButton small;
	JRadioButton medium;
	JRadioButton large;
	JCheckBox ice;
	JCheckBox plusShot;
	JLabel	  priceLabel;
	
	public swingCafeMenu() {
		setLayout(new FlowLayout());
		
		JPanel menuPnl = new JPanel();
		menuPnl.setLayout(new BoxLayout(menuPnl, BoxLayout.Y_AXIS));
		ButtonGroup menuGroup = new ButtonGroup();
		americano = new JRadioButton("아메리카노 1500");
		cafelatte = new JRadioButton("카페라떼     2000");
		cafemoka = new JRadioButton ("카페모카     2500");
		
		JPanel sizePnl = new JPanel();
		sizePnl.setLayout(new BoxLayout(sizePnl, BoxLayout.Y_AXIS));
		ButtonGroup sizeGroup = new ButtonGroup();
		small = new JRadioButton ("small");
		medium = new JRadioButton("medium +500");
		large = new JRadioButton ("large    +1000");
		
		JPanel optionPnl = new JPanel();
		optionPnl.setLayout(new BoxLayout(optionPnl, BoxLayout.Y_AXIS));
		ice 	   = new JCheckBox("ice             +500");
		plusShot = new JCheckBox("plusShot  +500");
		priceLabel	 = new JLabel("       가격 : 0");
		
		americano.addItemListener(this);
		cafelatte.addItemListener(this);
		cafemoka.addItemListener(this);
		menuGroup.add(americano);
		menuGroup.add(cafelatte);
		menuGroup.add(cafemoka);
		menuPnl.add(americano);
		menuPnl.add(cafelatte);
		menuPnl.add(cafemoka);
		
		small.addItemListener(this);
		medium.addItemListener(this);
		large.addItemListener(this);
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		sizePnl.add(small);
		sizePnl.add(medium);
		sizePnl.add(large);
		
		ice.addItemListener(this);
		plusShot.addItemListener(this);
		optionPnl.add(ice);
		optionPnl.add(plusShot);
		optionPnl.add(priceLabel);
		
		add(menuPnl);
		add(sizePnl);
		add(optionPnl);
		
		showGUI();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int price = 0;
		if ( americano.isSelected() ) price += 1500;
		else if ( cafelatte.isSelected() ) price += 2000;
		else if ( cafemoka.isSelected() ) price += 2500;
		
		if ( medium.isSelected() ) price += 500;
		else if ( large.isSelected() ) price += 1000;
		
		if ( ice.isSelected() ) price += 500;
		if ( plusShot.isSelected() ) price += 500;
		
		priceLabel.setText("       가격 : " + price);
	}
	
	private void showGUI() {
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new swingCafeMenu();
	}

}
