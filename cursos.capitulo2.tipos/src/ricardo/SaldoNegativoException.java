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
public class SaldoNegativoException extends Exception {
    
    public SaldoNegativoException(){
        super("saldo insuficiente");
    }
    
}
