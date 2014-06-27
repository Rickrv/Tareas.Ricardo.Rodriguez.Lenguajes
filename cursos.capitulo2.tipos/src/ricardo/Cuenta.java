/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ricardo;

/**
 *
 * @author Ricardo
 */
public class Cuenta {
    float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) throws SaldoNegativoException {
        if (saldo<0) throw new SaldoNegativoException();
        else this.saldo= saldo;
    }
    //private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
    public static void main (String args[]){
        try{ 
         Cuenta c= new Cuenta();
         c.setSaldo(-200);
    }catch(SaldoNegativoException e){
        System.out.println(e.getMessage());
    }
    }
}
