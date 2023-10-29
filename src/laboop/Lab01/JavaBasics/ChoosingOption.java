package laboop.Lab01.JavaBasics;
import javax.swing.JOptionPane;//tao dialogue
import javax.swing.JComponent;
import javax.swing.UIManager;

public class ChoosingOption{
    public static void main(String[] args) {
        String[] options = { "I do", "I don't" }; // Create custom button labels
        int option = JOptionPane.showOptionDialog(
            null,
            "Do you want to change to the first class ticket?",
            "Custom Dialog",
            JOptionPane.YES_NO_OPTION, //type
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            options, //string gom lua chon
            options[0] //string bat dau
        );    
        if (option == 0) {
            JOptionPane.showMessageDialog(null, "You've chosen: " + options[0]);// i do
        } else if (option == 1) {
            JOptionPane.showMessageDialog(null, "You've chosen: " + options[1]);// i dont
        } else {
            JOptionPane.showMessageDialog(null, "You didn't choose either option.");// ko chon
        }
        System.exit(0);
    }
}