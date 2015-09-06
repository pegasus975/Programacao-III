/*
 * Prog3
 * CopyRight Rech Informática Ltda. Todos os direitos reservados.
 */
package javadeskinterface;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Descrição da classe.
 */
public class Interface extends JFrame implements ActionListener {

    int nrLinha = 10;
    private JTextField nomePes;

    public Interface() {
        setTitle("Tela Exemplo");
        setBounds(37, 75, 800, 450);

        setLayout(null);
        Container container = getContentPane();
        container.setBackground(new Color(135, 254, 2));

//        criaCampoEdicao("Nome", 150);
        nomePes = new JTextField();
        nomePes.setBounds(330, nrLinha, 120, 23);
        getContentPane().add(nomePes);
        nomePes.addMouseListener(new MouseListener() {

            @Override
            public void mousePressed(MouseEvent e) {
                nomePes.setBackground(Color.gray);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                nomePes.setBackground(Color.green);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                nomePes.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                nomePes.setBackground(Color.blue);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                nomePes.setBackground(Color.pink);
            }
        });

        pulaLinha();
        criaButton("Fodasse", 100);

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void criaButton(String textoBt, int largura) {
        JButton bt = new JButton(textoBt);
        bt.setBounds(30, nrLinha, 100, 23);
        getContentPane().add(bt);
        bt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                alteraValNome();
            }

        });

    }

    private void alteraValNome() {
        //nomePes.setText("Fernando");
        /*String toUpperCase = nomePes.getText().toUpperCase();
         nomePes.setText(toUpperCase);*/

        nomePes.setText(nomePes.getText().toUpperCase());
    }

    private void pulaLinha() {
        nrLinha += 27;
    }

    private void criaCampoEdicao(String textoLabel, int largura) {
        JLabel l = new JLabel(textoLabel);
        l.setBounds(30, nrLinha, 100, 23);
        getContentPane().add(l);

        JTextField tf = new JTextField();
        tf.setBounds(120, nrLinha, largura, 23);
        getContentPane().add(tf);
    }
    public void capitalize(String x){
        boolean up = true;
        String result = "";
        for (int i=0; i<x.length(); i++){
            //vai me dar o caractere na posicao i
            char ch = x.charAt(i);
            if (ch == ' '){
                up = true;
                result += ch;
            }else{
                if (up) {
                    ch = Character.toUpperCase(ch);
                    up = false;
                }
                result += ch;
            }
        }   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
