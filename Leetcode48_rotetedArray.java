
class Solution {
    public void rotate(int[][] matrix) {
        //step1: transpose of metrix 
        int n=matrix.length;
        //step2:reverse rows of metrix1
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //if we initialized j from 0
                //the swaping will happen two times beacause we use onply sigle arr
                //so we consider  
               int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       

        for(int i=0;i<n;i++){
             int l=0;
            int r=n-1;
        while(l<r){
            int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
        }
        }



        
    }
}
