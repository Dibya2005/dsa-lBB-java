class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        
        // 1. Handle edge cases to prevent IndexOutOfBounds exceptions
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
        
        // 2. Shrink search space since we already checked indices 0 and n-1
        int s = 1;
        int e = n - 2;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            // 3. We found the single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            
            // 4. Determine which half to search next based on index parity
            // If the pairs are perfectly intact on the left side:
            // - The first number of a pair will be at an EVEN index
            // - The second number of a pair will be at an ODD index
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || 
                (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                // We are on the left side of the single element, search right
                s = mid + 1;
            } else {
                // We are on the right side of the single element, search left
                e = mid - 1;
            }
        }
        
        return -1;
    }
}
