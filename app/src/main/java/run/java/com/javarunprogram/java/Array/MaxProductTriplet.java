package run.java.com.javarunprogram.java.Array;// A Java program to find a maximum product of a triplet
// in array of integers 

import java.util.Arrays;


class MaxProductTriplet {

    //if sort allowed
    static int maxProduct(int[] arr, int n) {
        // if size is less than 3, no triplet exists
        int max_product = 0;
        if (n < 3)
            return -1;
        //sort an array
        Arrays.sort(arr);

        max_product = Math.max(arr[0] * arr[1] * arr[n - 1], arr[n - 1] * arr[n - 2] * arr[n - 3]);


        return max_product;
    }

    //if sort not allowed
    static int maxProductWithOutSort(int[] arr, int n) {
        // if size is less than 3, no triplet exists
        int max_product = 0;
        if (n < 3)
            return -1;
        int min_a = Integer.MAX_VALUE;
        int min_b = Integer.MAX_VALUE;

        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > a) {
                c = b;
                b = a;
                a = arr[i];
            } else if (arr[i] > b) {
                c = b;
                b = arr[i];
            } else if (arr[i] > c) {
                c = arr[i];
            }

            if (arr[i] < min_a) {
                min_b = min_a;
                min_a = arr[i];
            } else if (arr[i] < min_b) {
                min_b = arr[i];
            }
        }

        max_product = Math.max(min_a * min_b * a, a * b * c);

        System.out.println(a + "," + b + "," + c);
        return max_product;
    }


    // Driver code
    public static void main(String[] args) {
        int[] arr = {8, 66, 7, 2, 2, 23, 23, 8};
        int n = arr.length;

        int max = maxProductWithOutSort(arr, n);

        if (max == -1)
            System.out.println("No Triplet Exists");
        else
            System.out.println("Maximum product is " + max);



    }
}


