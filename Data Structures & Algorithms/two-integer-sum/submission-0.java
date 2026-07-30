class Solution {
    public int[] twoSum(int[] nums, int target) {


        int a = 0;
        int b = 0;

        int kombi = 0;

        int j = 1;

        

        for (int i = 0; i < nums.length; i++){
            j = i+1;
            for (; j<nums.length;j++){
                a = nums[i];    
                b = nums[j];

                kombi = a +b;

                if (kombi == target) { 
                    return new int[] {i, j};
                }
            }
            

        }
    return new int[] {};
    }
        
    
}
