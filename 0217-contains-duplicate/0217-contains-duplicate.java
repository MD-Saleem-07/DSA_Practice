class Solution {
    // public boolean containsDuplicate(int[] nums) {
     
    //  Arrays.sort(nums);
    // int j=0;
    // for(int i=1;i<nums.length;i++)
    // {
    //     if(nums[i]==nums[j])
    //     {
    //         return true;
    //     }
    //     j++;
    // }
    // return false;

    // }

      public boolean containsDuplicate(int[] nums) {
     
        Set<Integer> set= new HashSet<>();

        for(int num : nums)
        {
            if(set.contains(num))
            {
                return true;
            }

            set.add(num);
        }
        return false;


    }
}