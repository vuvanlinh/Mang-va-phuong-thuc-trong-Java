import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the frist array ");
        int fristLength = sc.nextInt();
        System.out.print("Enter the length of the second array ");
        int secLength = sc.nextInt();
        int[] fristArr = new int[fristLength];
        int[] secArr = new int[secLength];
        for (int i = 0; i < fristArr.length; i++) {
            System.out.print("Enter the number at position " + i + " of frist array ");
            int input = sc.nextInt();
            fristArr[i] = input;
        }
        for (int j = 0; j < secArr.length; j++) {
            System.out.print("Enter the number at position " + j + " of second array ");
            int input = sc.nextInt();
            secArr[j] = input;
        }
        System.out.print("The result after join 2 arrays: " + Arrays.toString(joinArrays(fristArr,secArr)));
    }

    public static int[] joinArrays(int[] firstArr, int[] secondArr) {

        List<Integer> merged = new ArrayList<>();

        for (int i = 0; i < firstArr.length; i++) {
            merged.add(firstArr[i]);
        }

        for (int i = 0; i < secondArr.length; i++) {
            merged.add(secondArr[i]);
        }

        int[] result = new int[merged.size()];
        for (int i = 0; i < merged.size(); i++) {
            result[i] = merged.get(i);
        }
        return result;
    }
}
