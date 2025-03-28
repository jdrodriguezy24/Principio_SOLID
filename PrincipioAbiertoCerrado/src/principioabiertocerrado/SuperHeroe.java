/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioabiertocerrado;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author juand
 */
public class SuperHeroe {
    private String nombre;
    private List<SuperHabilidad> habilidades;
    
    // Constructor
    public SuperHeroe(String nombre) {
        this.nombre = nombre;
        this.habilidades = new ArrayList<>();
    }
    
    public void agregarHabilidad(SuperHabilidad habilidad){
        habilidades.add(habilidad);
    }
    
    public void mostrarHabilidad(){
        System.out.println(nombre+ " tiene las siguientes habilidades:");
        for (SuperHabilidad habilidad: habilidades){
            habilidad.ejecutar();
        }
    }
}
