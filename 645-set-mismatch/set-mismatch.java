import java.util.Arrays;

class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int duplicate = 0;
        int missing = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                duplicate = nums[i];
            }
            else if (nums[i + 1] - nums[i] > 1) {
                missing = nums[i] + 1;
            }
        }

        if (nums[0] != 1) {
            missing = 1;
        }
        else if (missing == 0) {
            missing = nums.length;
        }

        return new int[]{duplicate, missing};
    }
}