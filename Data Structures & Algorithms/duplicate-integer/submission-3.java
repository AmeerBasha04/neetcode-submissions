class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Brute force approach
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j])
        //             return true;
        //     }
        // }

        // return false;

        //Better approach
        // Arrays.sort(nums);

        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1])
        //         return true;
        // }
        // return false;


        //Optimal approach
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i]))
                return true;
        }

        return false;

    }
}