package laboop.Lab01.Otherspr;
import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int[] num = {5, 12, 3, 18, 7, 15, 9};

        // su dung thu vien co san
        Arrays.sort(num);
        System.out.println("Sorted array: " + Arrays.toString(num));

        int sum = 0;
        for (int i=1;i<= num.length;++i) {
            sum += num[i-1];
        }

        double average = (double) sum / num.length;

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}