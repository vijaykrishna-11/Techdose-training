public class SingleNumber {
    public int singleNumber(int[] nums) {
        int out = 0;
        for (int i = 0; i < nums.length; i++)
            out ^= nums[i];
        return out;
    }
}