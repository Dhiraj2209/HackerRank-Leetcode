class Solution {
    public int searchInsert(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;
        boolean f = false;

        while(si<=ei){
            int mid = (int)((si + ei)/2);
            if(nums[mid] == target){
                f = true;
                return mid;
            }
            else if(nums[mid] < target){
                si = mid + 1;
            }
            else {
                ei = mid - 1;
            }
        }

        return si;
    }
}
