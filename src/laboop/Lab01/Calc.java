
package laboop.Lab01;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.println("1st num: ");
        String strNum1 = s.nextLine();
        double a = Double.parseDouble(strNum1);

        System.out.println("2nd num: ");
        String strNum2 = s.nextLine();
        double b = Double.parseDouble(strNum2);

        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = 0.0; 			

        if (b != 0) {
            quotient = a / b;
        } else {
            System.out.println("Error: cant divide by 0");
        }

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (b!= 0) {
            System.out.println("Quotient: " + quotient);
        }

        s.close();//de tiet kiem bo nho
	}

}