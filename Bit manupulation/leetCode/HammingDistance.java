public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        return Integer.bitCount(z);
    }
}
