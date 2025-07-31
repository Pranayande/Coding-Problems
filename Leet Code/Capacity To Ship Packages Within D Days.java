class Solution {
    private int numOfDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;

        for (int weight : weights) {
            if (load + weight > capacity) {
                days++;
                load = weight;
            } else {
                load += weight;
            }
        }

        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight); 
            high += weight;              
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int requiredDays = numOfDays(weights, mid);

            if (requiredDays <= days) {
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return low; 
    }
}
