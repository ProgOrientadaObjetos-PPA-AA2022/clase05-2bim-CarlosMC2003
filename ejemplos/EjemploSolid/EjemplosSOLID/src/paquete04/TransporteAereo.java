/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class TransporteAereo extends Transporte{
    private String cooperativaAerea;
    
    public void establecerCooperativaAerea(String n){
        cooperativaAerea = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 100.00 + 0.20;
    }
    
    public String obtenerCooperativaBus(){
        return cooperativaAerea;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Transporte Aereo: %.2f\n", obtenerTarifa());
        
        return cadena;
    }
}
