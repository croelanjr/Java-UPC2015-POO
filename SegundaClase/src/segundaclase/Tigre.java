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
public class Tigre extends Animal implements Mascota {
    public void comer(){
        System.out.println("comer carne");
    }

    @Override
    public void juegan() {
        System.out.println("juego");
    }

    @Override
    public void rompenCosas() {
        System.out.println("rompo");
    }
}
