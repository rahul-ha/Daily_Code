class Solution {
    public boolean isTrionic(int[] nums) {
       int index1 = 0;
    boolean increasing1 = false;

    while (index1 < nums.length - 1 && nums[index1] < nums[index1 + 1]) {


        increasing1 = true;

        index1++;
    }

    int index2 = index1;

    boolean decreasing = false;

    while (index2 < nums.length - 1 &&nums[index2] > nums[index2 + 1]) {

            decreasing = true;

        index2++;


    }

    int index3 = index2;
    boolean increasing2 = false;

    while (index3 < nums.length - 1) {

        if (nums[index3] < nums[index3 + 1]) {
            index3++;
            increasing2 = true;
        }

       else if (nums[index3] >=nums[index3 + 1]) {
            return false;
        }
    }

    if (increasing1 && increasing2 && decreasing) return true;

    return false;

}
    }
