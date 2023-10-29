package laboop.Lab01;
import java.util.Scanner;
public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//lay input thong qua doi tuong s

        System.out.println("1st num: ");//in ra
        String strNum1 = s.nextLine();//scan vao strnum1
        double a = Double.parseDouble(strNum1);//chuyen string sang double

        System.out.println("2nd num: ");//in ra
        String strNum2 = s.nextLine();//scan vao strnum2
        double b = Double.parseDouble(strNum2);//chuyen string sang double

        double sum = a + b;//tong
        double difference = a - b;//hieu
        double product = a * b;//tich
        double quotient = 0.0; 		//thuong	

        if (b != 0) {
            quotient = a / b;//xet loi chia 0
        } else {
            System.out.println("Error: cant divide by 0");//in
        }

        System.out.println("Sum: " + sum);//in tong
        System.out.println("Difference: " + difference);//in hieu
        System.out.println("Product: " + product);//in tich

        if (b!= 0) {
            System.out.println("Quotient: " + quotient);//in thuong
        }

        s.close();//de tiet kiem bo nho
	}

}