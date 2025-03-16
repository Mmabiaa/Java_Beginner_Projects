package Selections_And_Loops;

public class MultiplesOfTwo {
    public static void main(String[] args) {
        int i = 1; // Counter for multiples
        while (i <= 5) {
            int multiple = 2 * i;
            System.out.println("Multiple " + i + " of 2: " + multiple);
            i++;
        }
    }
}

