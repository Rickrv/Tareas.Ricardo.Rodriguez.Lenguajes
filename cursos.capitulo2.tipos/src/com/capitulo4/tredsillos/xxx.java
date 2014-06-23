/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo4.tredsillos;

import java.util.Calendar;

/**
 *
 * @author Ricardo
 */
public class xxx implements Runnable{
    
    public static void main (String args[]){
        
        Runnable r = new xxx();
        Thread t1 = new Thread(r);
            t1.start();
    }
    public void run(){
        while(true){
            try{
                Calendar c= Calendar.getInstance();
                int hora = c.get(Calendar.HOUR);
                int minuto = c.get(Calendar.MINUTE);
         if(hora==2&&minuto==22){
             System.out.println("Ya termino la clase");
            }
         Thread.sleep(1000);
        }catch(Exception e){}
        }
    }
}
    
    
    


