/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 * @author Fernando
 */
public class FCampoTexto extends JTextField implements MouseListener, KeyListener{
    private int tamanhoCampo; 
    Color c;
    
    public FCampoTexto(int tamanho){
        this.c = new Color(233, 233, 233);
        addKeyListener( this );
        addMouseListener(this);
        tamanhoCampo = tamanho;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(c);
        
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.white);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (tamanhoCampo > 0){
            JTextField txt = (JTextField) e.getSource();
 
            if(txt.getText().length() >= tamanhoCampo){
                e.consume();
            }            
        }
    }
    
    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
    
}