/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotortugabono;
    import ch.aplu.turtle.Turtle;
/**
 *
 * @author emlad
 */
public class Tortuga2 {
    
    private Turtle tortuga;

    public Tortuga2(Turtle tor) {
        this.tortuga = tor;
    }

    @Override
    public void run() {
        this.tortuga.penUp();
        this.tortuga.left(20);
        this.tortuga.forward(5);
        this.tortuga.right(70);
        this.tortuga.forward(16);
        this.tortuga.left(50);
        this.tortuga.penDown();
        
        this.tortuga.right(135);
        this.tortuga.forward(36.00684839*(9.0/10.0));
        this.tortuga.right(135);
        this.tortuga.forward(30*(9.0/10.0));
        this.tortuga.right(100);
        this.tortuga.forward(25.8965397*(9.0/10.0)); 
        this.tortuga.penUp();
        
        this.tortuga.left(100);
        this.tortuga.forward(80);
        this.tortuga.right(90);
        this.tortuga.penDown();
        this.tortuga.left(135);
        this.tortuga.forward(36.00684839*(9.0/10.0));
        this.tortuga.left(135);
        this.tortuga.forward(30*(9.0/10.0));
        this.tortuga.left(100);
        this.tortuga.forward(25.8965397*(9.0/10.0)); 
        this.tortuga.penUp();
        this.tortuga.right(100);
        
        System.out.println("X: " + this.tortuga.getX() + "Y: " + this.tortuga.getY());
        
        this.tortuga.forward(12.4533896);
        this.tortuga.right(90);
        this.tortuga.forward(15.0594324);
        this.tortuga.left(90);
        this.tortuga.forward(3);
        this.tortuga.right(90);
        this.tortuga.penDown();
        this.tortuga.forward(8);
        this.tortuga.left(90);
        this.tortuga.forward(20);
        this.tortuga.left(90);
        this.tortuga.forward(8);
        this.tortuga.right(90);
        this.tortuga.forward(11);
        this.tortuga.right(90);
        this.tortuga.forward(8);
        this.tortuga.left(90);
        this.tortuga.forward(20);
        this.tortuga.left(90);
        this.tortuga.forward(8);
        this.tortuga.penUp();
        this.tortuga.forward(1000);
    }   
}

