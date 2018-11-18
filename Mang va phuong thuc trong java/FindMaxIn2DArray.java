import java.util.Scanner;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of rows");
        int Rows = scan.nextInt();
        System.out.println("Enter a number of collums");
        int Cols = scan.nextInt();
        int[][] matrix = new int[Rows][Cols];
        enterData(scan,matrix,Rows,Cols);
        System.out.println("Maximum is: " + findMax(matrix,Rows,Cols));
    }
    public static void enterData(Scanner scan,int[][] matrix,int Rows,int Cols){
        System.out.println("Enter Matrix Data");
        for(int i = 0;i < Rows; i++){
            System.out.println("Row " + i);
            for (int j = 0; j < Cols; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
    }
    public static int findMax(int[][] matrix, int Rows, int Cols){
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
}
