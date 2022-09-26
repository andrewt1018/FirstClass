import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table:");
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++){
            arr[0][i] = i;
        }
        for (int j = 0; j < 10; j++) {
            arr[j][0] = j;
        }
        for (int j = 1; j < 10; j++){
            for (int i = 1; i < 10; i++){
                arr[j][i] = arr[j][0] * arr[0][i];
                if (i == 9){
                    System.out.println(arr[j][i]);
                }
                else if (String.valueOf(arr[j][i]).length() == 1){
                    System.out.print(arr[j][i] + "  ");
                }
                else {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
