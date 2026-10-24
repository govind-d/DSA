
import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        // Copy both arrays into one array
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }

        // Sort the combined array
        Arrays.sort(arr);

        int len = arr.length;

        // If the length is odd
        if (len % 2 != 0) {
            return arr[len / 2];
        }

        // If the length is even
        return ((double) arr[len / 2 - 1]
                + arr[len / 2]) / 2;
    }
}
