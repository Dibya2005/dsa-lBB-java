class Solution {
    int firstoneidx(int[][] arr,int r){
    
        int col=arr[0].length;
        int ans=-1;
        if(arr[r][col-1]==0){
            return -1;
        }
        else{
            int s=0;
        int e=arr[0].length-1;
        
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[r][m]==1){
                //stotre and search in left
                ans= m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
            
        }
        return ans;
        
    }
    public int rowWithMax1s(int[][] arr) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int max=-1;
        int ans=-1;
        
        
        for(int i=0;i<n;i++){
            if(firstoneidx(arr,i)!=-1){
                int ones=m-firstoneidx(arr,i);
                
                if(max<ones){
                    max=ones;
                    ans=i;
                }
            }
        }
        return ans;
    }
};
