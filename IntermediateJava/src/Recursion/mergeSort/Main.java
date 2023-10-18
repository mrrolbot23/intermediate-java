package Recursion.mergeSort;

import java.util.Arrays;

public class Main {

    public static void mergeSort(int[] inputArray, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(inputArray, start, mid);
            mergeSort(inputArray, mid + 1, end);
            merge(inputArray, start, mid, end);
        }
    }

    public static void merge2(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = start - mid;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[start+i];
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[mid+1+i];
        }

        int i = 0, j = 0, k = start;
    }

    public static void merge(int[] data, int start, int mid, int end) {
//        build a temp array to avoid modifying the original content
        int[] temp = new int[end-start +1];

        int i = start, j = mid + 1, k = 0;

//        while both sub-arrays have values, then tru and merge them in sorted order
        while (i <= mid && j <= end) {
            if (data[i] < data[j]) {
                temp[k] = data[i];
                i++;
                k++;
            } else {
                temp[k] = data[j];
                k++;
                j++;
            }
        }
//      Add the rest of the values from the left sub-array to the result
        while (i <= mid) {
            temp[k] = data[i];
            k++;
            i++;
        }

//      Add the rest of the values from the right sub-array to the result
        while (j <= end) {
            temp[k] = data[j];
            k++;
            j++;
        }

        for( i = start; i <= end; i++) {
            data[i] = temp[i - start];
        }
    }


    public static void main(String[] args) {

        int[] data = new int[] {-5, 20, 10, 3, 2, 0};

        mergeSort(data, 0, data.length -1);

        System.out.println(Arrays.toString(data));

    }
}
