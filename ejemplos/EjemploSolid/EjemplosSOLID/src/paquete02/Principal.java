/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        
        Persona p1 = new Persona("José", 20);
        Persona p2 = new Persona("Sebastian", 21);
        Persona p3 = new Persona("Sofia" , 22);
        
        listaPersonas.add(p1);
        listaPersonas.add(p2);
        listaPersonas.add(p3);
        
        OperacionesEstudiantes op = new OperacionesEstudiantes();
        op.establecerEstudiante(listaPersonas);
        op.establecerPromedioEdades();
        
        op.establecerPromedioCualitativo();
        System.out.println(op);
    }
}
