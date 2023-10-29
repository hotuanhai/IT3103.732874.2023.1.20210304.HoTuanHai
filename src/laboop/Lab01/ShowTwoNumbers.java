package laboop.Lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;//tao 2 string
		String strNotification = "You have just entered: ";//tao string de in
		
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);//in ra hop thoai lay num1
		strNotification += strNum1 + " and ";//noi xau
		
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);//in ra hop thoai lay num2
		strNotification += strNum2;//noi xau
		
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		//in ra ket qua
		System.exit(0);
	}
}