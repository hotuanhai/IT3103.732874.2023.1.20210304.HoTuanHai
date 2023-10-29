package laboop.Lab01.Otherspr;
import java.util.Scanner;//scan input

public class Triangle {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);     //lay input thong qua doi tuong s   
        System.out.print("Enter the height of the triangle (n): ");
        int n = s.nextInt();       // scan size vao n
        s.close();
       
        for (int i = 1; i <= n; i++) {         //tao 2 for loop    
            for (int j = 1; j <= n - i; j++) { //de in tam giac theo dong
                System.out.print(" ");//space
            }                      
            for (int k = 1; k <= 2 * i - 1; k++) {//cong thuc in ra * triangle
                System.out.print("*");
            }                       
            System.out.println();//in \n
        }
    }
}