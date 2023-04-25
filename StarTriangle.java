import java.util.Scanner;
// 1     *     4
// 2    ***    3
// 3   *****   2
// 4  *******  1
// 5 ********* 0
public class StarTriangle {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input Triangle height");
        int n = keyboard.nextInt();

        for (int i = 0; i <= n; i++) {
            String space = " ".repeat((n - (i)));
            System.out.println(space + "*".repeat(2*i+1) + space);
        }
    }
}
