/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo4.tredsillos;

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
    }

    @Override
    public void run() {
        System.out.println("Soy un Thread mediano");
    }
    
}
