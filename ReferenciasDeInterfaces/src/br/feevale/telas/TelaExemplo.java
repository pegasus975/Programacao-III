package br.feevale.telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaExemplo extends JFrame implements ActionListener {

	private int nrLinha = 70;
	private int saltoLinha = 27;
	private JComboBox<String> cbProdutos;
	private JComboBox<Produto> cbProdutosNew;
	private JLabel lbPreco;
	private JLabel lbPrecoNew;
	private JLabel lb;
	
	public TelaExemplo() {
		
		setTitle( "Tela Exemplo" );
		setBounds( 37, 75, 800, 450 );
		
		setLayout( null );
		Container container = getContentPane();
		container.setBackground( new Color( 135, 254, 2 ));
		
		JLabel l = new JLabel( "FEEVALE - Prog III" ); // 1) Criar e configurar o elemento
		l.setBounds( 0, 0, 800, 30 );					// 2) Posicionar o elemento na tela
		container.add( l );								// 3) Adicionar ao Container
		
		l.setHorizontalAlignment( JLabel.CENTER );
		Color cor = new Color( 232, 12, 79 );
		l.setBackground( cor );
		l.setOpaque( true );
		
		Font fonte = new Font( "Gungsuh", Font.BOLD, 20 );
		l.setFont( fonte );

		criaCampoCodigo( "Código", 100 );
		saltaLinha();		
		criaCampoEdicao( "Nome", 550 );
		saltaLinha();		
		criaCampoEdicao( "Endereço", 550 );
		saltaLinha();		
		criaCampoEdicao( "CEP", 120 );
		
		saltaLinha();		
		criaComboBoxProdutos();
		saltaLinha();		
		criaComboBoxProdutosNew();
		
		saltaLinha();
		criaAreaImagem();
		
		setVisible( true );
		setDefaultCloseOperation( DISPOSE_ON_CLOSE );
	}
	
	private void criaAreaImagem() {

		lb = new JLabel();
		lb.setBounds( 420, nrLinha - ( 2 * saltoLinha ), 200, 150 );
		getContentPane().add( lb );
		
		lb.setOpaque( true );
		lb.setBackground( Color.LIGHT_GRAY );
		
//		ImageIcon img = new ImageIcon( "C:/Users/0000782/Desktop/imagens/tartaruga.png" );
		ImageIcon img = new ImageIcon( getClass().getResource( "/imagens/tartaruga.png" ));
		lb.setIcon( img );
		lb.setHorizontalAlignment( JLabel.CENTER );
		
		JButton bt = new JButton( "Carregar Imagem" );
		bt.setBounds( 420, nrLinha + ( 4 * saltoLinha ), 200, 25 );
		getContentPane().add( bt );
		
		bt.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				escolheImagem();
			}
		});
	}

	private void escolheImagem() {
		
		JFileChooser fc = new JFileChooser();
		if( fc.showOpenDialog( this ) == JFileChooser.APPROVE_OPTION ) {
			
			ImageIcon img = new ImageIcon( fc.getSelectedFile().getPath() );
			lb.setIcon( img );
		}
	}

	private void criaComboBoxProdutosNew() {

		JLabel l = new JLabel( "Produto" );
		l.setBounds( 30, nrLinha, 100, 23 );
		getContentPane().add( l );
		
		cbProdutosNew = new JComboBox<>();
		cbProdutosNew.addItem( new Produto( "Teclado", 74.0 ) );
		cbProdutosNew.addItem( new Produto( "Mouse", 32.0 ) );
		cbProdutosNew.addItem( new Produto( "Monitor", 574.0 ) );
		cbProdutosNew.addItem( new Produto( "HD", 433.0 ) );
		cbProdutosNew.addItem( new Produto( "Placa Rede", 14.0 ) );
		
		cbProdutosNew.setBounds( 120, nrLinha, 200, 23 );
		getContentPane().add( cbProdutosNew );
		
		cbProdutosNew.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exibePrecoComboNew();
			}
		} );
		
		lbPrecoNew = new JLabel( "R$ 99.99" );
		lbPrecoNew.setBounds( 330, nrLinha, 120, 23 );
		getContentPane().add( lbPrecoNew );
	}
	
	private void criaComboBoxProdutos() {
		
		JLabel l = new JLabel( "Produto" );
		l.setBounds( 30, nrLinha, 100, 23 );
		getContentPane().add( l );
		
		cbProdutos = new JComboBox<>();
		cbProdutos.addItem( "Teclado" );
		cbProdutos.addItem( "Mouse" );
		cbProdutos.addItem( "Monitor" );
		cbProdutos.addItem( "HD" );
		cbProdutos.addItem( "Placa Rede" );
		
		cbProdutos.setBounds( 120, nrLinha, 200, 23 );
		getContentPane().add( cbProdutos );
		
		cbProdutos.addActionListener( this );
		
		lbPreco = new JLabel( "R$ 99.99" );
		lbPreco.setBounds( 330, nrLinha, 120, 23 );
		getContentPane().add( lbPreco );
	}

	private void criaCampoCodigo( String textoLabel, int largura ) {
		
		JLabel l = new JLabel( textoLabel );
		l.setBounds( 30, nrLinha, 100, 23 );
		getContentPane().add( l );
		
		FevasCodigoField tf = new FevasCodigoField();
		tf.setBounds( 120, nrLinha, largura, 23 );
		getContentPane().add( tf );
	}
	
	private void criaCampoEdicao( String textoLabel, int largura ) {
		
		JLabel l = new JLabel( textoLabel );
		l.setBounds( 30, nrLinha, 100, 23 );
		getContentPane().add( l );
		
		JTextField tf = new JTextField();
		tf.setBounds( 120, nrLinha, largura, 23 );
		getContentPane().add( tf );
	}
	
	private void saltaLinha() {
		nrLinha += saltoLinha;
	}

	public static void main(String[] args) {
		System.out.println("Antes");
		new TelaExemplo();
		System.out.println("Depois");
	}

	private void exibePrecoComboNew() {
	
		Produto pSel = (Produto) cbProdutosNew.getSelectedItem();
		lbPrecoNew.setText( "R$ " + pSel.getValor() );
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println( "Selecionou um produto " );
		System.out.println( ". Sel Item: " +  cbProdutos.getSelectedItem() );
		System.out.println( ". Sel Index: " +  cbProdutos.getSelectedIndex() );
		
		double vlProduto = 0;
		switch( cbProdutos.getSelectedIndex() ) {
			case 0: vlProduto = 74.00; break;
			case 1: vlProduto = 30.00; break;
			case 2: vlProduto = 583.82; break;
			case 3: vlProduto = 332.88; break;
			case 4: vlProduto = 12.99; break;
		}
		
		if( cbProdutos.getSelectedItem().equals( "Teclado" ) ) {
			vlProduto = 74.00;
		} else if( cbProdutos.getSelectedItem().equals( "Mouse" ) ) {
			vlProduto = 30;
		}
		
		lbPreco.setText( "R$ " + vlProduto );
	}
}




















