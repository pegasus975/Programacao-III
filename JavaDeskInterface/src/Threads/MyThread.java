/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Fernando
 */
public class MyThread  implements Runnable{
    String thrdName;
    public MyThread (String nome){
        thrdName=nome;
    }
    @Override
    public void run() {
        System.out.println("Thread name:" + thrdName);
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Cód: " + i);
                Thread.sleep(400);
            }
        } 
        catch(InterruptedException exc){
            System.out.println("parou");
        }
        System.out.println("cabou");
    }
   
}
