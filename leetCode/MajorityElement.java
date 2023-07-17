public class MajorityElement {
    public int majorityElement(int[] nums) {
        int mg = nums[0], c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (c == 0) {
                mg = nums[i];
                c++;
            } else if (mg == nums[i])
                c++;
            else
                c--;
        }
        return mg;
    }
}
