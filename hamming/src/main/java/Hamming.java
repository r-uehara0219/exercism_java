public class Hamming {
    String left;
    String right;

    public Hamming(String leftStrand, String rightStrand) {
        left = leftStrand;
        right = rightStrand;
        if (left.length() == right.length()) {
            getHammingDistance();
            return;
        }
        if (left.isEmpty()) throw new IllegalArgumentException("left strand must not be empty.");
        if (right.isEmpty()) throw new IllegalArgumentException("right strand must not be empty.");
        if (left.length() != right.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    public int getHammingDistance() {
        int count = 0;
        for (int i = 0; i < left.length(); ++i){
            if (left.charAt(i) != right.charAt(i)) ++count;
        }
        return count;
    }
}
