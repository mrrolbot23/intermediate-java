package Recursion.mergeSortAmr;

public class Main {


    public static void mergeArray(int[] arr, int l, int r, int m){

        int n1 = m - l + 1 ;
        int n2 = r - m ;

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];


        for (int i = 0 ; i < n1 ; i++)
            arr1[i] = arr[l+i];

        for(int i = 0 ; i < n2 ; i++)
            arr2[i] = arr[m+1+i];

        int i = 0 ;
        int j = 0 ;
        int k = l ;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i<n1){
            arr[k] = arr1[i];
            i++ ;
            k++ ;
        }

        while (j<n2){
            arr[k] = arr2[j] ;
            j++ ;
            k++;
        }

    }

    public static void mergeSort(int[] arr, int l, int r){
        if (l >= r)
            return ;

        int m = l + (r-l)/2 ;

        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        mergeArray(arr,l,r,m);


    }


    public static void main(String[] args) {

        int[] arr = {3, 10, 2, 5, 15, 12, 17, 20, 18};

        mergeSort(arr,0,arr.length-1);

        for (int i : arr)
            System.out.println(i);


        /*
        int[] arr1 = {3, 10, 15, 20};
        int[] arr2 = { 1, 18, 30, 40, 50};

        int n1 = arr1.length ;
        int n2 = arr2.length ;

        int[] arr = new int[n1+n2];

        int i = 0 ;
        int j = 0 ;
        int k = 0 ;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }
        }
            while (i<n1){
                arr[k] = arr1[i];
                i++ ;
                k++ ;
            }

            while (j<n2){
                arr[k] = arr2[j] ;
                j++ ;
                k++;
            }

            for (int n : arr)
                System.out.println(n);

*/





    }
}
