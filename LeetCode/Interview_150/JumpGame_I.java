public class JumpGame_I {
    public boolean canJump(int[] nums) {
        int Jdist=0;
        for(int i=0;i<nums.length;i++)
        {
           if(i>Jdist)
           {
            return false;
           }

           Jdist=Math.max(Jdist,i+nums[i]);
           if(Jdist>=nums.length-1)
           {
            return true;
           }
        }
        return false;
    }
}
