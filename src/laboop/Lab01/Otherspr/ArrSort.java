package laboop.Lab01.Otherspr;
import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int[] num = {5, 12, 3, 8, 7, -15, 9};// khoi tao       
        Arrays.sort(num);// su dung thu vien co san
        System.out.println("Sorted array: " + Arrays.toString(num));//noi array

        int sum = 0;
        for (int i=1;i<= num.length;++i) {//tinh tong cac phan tu
            sum += num[i-1];
        }

        double average = (double) sum / num.length;//tinh gt trung binh

        System.out.println("Sum of array elements: " + sum);//in tong
        System.out.println("Average of array elements: " + average);//in trung binh
    }
}