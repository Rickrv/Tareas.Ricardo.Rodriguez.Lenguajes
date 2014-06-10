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
public class CursosCapitulo2Tipos {
//static int algo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // int [] arreglo1 = new int [3];
        int [] arreglo1={-20,7,8,54};
       // System.out.println(arreglo1[0]);
        /*  //ESTE NO SE USA EN EL EXAMEN 
       for (int i=0; i<arreglo1.length ; i++){
            System.out.println(arreglo1[i]);
        }*/
        //Usar el tipo de dato que se va a iterar en este caso arreglo
        for(int x : arreglo1){
            System.out.println(x);
        }
                
        
       // System.out.println(algo);
    }
    
    
}
