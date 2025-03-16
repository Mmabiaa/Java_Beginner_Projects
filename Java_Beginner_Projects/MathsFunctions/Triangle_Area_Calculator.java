package MathsFunctions;// To find area of a triangle.
import java.util.Scanner;
// Boateng Prince Agyenim - SRI.41.008.071.23
public class Triangle_Area_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the triangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = (double)0.5F * (double)length * height;
        System.out.printf("The area of the triangle is: %.2f%n", area);
        scanner.close();
    }
}
