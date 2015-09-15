package tarefas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.xml.crypto.dsig.keyinfo.PGPData;

public class ExemploThread extends JFrame implements EventosPgB, WindowListener {
	
	private JProgressBar progressBar1;
	private JProgressBar progressBar2;
	private JProgressBar progressBar3;
	
	private MovimentaPgB mov1;
	private MovimentaPgB mov2;
	private MovimentaPgB mov3;

	private JButton botao;
	
	public ExemploThread() {
		
		setBounds( 100, 80, 500, 210 );
		setLayout( null );
		 	
		getContentPane().add( progressBar1 = criaProgressBar( 80, 700 ) );
		getContentPane().add( progressBar2 = criaProgressBar( 110, 400 ) );
		getContentPane().add( progressBar3 = criaProgressBar( 140, 500 ) );
		
		JButton btIniciar = new JButton( "Iniciar" );
		btIniciar.setBounds( 200, 40, 100, 23 );
		getContentPane().add( btIniciar );
		botao = btIniciar;

		addWindowListener( this );
		
		btIniciar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				movimenta();
			}
		});
		
		setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		setVisible( true );
		
	}
	
	private JProgressBar criaProgressBar( int linha, int vlrMaximo ) {
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds( 50, linha, 400, 20 );
		
		progressBar.setMaximum( vlrMaximo );		
		progressBar.setValue( 0 );

		return progressBar;
	}

	protected void movimenta() {

		mov1 = new MovimentaPgB( progressBar1 );
		mov1.start();

		mov2 = new MovimentaPgB( progressBar2 );
		mov2.start();

		mov3 = new MovimentaPgB( progressBar3 );
		mov3.start();
	}

	@Override
	public void sinalizaFim() {

		botao.setText( "Iniciar" );
		JOptionPane.showMessageDialog( null, "Terminei processo 1111" );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new ExemploThread();
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent arg0) {
		mov1.finaliza();
		mov2.finaliza();
		mov3.finaliza();
	}

	@Override
	public void windowClosing(WindowEvent arg0) {}

	@Override
	public void windowDeactivated(WindowEvent arg0) {}

	@Override
	public void windowDeiconified(WindowEvent arg0) {}

	@Override
	public void windowIconified(WindowEvent arg0) {}

	@Override
	public void windowOpened(WindowEvent arg0) {}
	
	
	
	
	
	
	
	
	

	
}