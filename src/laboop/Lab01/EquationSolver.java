package laboop.Lab01;
import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//lay input thong qua doi tuong s

        boolean exit = false;
        while (!exit) {//khi exit=true
            
            System.out.println("Menu :");//in ra menu
            System.out.println("1. Giai pt bac 1 ");
            System.out.println("2. Giai hpt bac 1 ");
            System.out.println("3. Giai pt bac 2 ");
            System.out.println("4. Exit");
            System.out.print(" Chon (1/2/3/4): ");//
            int choice = s.nextInt();//input cua user

            switch (choice) {//tao case
                case 1:
                    solveLinearEquation(s);//ptb1
                    break;
                case 2:
                    solveLinearSystem(s);//hptb1
                    break;
                case 3:
                    solveQuadraticEquation(s);//ptb2
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }

        s.close();//tiet kiem mem
    }

    
    private static void solveLinearEquation(Scanner scanner) {//giai pt bac 1
        System.out.print("a: ");//scna
        double a = scanner.nextDouble();//a = input
        System.out.print(" b: ");
        double b = scanner.nextDouble();//b=input

        if (a == 0) {
            System.out.println("a phai khac 0");//in loi
        } else {
            double x = -b / a;
            System.out.println("x = " + x);//in ra ket qua
        }
    }

    private static void solveLinearSystem(Scanner scanner) {// Giải hpt bac 2
        System.out.print(" a11: ");
        double a11 = scanner.nextDouble();//input a11
        System.out.print(" a12: ");
        double a12 = scanner.nextDouble();//input a12
        System.out.print(" b1: ");
        double b1 = scanner.nextDouble();//input b1
        System.out.print(" c1: ");
        double c1 = scanner.nextDouble();//input c1
        System.out.print(" a21: ");
        double a21 = scanner.nextDouble();//input a21
        System.out.print(" a22: ");
        double a22 = scanner.nextDouble();//input a22
        System.out.print(" b2: ");
        double b2 = scanner.nextDouble();//input b2
        System.out.print(" c2: ");
        double c2 = scanner.nextDouble();//input c2

        double delta = a11 * a22 - a21 * a12;//tinh 3 dinh htuc
        double delta1 = c1 * a22 - c2 * a12;
        double delta2 = a11 * c2 - a21 * c1;

        if (delta != 0) {
            double x1 = delta1 / delta;
            double x2 = delta2 / delta;
            System.out.println(" x1 = " + x1 + ", x2 = " + x2);//in kq
        } else {
            if (delta1 == 0 && delta2 == 0) {
                System.out.println("vo so nghiem.");//vo so khi d1=d=d2=0
            } else {
                System.out.println("Vo nghiem");//vo no
            }
        }
    }

    
    private static void solveQuadraticEquation(Scanner scanner) {// Giải pt bac 2
        System.out.print(" a: ");
        double a = scanner.nextDouble();//input a
        System.out.print(" b: ");
        double b = scanner.nextDouble();//input b
        System.out.print(" c: ");
        double c = scanner.nextDouble();//input c

        double denta = b * b - 4 * a * c;//delta

        if (a == 0) {
            System.out.println("a phai khac 0");//ko la ptb2
        } else if (denta > 0) {
            double x1 = (-b + Math.sqrt(denta)) / (2 * a);
            double x2 = (-b - Math.sqrt(denta)) / (2 * a);
            System.out.println(" x1 = " + x1 + ", x2 = " + x2);//in kq
        } else if (denta == 0) {
            double x = -b / (2 * a);
            System.out.println(" x = " + x);//in kq
        } else {
            System.out.println("Vo nghiem.");//in kq
        }
    }
}