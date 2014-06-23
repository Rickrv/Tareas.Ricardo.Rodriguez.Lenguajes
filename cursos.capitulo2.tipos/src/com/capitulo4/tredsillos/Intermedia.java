/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo4.tredsillos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ricardo
 */
public class Intermedia implements Runnable {
    
    public static void main (String args[]){
        //Paso 1 crear el thread
        Runnable r = new Intermedia();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        t1.setName("impresion");
        t2.setName("conexion");
        t3.setName("guardar");
        
    }

    @Override
    public void run() {
        try {
        if(Thread.currentThread().getName().equals("conexion"))Thread.sleep(2000);
        if(Thread.currentThread().getName().equals("guardar"))Thread.sleep(4000);
        if(Thread.currentThread().getName().equals("impresion"))Thread.sleep(6000);
        System.out.println(Thread.currentThread().getName());
        }catch(Exception e){}
    

            
        
    }
    
}
