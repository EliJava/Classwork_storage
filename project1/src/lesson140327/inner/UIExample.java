package lesson140327.inner;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UIExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("UI Example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 400));
		
		JButton button = new JButton("Click me!");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("clicked!");
			}
		});
		panel.add(button);
		
		frame.add(panel);
		frame.pack();
		
		frame.setVisible(true);
		
	}
}
