
//Bill Gillespie
//Action Listener

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import java.util.Random;

import java.util.ArrayList;

//lightweight
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



//java graphic app using jframe(edges,x in corner, movement)

class ActionListenerPlusFrame extends JFrame implements ActionListener{
	private int red,green,blue;
	Random myRandom = new Random();
	
	public ActionListenerPlusFrame(){
		setBounds(100,100,900,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel myButtonPanel = new JPanel();
		myButtonPanel.setLayout(new FlowLayout());
		
		JButton button1 = new JButton("Button 1");
		//this knows how to call jframe
		button1.addActionListener(this);

		
		JButton button2 = new JButton("Button 2");
		button2.addActionListener(new SeperateActionListener());
		

		
		JButton button3 = new JButton("Button 3");
		button3.addActionListener(new ActionListener() { 
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("anon :: action performed");
				button3.setText("Button 3");

			}
		});
		
		JButton button4 = new JButton("Button 4");
		button4.addActionListener(new ActionListener() { 
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("another anon  :: action performed");
				button3.setText("Switch this button text");

			}
		});
		
		myButtonPanel.add(button1);
		myButtonPanel.add(button2);
		myButtonPanel.add(button3);
		myButtonPanel.add(button4);
		
		//jframe owns the container
		//getgontnet pane is meth of cont
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(myButtonPanel, BorderLayout.SOUTH);
		
	}
		
		public void actionPerformed(ActionEvent e) {
			System.out.println("myActionListenerPlusFrame actionPerformed");
			System.out.println(e);
		}
		
		class SeperateActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SeperateActionListener");
			}
		}
		
		final public void SetRandomValues() {
			red = GetNumberBetween(0,255);
			green = GetNumberBetween(0,255);
			blue = GetNumberBetween(0,255);
					
		}
			private static Integer GetNumberBetween(int min, int max) {
			Random myRandom = new Random();
			return min + myRandom.nextInt(max-min+1);
		}

		
}

public class ActionListenerPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		ActionListenerPlusFrame myActionListenerPlusFrame = new ActionListenerPlusFrame();
		myActionListenerPlusFrame.setVisible(true);

		

	}
}
