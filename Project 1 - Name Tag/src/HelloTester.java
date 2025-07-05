import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.MediaTracker;
import java.net.MalformedURLException;

/**
 * This program is intended to print a box with my name in a basic manner
 * and  practise use of Swing components 
 * See READMe for some cool lessons learnt
 */


public class HelloTester {
    public static void main(String[] args) throws MalformedURLException {
        
        //Printing My Name
        System.out.println("--------------------------------------------------");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|    Hello, my name is Lennox Blair Magak        |");
        System.out.println("|                                                |");
        System.out.println("|              ghgh                              |");
        System.out.println("-------------------------------------------------|");
       

        //Childlike picture of a tree and a bush below it. 
        System.out.println("        o");
        System.out.println("      oooo");
        System.out.println("    ooooooo");
        System.out.println("    oooooooo");
        System.out.println("     ooIIo o       ooo");
        System.out.println("     o II         oooooo");
        System.out.println("  _____II_________ oooo____");

 
        /**
         * Displaying an image in a window in two ways:
         * First, we will use JFrame
         * Second we will use JOption.
         */
        SwingUtilities.invokeLater(()->{
            JFrame frame= new JFrame(); //An object of the Jframe class from Swing package
            frame.setSize(800, 600); //Measurements in Pixels
            frame.setTitle("Picture Frame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Program terminates upon exiting window
            frame.setLocationRelativeTo(null); //centres the Frame
           
            /**            
             * Setting layout manager for any components added to the frame
             * FLowLayout is simple and aligns components (like JLables) from left to right and wraps to the next line 
             * when frame's width is exceeded.
             */

            frame.setLayout(new FlowLayout( FlowLayout.LEFT,10,10));

            //Setting Background Color of the Frame
            Color frameColor= new Color(0, 29, 33, 255);
            frame.getContentPane().setBackground(frameColor);

            //Loading and scaling the image
            ImageIcon picture= new ImageIcon("img/panda.jpg");
            if (picture.getImageLoadStatus() != MediaTracker.COMPLETE)
            {
                System.err.println("Error Loading Image");
                return;
            }
            Image scaledImage = picture.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            picture = new ImageIcon(scaledImage);

            //Adding image to a JLabel
            JLabel pictureLabel= new JLabel(picture);
            frame.add(pictureLabel);

            //Image 2
            ImageIcon picture2= new ImageIcon("img/reptiles.jpg");
            if (picture2.getImageLoadStatus() != MediaTracker.COMPLETE)
            {
                System.err.println("Error Loading Image");
                return;
            }
            Image scaledImage2 = picture2.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            picture2 = new ImageIcon(scaledImage2);

            JLabel pictureLabel2= new JLabel(picture2);
            frame.add(pictureLabel2);

            //Image 3
            //I do notice copy pasting of chunks of code, I'll return to this and find a way to automate.
            // In the mean time, please suggest suitable mechanisms 
            ImageIcon picture3= new ImageIcon("img/penguins.jpg");
            if (picture3.getImageLoadStatus() != MediaTracker.COMPLETE)
            {
                System.err.println("Error Loading Image");
                return;
            }
            Image scaledImage3 = picture3.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            picture3 = new ImageIcon(scaledImage3);

            JLabel pictureLabel3= new JLabel(picture3);
            frame.add(pictureLabel3);


            /**
             * Trying to figure out how JPanel works
             */

            //Loading and scaling the image
            ImageIcon picture4= new ImageIcon("img/car1.jpg");
            if (picture4.getImageLoadStatus() != MediaTracker.COMPLETE)
            {
                System.err.println("Error Loading Image");
                return;
            }
            Image scaledImage4 = picture4.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            picture4 = new ImageIcon(scaledImage4);

            //Adding image to a JLabel
            JLabel pictureLabel4= new JLabel(picture4);
            frame.add(pictureLabel4);

            //car2
            ImageIcon picture5= new ImageIcon("img/car2.jpg");
            if (picture5.getImageLoadStatus() != MediaTracker.COMPLETE)
            {
                System.err.println("Error Loading Image");
                return;
            }
            Image scaledImage5 = picture5.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            picture5 = new ImageIcon(scaledImage5);

            JLabel pictureLabel5= new JLabel(picture5);
            frame.add(pictureLabel5);

            //car 3
            ImageIcon picture6= new ImageIcon("img/car3.jpg");
            if (picture6.getImageLoadStatus() != MediaTracker.COMPLETE)
            {
                System.err.println("Error Loading Image");
                return;
            }
            Image scaledImage6 = picture6.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            picture6 = new ImageIcon(scaledImage6);

            JLabel pictureLabel6= new JLabel(picture6);
            frame.add(pictureLabel6);


    /*        JPanel panel1= new JPanel();
            Color panel1Color= new Color(192, 188, 252);
            panel1.setBackground(panel1Color);
            panel1.add(pictureLabel4);
            panel1.add(pictureLabel5);
            panel1.add(pictureLabel6);
            frame.add(panel1);
            panel1.setLayout(new FlowLayout( FlowLayout.LEFT,10,10)); */

            frame.setVisible(true);
        });

    }

}