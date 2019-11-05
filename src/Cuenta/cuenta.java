/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta;

/**
 *
 * @author usuario
 */
public class cuenta {
    
    private double saldo;
    
    public cuenta(double x){
        saldo = x;
    }
    
    public  double getSaldo(){
        return saldo;
    }
    
    public  void ingresar(double x){
        saldo += x;
    }
    
    public void retirar(double x){
        saldo = saldo - x;
    }
}
