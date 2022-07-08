/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    // private double edadminima;
    private String promedioCualitativo;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }

        promedioEdades = suma / obtenerEstudiante().size();
    }
    
    public void establecerPromedioCualitativo() {
        if (promedioEdades >= 0 && promedioEdades <= 21) {
            promedioCualitativo = "PROMEDIO JOVENES"; 
        } else if (promedioEdades > 21) {
            promedioCualitativo = "PROMEDIO ADULTOS";
        }
    }
    
    public double obtenerPromedioEdades() {
        return promedioEdades;
    }
    
    public String obtenerPromedioCualitativo() {
        return promedioCualitativo;
    }

    @Override
    public String toString() {
        String cadena = String.format("LISTA DE PERSONAS\n");
        for (Persona e : obtenerEstudiante()) {
            cadena = String.format("%sNombre: %s\n",
                    cadena,
                    e.obtenerNombre());
        }
        
        cadena = String.format("%s\nPromedio Edades: %.2f\n"
                + "Promedio Cualitativo de las Edades es: %s\n",
                cadena,
                promedioEdades,
                promedioCualitativo);
        return cadena;
    }
}
