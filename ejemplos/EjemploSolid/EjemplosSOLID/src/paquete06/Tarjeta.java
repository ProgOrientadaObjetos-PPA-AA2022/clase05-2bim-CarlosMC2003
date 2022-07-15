/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Tarjeta {
    private String nombreBanco;
    private double cupoMax;
    
    public Tarjeta(String nombre, double cupo) {
        nombreBanco = nombre;
        cupoMax = cupo;
    }
    
    public void establecerNombre(String n) {
        nombreBanco = n;
    }
    
    public void establecerCupoMaximo(double n) {
        cupoMax = n;
    }
    
    public String obtenerNombre() {
        return nombreBanco;
    }
    
    public double obtenerCupoMaximo() {
        return cupoMax;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("NOMBRE BANCO: %s\n"
                + "CUPO MAXIMO: %.2f\n", 
                nombreBanco,
                cupoMax);
        
        return cadena;
    } 
}
