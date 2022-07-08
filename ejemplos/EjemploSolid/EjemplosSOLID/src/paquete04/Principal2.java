/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Carlos Morocho - PC
 */
public class Principal2 {
    public static void main(String[] args) {
        ArrayList<Transporte> lista = new ArrayList<>();
        boolean bandera = true;
        Scanner sc = new Scanner(System.in);
        String cadena = "--------------------------\n";
        
        while(bandera) {
            System.out.println("\n1) INGRESAR TRASPORTE BUS");
            System.out.println("2) INGRESAR TRASPORTE TAXI");
            System.out.println("3) INGRESAR TRASPORTE AEREO");
            System.out.println("4) INGRESAR TRASPORTE MARITIMO");
            System.out.print("¿Qué tipo de Trasnporte desea Ingresar?: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 1) {
                TransporteBus tB = new TransporteBus();
                tB.establecerTarifa();
                lista.add(tB);
                cadena = String.format("%s%s"
                        + "--------------------------\n",
                    cadena,
                    tB);
            } else if (opcion == 2) {
                TransporteTaxi tT = new TransporteTaxi();
                tT.establecerTarifa();
                lista.add(tT);
                cadena = String.format("%s%s"
                        + "--------------------------\n",
                    cadena,
                    tT);
            } else if (opcion == 3) {
                TransporteAereo tA = new TransporteAereo();
                tA.establecerTarifa();
                lista.add(tA);
                cadena = String.format("%s%s"
                        + "--------------------------\n",
                    cadena,
                    tA);
            } else if (opcion == 4) {
                TransporteMaritimo tM = new TransporteMaritimo();
                tM.establecerTarifa();
                lista.add(tM);
                cadena = String.format("%s%s"
                        + "--------------------------\n",
                    cadena,
                    tM);
            } else {
                System.out.println("OPCION FUERA DE RANGO!!!");
            }
            
            System.out.print("\n¡SI NO DESEA SEGUIR INGRESANDO DATOS PRESIONE X!: ");
            String salir = sc.nextLine().toUpperCase();
            
            if (salir.equals("X")) {
                bandera = false;
            }
        }
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(lista);
        tipos.establecerPromedioTarifas();
        
        System.out.printf("%sPROMEDIO DE TARIFAS: %.2f\n",
                cadena,
                tipos.obtenerPromedioTarifas());

    }
}
