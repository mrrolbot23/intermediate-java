package Exam1;

import java.util.Arrays;

public class Main {
    public static void sort(int[] arr, int start, int end){
        if (start >= end)
            return ;

        int mid = start + (end-start)/2 ;

        sort(arr,start,mid);
        sort(arr,mid+1,end);
        merge(arr,start,end);


    }
    public static void merge(int[] data, int start, int end) {

        int[] temp = new int[end-start +1];

        int mid = start+(end - start) /2;




        int i = start, j = mid + 1, k = 0;

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

        while (i <= mid) {
            temp[k] = data[i];
            k++;
            i++;
        }


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

        int[] arr = {3, 10, 2, 5, 15, 12, 17, 20, 18};

        sort(arr,0, arr.length-1);

        System.out.println(Arrays.toString(arr));

    }
}
