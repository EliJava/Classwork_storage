package lesson140401.localinner;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UIExample2 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("UI Example 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 400));
		
		panel.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("clicked " + arg0.getX() + "," + arg0.getY());
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				System.out.println("entered");
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				System.out.println("exited");
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				System.out.println("pressed " + arg0.getX() + "," + arg0.getY());
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("released " + arg0.getX() + "," + arg0.getY());
				// TODO Auto-generated method stub
				
			}
			
		});
		
		panel.addMouseMotionListener(new MouseMotionListener(){

			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("dragged");
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("moved");
			}
			
		});
		
		panel.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				System.out.println("wheel " + e.getX() + "," + e.getY());
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton());
			}
		});
		frame.add(panel);
		
		frame.pack();
		
		frame.setVisible(true);
		
	}
}
