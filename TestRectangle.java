//M. Ausaf
//2022F-BSE-007/A
//LAB TASK 2

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter length (between 0.0 and 20.0): ");
        try {
            double length = scanner.nextDouble();
            rectangle.setLength(length);
        } catch (Exception e) {
            System.out.println("Invalid input for length: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.print("Enter width (between 0.0 and 20.0): ");
        try {
            double width = scanner.nextDouble();
            rectangle.setWidth(width);
        } catch (Exception e) {
            System.out.println("Invalid input for width: " + e.getMessage());
            scanner.close();
            return;
        }

        System.out.printf("Rectangle Length: %.2f%n", rectangle.getLength());
        System.out.printf("Rectangle Width: %.2f%n", rectangle.getWidth());
        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimeter: %.2f%n", rectangle.perimeter());

        scanner.close();
    }
}
