class Solution {

    static int LB(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = nums.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static int UB(int[] nums, int target) {
        int s = 0, e = nums.length - 1;
        int ans = nums.length;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] > target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {

        int first = LB(nums, target);
//         nums = [1,3,5]
// target = 2

// LB = 1
// UB = 1
// last = 0
int last = UB(nums, target) - 1;

        if (first > last) {
    return new int[]{-1, -1};
}

        

        return new int[]{first, last};
    }
}
