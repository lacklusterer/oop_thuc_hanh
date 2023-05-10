package Lab01;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Input coefficients for the quadratic ax^2 + bx + c = 0");

        double aDouble;
        while (true) {
            aDouble = scanner.nextDouble();
            if (aDouble == 0) {
                System.out.println("Coefficient 'a' cannot be zero");
            } else {
                break;
            }
        }
        double bDouble = scanner.nextDouble();
        double cDouble = scanner.nextDouble();

        double disc = Math.pow(bDouble, 2) - 4 * aDouble * cDouble;

        if (disc == 0) {
            System.out.println("Equation has one solution");
        } else if (disc < 0) {
            System.out.println("Equation has no solution");
        } else {
            double x1 = (-bDouble + Math.sqrt(disc)) / 2 / aDouble;
            double x2 = (-bDouble - Math.sqrt(disc)) / 2 / aDouble;
            System.out.printf("Solution: %.2f and %.2f\n", x1, x2);
        }
    }
}