import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // Create a new JFrame object
        JFrame frame = new JFrame("Billboard");

        // Set the size of the frame (600x300)
        frame.setSize(600, 300);

        // Set default close operation to exit the program when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int value01 = 45;

        // Create a JLabel to display some text
        JLabel label = new JLabel("text and variable  " + value01);
        label.setHorizontalAlignment(SwingConstants.LEFT); // left the text in the frame
        label.setVerticalAlignment(SwingConstants.TOP); // left the text in the frame
        label.setBorder(new EmptyBorder(40, 90, 10, 10)); // This adds 20px of padding to the left





        // Load the custom font from file
        try {
            // You can replace "path/to/your/font.ttf" with the actual path to the font file
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("path/to/your/font.ttf")).deriveFont(24f);
            label.setFont(customFont); // Apply the custom font to the label
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }

        // Add the label to the frame
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
