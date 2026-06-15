class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    
        List<Integer> ans = new ArrayList<>();
        //marking 
        // traverse the array when encounter +ve val print the num at the same time
        for(int i=0;i<nums.length;i++){
            int num=Math.abs(nums[i]);
            int pos=num-1;
            if (nums[pos] > 0) {
    nums[pos] = -nums[pos];
}
        }
        //tranverse to find the missing ele
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;

    
    }
}
