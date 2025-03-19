import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: Radius: ");
        double radius = input.nextDouble();

        //Calculations with improved precision using Math.PI
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;


        //Formatted output for better readability and precision
        System.out.printf("Area: %.4f%n", area);
        System.out.printf("Circumference: %.4f%n", circumference);

        input.close();
    }
}
