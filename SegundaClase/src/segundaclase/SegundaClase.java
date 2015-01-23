/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundaclase;

/**
 *
 * @author profesores
 */
public class SegundaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lobo lobo = new Lobo();
        Tigre tigre = new Tigre();
        tigre.comer();
        Hipopotamo hipopotamo = new Hipopotamo();
        

        
        Canino lobo1 = new Lobo();
        lobo1.comer();
        
        Mascota mascota = new Tigre();
        mascota.juegan();
        mascota.rompenCosas();
        
        
              
    }
    
}
