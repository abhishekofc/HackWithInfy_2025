class JumpGame2 {
    public int jump(int[] nums) {
        int jump=0;
        int curMax=0;
        int maxJump =0;
        for(int i=0 ; i<nums.length-1;i++){
            maxJump = Math.max(maxJump , i + nums[i]);
            if(i == curMax){
                jump++;
                curMax= maxJump;
            }
        }
        return jump; 
    }
    public static void main(String[] args){
        int[] nums= {2,3,1,1,4};
        System.out.print("Array representing maximum jump from each index: ");
        for(int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        JumpGame2 solution = new JumpGame2();
        int ans = solution.jump(nums);
        System.out.println("Minimum number of jumps to reach the last index: " + ans);   
    }
}