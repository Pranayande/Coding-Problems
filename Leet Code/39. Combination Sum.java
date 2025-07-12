import java.util.*;

public class Solution {

    public void combi(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[index] <= target) {
            ds.add(arr[index]);
            combi(index, arr, target - arr[index], ans, ds);
            ds.remove(ds.size() - 1);
        }
        combi(index + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candi, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combi(0, candi, target, ans, new ArrayList<>());
        return ans;
    }
}
