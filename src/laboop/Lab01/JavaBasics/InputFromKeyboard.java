package laboop.Lab01.JavaBasics;
import java.util.Scanner;       //scan input
public class InputFromKeyboard {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);    //lay input thong qua doi tuong k		
		System.out.println("Whats your name? ");
		String strName = k.nextLine();              //scan name
		System.out.println("How old are you? ");
		int iAge = k.nextInt();                     //scan age
		System.out.println("How tall are you? (m)");
		double dHeight = k.nextDouble();//scan height
		
		System.out.println("Mr. " + strName + ", " + iAge
				+ " years old. " + "Your height is " + dHeight + ".");//in ra kq
	}
}