import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
/**
 * Aim:
 * Draw four small rectangles at the corners of a main large rectangle
 * Identify a rectangle that forms when two rectangles intesect the translate it.
 * 
 * @author Lennox Magak
 */

 public class RectangleManipulation extends JComponent {
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D) g; //casting

        //Box 1: Initialization
        int x1=50;
        int y1=40; 
        int w1= 250;
        int h1= 400;

        Rectangle box1= new Rectangle(x1,y1,w1,h1);
        g2.draw(box1);

        //Box 2: Initialization

        int x2 = 400;
        int y2 = 100;

        int w2 = 40;
        int h2 = 20;

        Rectangle box2 =new Rectangle (x2,y2,w2,h2);
        g2.draw(box2);

        // Box 3: Initialisation.
        int x3 = 500;
        int y3 = 225;

        int w3 = 200;
        int h3 = 300;

        Rectangle box3 =new Rectangle (x3,y3,w3,h3);
        g2.draw(box3);

        // Box 4: Initialisation.
        int x4 = 600;
        int y4 = 475;

        int w4 = 350;
        int h4 = 200;

        Rectangle box4 =new Rectangle (x4,y4,w4,h4);
        g2.draw(box4);


        /**
         * Transalting box 2 in such a way that changes in its initial values will not affect the final result
         */

        box2.translate(x1-x2, y1-y2);
        g2.draw(box2);

        box2.translate(w1-w2, 0);
        g2.draw(box2);

        box2.translate(0, h1-h2);
        g2.draw(box2);

        box2.translate(w2-w1, 0);
        g2.draw(box2);

        // Acknowledging the Intersection. And naming the new Rectangle (Box 5)
        Rectangle box5 = box4.intersection(box3);

        //Translating box 5
        int h5 = (int) box5.getHeight();
        int w5 = (int) box5.getWidth();
        box5.translate(w5, -h5);
        g2.draw(box5);

    }
   
 }
