package com.file;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

public class TestGUI {

	public static void main(String[] args) {
		try {
			javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setSize(400, 200);
		frame.setLocation(400, 400);
		frame.setLayout(new GridLayout(4, 5,10,5));
		
		//Ä£Ì¬°´Å¥
		JDialog dialog = new JDialog();
		dialog.setTitle("Ä£Ì¬¿ò");
		dialog.setSize(200, 100);
		dialog.setLocation(100, 100);
		dialog.setModal(true);
		
		JButton button1 = new JButton("7");
		JButton button2 = new JButton("8");
		JButton button3 = new JButton("9");
		JButton button4 = new JButton("/");
		JButton button5 = new JButton("sq");
		
		JButton button6 = new JButton("4");
		JButton button7 = new JButton("5");
		JButton button8 = new JButton("6");
		JButton button9 = new JButton("*");
		JButton button10 = new JButton("%");
		
		JButton button11 = new JButton("1");
		JButton button12 = new JButton("2");
		JButton button13 = new JButton("3");
		JButton button14 = new JButton("-");
		JButton button15 = new JButton("1/x");
		
		JButton button16 = new JButton("0");
		JButton button17 = new JButton("+/-");
		JButton button18= new JButton(".");
		JButton button19 = new JButton("+");
		JButton button20 = new JButton("=");
//		button.addMouseListener(new MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				dialog.setVisible(true);
//			}
//		});
//		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		frame.add(button10);
		frame.add(button11);
		frame.add(button12);
		frame.add(button13);
		frame.add(button14);
		frame.add(button15);
		frame.add(button16);
		frame.add(button17);
		frame.add(button18);
		frame.add(button19);
		frame.add(button20);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
