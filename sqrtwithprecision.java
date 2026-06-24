class Solution {
    public int mySqrt(int x) {
        int ans=-1;
        int l=0;
        
        int r=x;
        while(l<=r){
            int mid=l+(r-l)/2;
            long num=(long)mid*mid;
            //we can convert the num>x to mid>x/mid
            if(num>x){
                //move left
                r=mid-1;
            }
            else if(num<x){
                //move right and store the potential ans
                ans=mid;
                l=mid+1;
            }
            else{
                return mid;
            }
        }
        return ans;
        
    }
    public double squareRoot(int n, int p) {
        
        float f=1;
        double curr = -1;
        double sqrt=(double)mySqrt(n);
        for(int i=0;i<p;i++){
            f=f/10;
            for(int j=0;j<10;j++){
                 curr=sqrt+f;
                if(curr*curr<=n){
                    sqrt=curr;
                }
                else{
                    break;
                }
            }
        }
        return sqrt;
        
    }
}
