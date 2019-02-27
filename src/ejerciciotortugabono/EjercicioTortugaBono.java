/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotortugabono;

import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;
import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author Estudiante
 */
public class EjercicioTortugaBono extends TurtleFrame{
    Turtle tortuga1 = null;
    Turtle tortuga2 = null;
    Turtle tortuga3 = null;
    Turtle tortuga4 = null;
    Turtle tortuga5 = null;
    
    public EjercicioTortugaBono() {
      tortuga1 = new Turtle(this);
      tortuga1.setColor(Color.RED);
      tortuga1.setPos(20,0);
      tortuga2 = new Turtle(this);
      tortuga2.setPos(20,0);
      tortuga3 = new Turtle(this);
      tortuga3.setColor(Color.yellow);
      tortuga3.setPos(-32, -60);
      tortuga4 = new Turtle(this);
      tortuga4.setPos(-89, -60);
      tortuga5 = new Turtle(this);
      tortuga5.setColor(Color.yellow);
      tortuga5.setPos(-60, 20);
    }
    
    public void iniciar(){
       InteriorPez hilo1 = new InteriorPez(tortuga1);
       hilo1.start();
       
       ExteriorPez hilo2 = new ExteriorPez(tortuga2);
       hilo2.start();
       
       Tortuga2 hilo3 = new Tortuga2(tortuga3);
       hilo3.start();
       
       Triangulo hilo4 = new Triangulo(tortuga4);
       hilo4.start();
       
       PintarRectangulo rect1 = new PintarRectangulo(tortuga5, 20, 20);
       tortuga5.setPos(-60, 20);
       rect1.start();
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();  
    }
}
