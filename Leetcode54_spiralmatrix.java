class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int sri=0;
        int eri=m-1;
        int sci=0;
        int eci=n-1;
        while(sri<=eri && sci<=eci){
            //row wise left to right
            for(int i=sci;i<=eci;i++){
                res.add(matrix[sri][i]);
            }
            sri++;
            
            //valid ending row starting row <= ending row

            //col wise top to bottom
            for(int i=sri;i<=eri;i++){
                res.add(matrix[i][eci]);
            }
            eci--;
            //valid starting col he ki nhi
            //rowwise right to left
            if(sri<=eri){
                for(int i=eci;i>=sci;i--){
                res.add(matrix[eri][i]);
            }
            eri--;
            }



            //col wise bottom to top
            if(sci<=eci){
                for(int i=eri;i>=sri;i--){
                res.add(matrix[i][sci]);
            }
            sci++;
            }

        }
        return res;
    }
}
