/**
 * Make the letter H as described in the Readme.md
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
         Jeroo tom = new Jeroo(0,0,12);
  tom.hop();
  tom.turn(LEFT);
  tom.turn(LEFT);
  tom.turn(LEFT);
  tom.hop();
  tom.leaveFlower();
  tom.leaveFlower();
  tom.leaveFlower();
  tom.leaveFlower();
  tom.plant();
  tom.turn(LEFT);
  tom.turn(LEFT);
  tom.hop();
  tom.hop();
  tom.turn(LEFT);
  tom.turn(LEFT);
  tom.turn(LEFT);
  tom.hop();
  tom.leaveFlower();
  tom.leaveFlower();
  tom.plant();
  tom.turn(LEFT);
  tom.hop();
  tom.leaveFlower();
  tom.plant();
  tom.turn(LEFT);
  tom.turn(LEFT);
  tom.hop();
  tom.hop();
  tom.hop();
  tom.leaveFlower();
  tom.plant();
  tom.hop();
       Jeroo kim = new Jeroo(0, 0, EAST, 100);
    
    
    

    }

}
