/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadeskinterface;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author 0147477
 */
public class ImageExample extends JFrame {

    private ImageExample() {
        
        setTitle("Exemplo Imagem");
        setBounds(37, 75, 800, 450);
        setLayout(null);
       
        Container container = getContentPane();
        container.setBackground(new Color(255, 255, 255));

        JLabel lb = new JLabel("Ratao");
        lb.setBounds(10, 10, 500, 400);
        getContentPane().add(lb);
        lb.setBackground(Color.red);        

        ImageIcon img = new ImageIcon("img/aligador.jpg"); 
        lb.setIcon(img);
        JLabel imgLabel = new JLabel(new ImageIcon("img/aligador.jpg"));
        imgLabel.setBounds(10, 10, 100, 35);
        getContentPane().add(imgLabel);
        // finais                
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /*public static void main(String[] args) {
        new ImageExample();
    }*/

}
