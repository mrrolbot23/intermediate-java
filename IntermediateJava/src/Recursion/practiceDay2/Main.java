package Recursion.practiceDay2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        int[] numArr1 = {1,3,5,7,9};
        int[] numArr2 = {2,4,6,8,10};

        int n1 = numArr1.length;
        int n2 = numArr2.length;

        int[] numArr = new int[n1+n2];

        int i = 0;

        int j = 0;

        int k = 0;

        while (i < n1 && j < n2) {
            if (numArr1[i] < numArr2[i]) {
                numArr[k] = numArr1[i];
                i++;
                k++;
            } else {
                numArr[k] = numArr2[j];
                j++;
                k++;
            }


        }
        while (i<n1) {
            numArr[k] = numArr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            numArr[k] = numArr2[j];
            j++;
            k++;
        }


        System.out.println(Arrays.toString(numArr));

    }
}
