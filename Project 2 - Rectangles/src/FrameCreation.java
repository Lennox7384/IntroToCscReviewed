import javax.swing.JFrame;
//This class is necessary for creating an object of the Frame class to display the rectang;es in. 

//Class declaration 
public class FrameCreation {
    //Main method
    public static void main (String []args){

        //Plumbing for the display window
        JFrame frame =new JFrame(); // Constructing a new frame
        frame.setTitle("Rectangle Window");
        frame.setSize(1200, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectangleManipulation component  = new RectangleManipulation();

        frame.add(component);
        frame.setVisible(true);

    }
}

