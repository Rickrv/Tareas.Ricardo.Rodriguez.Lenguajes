/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursos.capitulo2.tipos;

/**
 *
 * @author Ricardo
 */
public class MiThredsillo implements Runnable {
    
    public static void main (String algo[]){
        
        Runnable r = new MiThredsillo();
        Thread t1=new Thread (r);
        Thread t2=new Thread (r);
        Thread t3=new Thread (r);
        t1.start();
        t2.start();
        t3.start();
    }
    public void run(){
        System.out.println("Soy feliz adentro del run ");
    }
    
}
