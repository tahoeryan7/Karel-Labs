package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        
        turnLeft();
        turnLeft();
        move();
        move();
        pickBeeper();
        move();
        move();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        pickBeeper();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        pickBeeper();
        
        
        
        
        
    }
   
}

