
package laboop.Lab01.JavaBasics;
import javax.swing.JOptionPane;
import javax.swing.JComponent;
import javax.swing.UIManager;

public class ChoosingOption{
    public static void main(String[] args) {
        // Create custom button labels
        String[] options = { "I do", "I don't" }; 

        int option = JOptionPane.showOptionDialog(
            null,
            "Do you want to change to the first class ticket?",
            "Custom Dialog",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, 
            options[0] 
        );    
        if (option == 0) {
            JOptionPane.showMessageDialog(null, "You've chosen: " + options[0]);
        } else if (option == 1) {
            JOptionPane.showMessageDialog(null, "You've chosen: " + options[1]);
        } else {
            JOptionPane.showMessageDialog(null, "You didn't choose either option.");
        }

        System.exit(0);
    }
}