class Solution {
    public boolean containsDuplicate(int[] nums) {
     
     Arrays.sort(nums);
    int j=0;
    for(int i=1;i<nums.length;i++)
    {
        if(nums[i]==nums[j])
        {
            return true;
        }
        j++;
    }
    return false;

    }
}