package binarySearch;

public class Main {
    public static int binarySearch(int[] array, int number, int start, int end) {

        int mid = start + (end - start) /2;


        if (start > end) {
            return -1;
        }

        if (number == mid) {
            return mid;
        }

        if (array[mid] > number) {
            return binarySearch(array, number, start, mid - 1);
        } else {
            return binarySearch(array, number, mid +1, end);
        }

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        int x = 3;

        System.out.println(binarySearch(array, x, 0, array.length - 1));
    }
}
