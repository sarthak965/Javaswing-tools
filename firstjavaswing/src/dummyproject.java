import java.awt.*;       // Import the AWT classes
import java.awt.event.*; // Import the AWT event handling classes

public class dummyproject {
    
  


    public static void main(String[] args) {
        // Create a new frame (window) with the title "My First AWT App"
        Frame frame = new Frame("My First AWT App");

        // Set the size of the frame
        frame.setSize(300, 200);

        // Create a new button with the text "Click Me"
        Button button = new Button("Click Me");

        // Add an ActionListener to the button to define what happens when it's clicked
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show a dialog with a message when the button is clicked
                System.out.println("Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the layout manager for the frame
        frame.setLayout(new FlowLayout());

        // Make the frame visible
        frame.setVisible(true);

        // Add a window listener to handle window closing event
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Exit the application when the window is closed
                System.exit(0);
            }
        });
    }
}


