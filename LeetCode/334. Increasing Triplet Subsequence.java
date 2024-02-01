class Solution {
    public boolean increasingTriplet(int[] nums) {

        int a =Integer.MAX_VALUE;
        // int m = nums[0];
        int b = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=a){
                a = nums[i];
            }else if(nums[i]<=b){
                b = nums[i];
            }else{
                return true;
            }
        }
        
        return false;
        
    }
}