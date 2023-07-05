package com.example.dsa.RainWater;

public class ArrayApproch {
    public static void main(String[] args)
    {
        //int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        //int[] arr = { 3,0,2,0, 4};
        int[] arr = { 4,2,5,7,4,2,3,6,8,2,3};

        int n = arr.length;

        //System.out.print(maxWater(arr, n));

        System.out.print(maxWater_2ptr(arr, n));


    }

    static int maxWater_2ptr(int[] arr, int n)
    {

        // Indices to traverse the array
        int left = 0;
        int right = n - 1;

        // To store Left max and right max
        // for two pointers left and right
        int l_max = 0;
        int r_max = 0;

        // To store the total amount
        // of rain water trapped
        int result = 0;
        while (left <= right) {

            // We need check for minimum of left
            // and right max for each element
            if (r_max <= l_max) {

                // Add the difference between
                // current value and right max at index r
                result += Math.max(0, r_max - arr[right]);

                // Update right max
                r_max = Math.max(r_max, arr[right]);

                // Update right pointer
                right -= 1;
            }
            else {

                // Add the difference between
                // current value and left max at index l
                result += Math.max(0, l_max - arr[left]);

                // Update left max
                l_max = Math.max(l_max, arr[left]);

                // Update left pointer
                left += 1;
            }
        }
        return result;
    }

    public static int maxWater(int[] arr, int n)
    {

        // To store the maximum water
        // that can be stored
        int res = 0;

        // For every element of the array
        // except first and last element
        for (int i = 1; i < n - 1; i++) {

            // Find maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            // Find maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            // Update maximum water value
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
}
