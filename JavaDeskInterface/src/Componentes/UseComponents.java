/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Fernando
 */
public class UseComponents extends JFrame {

    public int nrLinha = 27;

    public UseComponents() {
        setTitle("Tela Exemplo");
        setBounds(37, 75, 800, 450);
        setLayout(null);
        Container container = getContentPane();
        container.setBackground(new Color(255, 255, 255));
	
        createTextField("Nome", 0);
        pulaLinha();
        createTextField("Sobrenome", 10);
        
        
        setVisible( true );
	setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

    public void createTextField(String nomeL, int tam) {
        JLabel lb = new JLabel(nomeL);
        lb.setBounds(10, nrLinha, 70, 27);
        getContentPane().add(lb);

        FCampoTexto ct = new FCampoTexto(tam);
        ct.setBounds(80, nrLinha, 200, 27);
        getContentPane().add(ct);
    }
    public void pulaLinha(){
        nrLinha+=nrLinha;
    }

    public static void main(String[] args) {
        new UseComponents();
    }

}
