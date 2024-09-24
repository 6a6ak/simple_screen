import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {
        // Create a new JFrame object
        JFrame frame = new JFrame("Simple GUI");

        // Set the size of the frame (300x600)
        frame.setSize(300, 600);

        // Set default close operation to exit the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
//test