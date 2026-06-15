class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //step1 sum create
            sum=sum+nums[i];
            //step 2 max update
            maxi=Math.max(maxi,sum);
            //step3 sum check krta ha jo negetive nhi he
            if(sum<0){
                sum=0;
            }


        }
        return maxi;
        
    }
}
