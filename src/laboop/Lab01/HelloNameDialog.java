/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboop.Lab01;
import javax.swing.JOptionPane;
public class HelloNameDialog {//de tao dialogue
	public static void main(String[] args) {
		String result;//tao sring result
		result = JOptionPane.showInputDialog("Please enter your name:");//lay input vao result, ham tra ve xau dc nhap
		JOptionPane.showMessageDialog(null, "Hello "+ result + "!");//in ra
		System.exit(0);//exit khoi he thong
	}
}