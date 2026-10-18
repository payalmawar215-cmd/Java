class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            boolean duplicate=false;
            for(int j=0;j<nums.length; j++){
                if(j!=i){
                if(nums[i]==nums[j]){
                    duplicate=true;
                }
                }
            } 
            if (duplicate==false){
        return nums[i]; 
     }                   
         }
    return 0;
    }
}
