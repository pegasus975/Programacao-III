package Exemplos_Prog;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class FevasCodigoField extends JTextField implements KeyListener {
	
	public FevasCodigoField() {
		addKeyListener( this );
	}
	
	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void keyTyped(KeyEvent e) {

		char ch = e.getKeyChar();
		
		if( ch < '0' || ch > '9' ) {
			e.consume();
		}
	}}