/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import static Threads.AplicaTrd.img;
import java.io.FilenameFilter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Fernando
 */
public class MyThread extends Thread{
    String thrdName;
    private ImageIcon img;
    JLabel label;
    boolean vermelho = true;
    boolean verde = false;
    boolean amarelo = false;
    private String fileName;
   /**
    * Instancia Thread recebendo o nome da mesma e a Label para troca de imagem  
    * @param nome
    * @param lb 
    */
    public MyThread (String nome, JLabel lb){
        super();
        start();
        label = lb;
    }
    @Override
    public void run() {
        System.out.println("Thread name:" + thrdName);
        try{
            vermelho = true;
            
            while (true) {
                
                if ( vermelho ){
                    Thread.sleep(5000);
                    fileName = "Verde.png" ;
                    verde = true;
                    vermelho = false;
                }
                
                else if ( verde ){
                    Thread.sleep(2500);
                    fileName = "Amarelo.png" ;
                     amarelo = true;
                     verde = false;
                }
                else if ( amarelo ){
                    Thread.sleep(1000);
                    fileName = "Vermelho.png" ;
                    vermelho = true;
                    amarelo = false;
                }
                img = new ImageIcon(getClass().getResource("/imagens/" + fileName));
                label.setIcon(img);
            }
        } 
        catch(InterruptedException exc){
            System.out.println("parou");
        }
        System.out.println("cabou");
    }
    
   
}
