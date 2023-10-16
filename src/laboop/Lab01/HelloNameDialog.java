/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboop.Lab01;
import javax.swing.JOptionPane;
public class HelloNameDialog {
	public static void main(String[] args) {
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "Hello "+ result + "!");
		System.exit(0);
	}
}