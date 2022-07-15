/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Tarjeta tj = new Tarjeta("Banco Pichincha", 19000);
        MayorEdad representante = new MayorEdad("José", tj);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s\n"
                + "-------------------------------\n"
                + "TARJETA\n"
                + "%s",
                menor.obtenerNombre(), 
                tj);
        
    }
}
