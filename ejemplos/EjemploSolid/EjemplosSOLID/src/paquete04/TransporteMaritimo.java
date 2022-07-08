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
public class TransporteMaritimo extends Transporte{
    private String cooperativaMaritima;
    
    public void establecerCooperativaMaritima(String n){
        cooperativaMaritima = n;
    }
    
    @Override
    public void establecerTarifa(){
        tarifa = 50.00 + 0.75;
    }
    
    public String obtenerCooperativaMaritima(){
        return cooperativaMaritima;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Transporte Maritimo: %.2f\n", obtenerTarifa());
        
        return cadena;
    }
}
