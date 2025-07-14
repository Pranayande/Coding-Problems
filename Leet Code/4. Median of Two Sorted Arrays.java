class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n  = n1 + n2;

        int ind1 = n / 2;      
        int ind2 = ind1 - 1;    

        int count = 0;
        int i = 0, j = 0;

        int ind1el = -1;
        int ind2el = -1;

        while (i < n1 && j < n2) {
            int val;
            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }

            if (count == ind1) ind1el = val;
            if (count == ind2) ind2el = val;
            count++;
        }
        while (i < n1) {
            int val = nums1[i++];
            if (count == ind1) ind1el = val;
            if (count == ind2) ind2el = val;
            count++;
        }
        while (j < n2) {
            int val = nums2[j++];
            if (count == ind1) ind1el = val;
            if (count == ind2) ind2el = val;
            count++;
        }
        if (n % 2 == 1) {         
            return ind1el;
        }
        return (ind1el + ind2el) / 2.0;   
    }
}
