package Lab01;

import java.util.Scanner;
// a11 a12 b1
// a21 a22 b2
public class LinearSystemSolver {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Input values for the first equation");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();

        System.out.println("Input values for the second equation");
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double detD = a11 * a22 - a21 * a12;
        if (detD == 0) {
            System.out.println("System have no solution/infinitely many solutions");
        }
        else {
            double detD1 = b1 * a22 - b2 * a12;
            double detD2 = a11 * b2 - a21 * b1;
            double x1 = detD1 / detD;
            double x2 = detD2 / detD;
            System.out.printf("Solution: %.2f and %.2f\n", x1, x2);
        }
    }
}