class Solution 
{
    public int[][] matrixReshape(int[][] nums, int r, int c) 
    {
        //if the array is null or the dimension is not matched, return.
        if(nums == null || r * c != nums.length * nums[0].length)
            return nums;
        
        //create an new array so we can copy the elements into the new array
        int[][] output_arr = new int[r][c];
        
        // we can use the new rows and columns to control the dimension of the array
        int new_rows = 0;
        int new_cols = 0;
        
       for(int i = 0; i < nums.length; i ++)
       {
           for(int j = 0; j < nums[0].length; j++)
           {
               output_arr[new_rows][new_cols++] = nums[i][j];
              
               
               //if new_cols = c, increase new_rows jump to next row and do the iteration again.
               if(new_cols == c)
               {
                   new_cols = 0;
                   new_rows++;
                   
               }
           }
       }
        
        return output_arr;
        
    }
}
