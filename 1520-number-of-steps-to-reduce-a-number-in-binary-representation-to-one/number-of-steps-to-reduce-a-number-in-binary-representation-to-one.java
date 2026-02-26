import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {

        // Convert binary string directly to BigInteger
        BigInteger n = new BigInteger(s, 2);

        int step = 0;

        while (n.compareTo(BigInteger.ONE) > 0) {

            if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                n = n.divide(BigInteger.TWO);
            } else {
                n = n.add(BigInteger.ONE);
            }

            step++;
        }

        return step;
    }
}