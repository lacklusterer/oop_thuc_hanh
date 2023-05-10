import java.util.Arrays;
public class ArrayThings {
    public static void main(String[] args) {
        final int[] myArray1 = {7, 2, 9, 1, 5, 3, 6, 8, 4}; //array can be a constant
        System.out.println("Original array: {7, 2, 9, 1, 5, 3, 6, 8, 4}");

        Arrays.sort(myArray1);
        System.out.println("Sorted array: " + Arrays.toString(myArray1));

        double sum = 0;
        for (double i : myArray1) {
            sum += i;
        }
        System.out.println("Sum of the array: " + sum);

        double avr = sum / myArray1.length;
        System.out.println("Average of the array: " + avr);
    }
}