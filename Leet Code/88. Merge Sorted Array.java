class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr3 = new int[m + n];
        int left = 0, right = 0, index = 0;
        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                arr3[index++] = nums1[left++];
            } else {
                arr3[index++] = nums2[right++];
            }
        }
        while (left < m) {
            arr3[index++] = nums1[left++];
        }
        while (right < n) {
            arr3[index++] = nums2[right++];
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr3[i];
        }
    }
}
