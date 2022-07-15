/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Principal3 {
    public static void main(String[] args) {
        String nombreArchivo = "APIS.data";
        
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaAPIS();
        System.out.println(lectura);
    }
}
