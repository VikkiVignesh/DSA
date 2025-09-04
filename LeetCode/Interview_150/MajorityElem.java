package LeetCode.Interview_150;

import java.util.Arrays;

public class MajorityElem {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int curr=nums[0];
        int cnt=1;
        int mxcnt=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                cnt++;
            }
            else
            {
               cnt=1;
            }

            if(cnt>mxcnt)
            {
                mxcnt=cnt;
                curr=nums[i];
            }
    
        }
    return curr;
    }

    public int majorityElement1(int[] nums) {
         Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
