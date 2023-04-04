public class solution {
    public int removeElement(int[] nums, int val) {
        // 若是target 则依序把后面一个赋值给前一个
        int len = nums.length;
        int i = 0;
        int count = 0;
        while (i < len) {
            if (nums[i] == val) {

                int j = i;
                while (j < len - 1) {
                    nums[j] = nums[j + 1];
                    j++;
                }
                len--;

            }
            else
                i++;
        }
        return len;
    }
}
