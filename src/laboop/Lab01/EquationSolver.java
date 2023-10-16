package laboop.Lab01;
import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            
            System.out.println("Menu :");
            System.out.println("1. Giai pt bac 1 ");
            System.out.println("2. Giai hpt bac 1 ");
            System.out.println("3. Giai pt bac 2 ");
            System.out.println("4. Exit");
            System.out.print(" Chon (1/2/3/4): ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation(s);
                    break;
                case 2:
                    solveLinearSystem(s);
                    break;
                case 3:
                    solveQuadraticEquation(s);
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }

        s.close();
    }

    //giai pt bac 1
    private static void solveLinearEquation(Scanner scanner) {
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print(" b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a phai khac 0");
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }

    // Giải hpt bac 2
    private static void solveLinearSystem(Scanner scanner) {
        System.out.print(" a11: ");
        double a11 = scanner.nextDouble();
        System.out.print(" a12: ");
        double a12 = scanner.nextDouble();
        System.out.print(" b1: ");
        double b1 = scanner.nextDouble();
        System.out.print(" c1: ");
        double c1 = scanner.nextDouble();
        System.out.print(" a21: ");
        double a21 = scanner.nextDouble();
        System.out.print(" a22: ");
        double a22 = scanner.nextDouble();
        System.out.print(" b2: ");
        double b2 = scanner.nextDouble();
        System.out.print(" c2: ");
        double c2 = scanner.nextDouble();

        double delta = a11 * a22 - a21 * a12;
        double delta1 = c1 * a22 - c2 * a12;
        double delta2 = a11 * c2 - a21 * c1;

        if (delta != 0) {
            double x1 = delta1 / delta;
            double x2 = delta2 / delta;
            System.out.println(" x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (delta1 == 0 && delta2 == 0) {
                System.out.println("vo so nghiem.");
            } else {
                System.out.println("Vo nghiem");
            }
        }
    }

    // Giải pt bac 2
    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.print(" a: ");
        double a = scanner.nextDouble();
        System.out.print(" b: ");
        double b = scanner.nextDouble();
        System.out.print(" c: ");
        double c = scanner.nextDouble();

        double denta = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("a phai khac 0");
        } else if (denta > 0) {
            double x1 = (-b + Math.sqrt(denta)) / (2 * a);
            double x2 = (-b - Math.sqrt(denta)) / (2 * a);
            System.out.println(" x1 = " + x1 + ", x2 = " + x2);
        } else if (denta == 0) {
            double x = -b / (2 * a);
            System.out.println(" x = " + x);
        } else {
            System.out.println("Vo nghiem.");
        }
    }
}