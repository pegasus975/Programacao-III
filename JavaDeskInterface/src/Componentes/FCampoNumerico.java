/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class FCampoNumerico extends FCampoTexto implements KeyListener{

    public FCampoNumerico(int tamanho) {
        super(tamanho);
    }
        @Override
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();
        if (ch < 0 || ch > 9){
            e.consume();
        }
                       
    }
}
