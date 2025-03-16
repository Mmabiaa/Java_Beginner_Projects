package MathsFunctions;

public class Trig30degrees {
    public static void convertor(double angle) {

        double degrees=angle;
        double radian=Math.toRadians(degrees);

        double cosValue=Math.cos(radian);
        double sinValue=Math.sin(radian);
        double tanValue=Math.tan(radian);

        System.out.println("The Trigonometric Values For 30 degrees");
        System.out.printf("cos("+degrees+")= %.4f\n",cosValue);
        System.out.printf("sin("+degrees+")= %.4f\n",sinValue);
        System.out.printf("tan("+degrees+")= %.4f\n",tanValue);

    }

    public static void main(String[] args){
        double angle = 30.0; // Setting angle to 30 degrees
        convertor(angle);
    }
}