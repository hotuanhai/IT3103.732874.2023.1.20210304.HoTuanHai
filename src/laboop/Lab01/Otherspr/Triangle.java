package laboop.Lab01.Otherspr;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);        
        System.out.print("Enter the height of the triangle (n): ");
        int n = s.nextInt();       
        s.close();
       
        for (int i = 1; i <= n; i++) {            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }                      
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }                       
            System.out.println();
        }
    }
}