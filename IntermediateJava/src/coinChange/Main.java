package coinChange;

import java.util.Arrays;

public class Main {

    public static int combinations(int[] arr, int m, int total) {

        int[] table = new int[total+1];

        Arrays.fill(table, 0);

        table[0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = arr[i]; j<= total; j++) {
                table[j] += table[j-arr[i]];
            }
        }
        System.out.println(Arrays.toString(table));
        return table[total];
    }
    public static void main(String[] args) {
        int[] numArr = {2,3,5};
        int m = numArr.length;
        int number = 10;
        System.out.println(combinations(numArr, m, number));
    }
}
