/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotortugabono;
import ch.aplu.turtle.Turtle;
/**
 *
 * @author Juanes
 */
public class TorsoPerro extends Thread{
    private Turtle tor;

    public TorsoPerro(Turtle tor) {
        this.tor = tor;
    }
    
    @Override
    public void run() {
        this.tor.right(20);
        this.tor.forward(83.81527307);
        this.tor.right(140);
        this.tor.forward(83.81527307);
        this.tor.right(110);
        this.tor.forward(57);
        this.tor.right(110);
        this.tor.forward(5);
        this.tor.left(70);
        this.tor.forward(57*(4.0/5.0)-4);
        this.tor.right(110);
        this.tor.forward(83.81527307*(4.0/5.0)-5.7);
        this.tor.left(40);
        this.tor.penUp();
        this.tor.forward(83.81527307 - ((83.81527307*(4.0/5.0))-5.7) - 5);
        this.tor.right(140);
        this.tor.forward(83.81527307 - ((83.81527307*(4.0/5.0))-5.7) - 5);
        this.tor.left(40);
        this.tor.penDown();
        this.tor.forward(83.81527307*(4.0/5.0)-5.7);
        this.tor.right(110);
        this.tor.forward(57*(4.0/5.0)-4);
        this.tor.penUp();
        
        this.tor.hideTurtle();
    }
}
