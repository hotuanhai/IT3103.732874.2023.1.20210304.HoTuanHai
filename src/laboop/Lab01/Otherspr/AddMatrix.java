
package laboop.Lab01.Otherspr;
public class AddMatrix {
    public static void main(String[] args) {
        int row=3,col=3;// hang cot
        int[][] arr1 = { {1, 2, 3}, {5, 6, 7},{4,8,9} };//khoi tao arr1
        int[][] arr2 = { {11, -2, 7}, {4, 16, 7},{4,1,2} };//khoi tao arr2
        for (int i = 0; i < row; ++i) {//tinh tong tung phan tu
            for(int j = 0; j < col; ++j) {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");//in theo ma tran
            }
            System.out.println();
        }
    }
}
