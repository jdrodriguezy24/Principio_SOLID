/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principioabiertocerrado;

/**
 *
 * @author juand
 */
public class PrincipioAbiertoCerrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperHeroe superman = new SuperHeroe("Superman");
        
        superman.agregarHabilidad(new Volar());
        superman.agregarHabilidad(new SuperFuerza());
        
        SuperHeroe ironMan = new SuperHeroe("Iron Man");
        ironMan.agregarHabilidad(new Volar()); 
        ironMan.agregarHabilidad(new RayosLaser()); 
        
        superman.mostrarHabilidad();
         System.out.println("-----------------------------");
        ironMan.mostrarHabilidad();
    }
    
}
