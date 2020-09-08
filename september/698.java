class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        // if (k == 0) return false;
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if ((sum % k) != 0) return false;
        int target = sum / k;
        boolean[] used = new boolean[nums.length];
        return find(nums, nums.length - 1, target, used, 0, k);
    }
    public boolean find(int[] nums, int end, int target, boolean[] used, int cursum, int k) {
        if (k == 0) return true;
        if (cursum == target) {
            return find(nums, nums.length - 1, target, used, 0, k - 1);
        }
        if (cursum > target) return false;
        for (int i = end; i >= 0; i--) {
            if (nums[i] > target) return false;
            if (used[i]) continue;
            used[i] = true;
            if (find(nums, i - 1, target, used, cursum + nums[i], k)) {
                return true;
            } else {
                used[i] = false;
            }

        }
        return false;
    }
}
