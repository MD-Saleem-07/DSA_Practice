class Solution {

    public void rev(int[] nums,int start,int end)
    {
        while(start<end)
        {
           int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }

    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k % n ==0) //if k is 12 and n=6 we have to return same array
        {
            return;
        }
        k=k%n; 
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);

        
    }
}