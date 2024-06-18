public class solution {
    public boolean canJump(int[] nums) {
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            if (max>=nums.length-1)return true;
            if (nums[i]!=0 && nums[i]+i>max){
                max = nums[i]+i;
            }else if (i == max && nums[max] == 0){
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        solution s1 = new solution();
        System.out.println(s1.canJump(new int[]{3,2,1,0,4}));
    }
}
