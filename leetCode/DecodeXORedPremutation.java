public class DecodeXORedPremutation {
    public int[] decode(int[] encoded) {
        int n = encoded.length, xor = 0, temp = 0;
        int array[] = new int[n + 1];
        for (int i = 1; i <= n + 1; i++) {
            xor ^= i;
        }
        for (int i = 0; i < n; i += 2)
            temp ^= encoded[i];
        array[n] = temp ^ xor;
        for (int i = n - 1; i >= 0; i--) {
            array[i] = array[i + 1] ^ encoded[i];
        }
        return array;
    }
}
