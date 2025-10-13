package run.java.com.javarunprogram.java.Array;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain1 = {-5, 1, 5, 0, -7};
        int[] gain2 = {-4, -3, -2, -1, 4, 3, 2};

        int altitude = 0;
        int maxAltitude = 0;

        for (int g : gain1) {
            altitude += g;
            maxAltitude = Math.max(maxAltitude, altitude);
        }
        System.out.print(maxAltitude);
    }
}
