package Array.Assignment;

public class Capacity_To_Ship_Packages {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int i = 0; i < weights.length; i++) {
            if (l < weights[i]) {
                l = weights[i];
            }
            r += weights[i];
        }
        while (l < r) {
            int mid = (l + r) / 2;
            int a = 0, c = 0;
            for (int i = 0; i < weights.length; i++) {
                if (c + weights[i] > mid) {
                    c = 0;
                    a++;
                }
                c += weights[i];
            }

            if (a >= days) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}
