package JuegoHeadFirst;
/*
1.- Explique como funciona Java y porque se dice que es multiplataforma
RE:Java es un lenguaje de programacion y se basa en la programacion orientada a
objetos, tiene su propia portabilidad de Java Virtual Machine para ejecutar
los codigos de bytes, es multiplataforma porque puede ejecutar en cualquier
sistem operativo como windows, Linux, Unix, Mac en cualquier CPU.
2.- Dibuje o diagrame que significa la instrucción:
Dog b = new Dog();
Dog c = new Dog();
Clase Dog y objetos es b y c.
3.- Con respecto a la pregunta 2 y si ahora tenemos;
b = c; es una variable de una referencia.
Dog d = n new Dog(); Dog es una clase, y d es un objeto.
Cuantos objetos tenemos y cuantas referencias tenemos;
dos objetos y una referencias.
4.- Con respecto a la pregunta 3 y si ahora tenemos:
c = null;
b = null;
c y b es una variable nula. null viene de boolean,
5.- Diagrame una herencia usando UML diferente al caso planteado en los 
Materiales de Trabajo Autonomo.
                    Animal
                       |
        ---------------------------
        |         |       |       |
     Mamifero   Pez    Reptil    Ave
        |                         |
   ----------------            --------------
   |       |      |            |            |
Humano elefante perro         paloma      gaviota
                  |
           ------------------
           |       |        |
        Caniche Labrador Doberman
*/

import java.util.ArrayList;

public class JuegoPuntoCom {
  public static void main(String[] args) {
        int numeroDeAdivino = 0;
        JuegoAyudas ayuda = new JuegoAyudas();
        JuegoSimplePuntoCom elPuntoCom = new JuegoSimplePuntoCom();
                
        int numeroAleatorio = (int) (Math.random() * 5);
        ArrayList<String> ubicacion = new ArrayList<String>();
        ubicacion.add(String.valueOf(numeroAleatorio));
        ubicacion.add(String.valueOf(numeroAleatorio + 1));
        ubicacion.add(String.valueOf(numeroAleatorio + 2));
        
        elPuntoCom.setCeldasUbicacion(ubicacion);
        boolean estaVivo = true;

        while (estaVivo) {
            String adivina = ayuda.getEntradaUsuario("Entrar un Número");
            String resultado = elPuntoCom.comprobandoSuUbicacion(adivina);
            System.out.println(resultado);
            numeroDeAdivino++;
            if (resultado.equals("MUERTO")) {
                estaVivo = false;
                System.out.println("Tocaste " + numeroDeAdivino + " Adivinazas.");
            }
        }
    }
    
}
