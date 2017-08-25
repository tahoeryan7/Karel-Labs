package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnLeft();
        moveTwice();
        turnRight();
        moveTwice();
        pickUpBeeper();
        turn180();
        move();
        putDownBeepers();
        
        
        
    }
    public void moveTwice() {
        move();
        move();
    }
    public void putDownBeepers(){
        turnLeft();
        moveTwice();
        turnRight();
        move();
        putBeeper();
        turnRight();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        goHome();
        
        
    }
    
    
    
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void turn180(){
       turnLeft();
       turnLeft(); 
    }
    public void goHome(){
        turnRight();
        moveTwice();
        turnRight();
        moveTwice();
        turnRight();
        
    }
    public void pickUpBeeper(){
        pickBeeper();
        turnRight();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    
    }
}