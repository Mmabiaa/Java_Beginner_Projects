package Data_Structures.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        double[] multiplesOfTwo = new double[5];
        for (int i = 0; i < 5; i++) {
            multiplesOfTwo[i] = (i + 1) * 2.0;
        }
        for (double multiple : multiplesOfTwo) {
            System.out.println(multiple);
        }
    }
}
