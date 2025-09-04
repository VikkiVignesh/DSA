package LeetCode.Interview_150;

//Remove Duplicates in sorted array
public class RemoveDupI {
     public int removeDuplicates(int[] nums) {
        int cnt=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]!=nums[i])
            {
                nums[cnt++]=nums[i];
            }
        }
        return cnt;
    }
}
