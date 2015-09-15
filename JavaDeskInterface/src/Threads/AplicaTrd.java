/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import Componentes.UseComponents;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Fernando
 */
public class AplicaTrd extends JFrame {

    JLabel lb = new JLabel();
    int nrLinha;
    int saltoLinha = 27;

    public AplicaTrd() {
        setTitle("Tela Exemplo");
        setBounds(37, 75, 800, 450);
        setLayout(null);
        Container container = getContentPane();
        criaAreaImagem();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void criaAreaImagem() {
        lb = new JLabel();
        lb.setBounds(420, nrLinha - (2 * saltoLinha), 200, 150);
        getContentPane().add(lb);

        lb.setOpaque(true);
        lb.setBackground(Color.LIGHT_GRAY);
        ImageIcon img = new ImageIcon("../img/VerdeLigado.png");
        lb.setIcon(img);
        lb.setHorizontalAlignment(JLabel.CENTER);
    }

    public static void main(String[] args) {
        new AplicaTrd();
        /*   MyThread mt = new MyThread("Child #1");
        Thread Thrd = new Thread(mt);
        Thrd.start();
        
        while (true) {
        try {
        Thread.sleep(500);
        } catch (InterruptedException exc) {
        System.out.println("cabo");
        }
        }*/
    }
}
