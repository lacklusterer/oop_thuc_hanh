import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input rows and columns, separated by space: ");
        int rows = keyboard.nextInt();
        int cols = keyboard.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        //first matrix
        System.out.println("Input the elements of the first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = keyboard.nextInt();
            }
        }

        //second matrix
        System.out.println("Input the elements of the second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = keyboard.nextInt();
            }
        }

        //add
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //print sum
        System.out.println("The sum of the matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
