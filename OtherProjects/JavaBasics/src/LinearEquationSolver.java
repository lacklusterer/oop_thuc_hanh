import javax.swing.JOptionPane;
import java.util.Objects;

public class LinearEquationSolver {
    public static void main(String[] args) {

        String aString = "";
        boolean isValid = false;
        while (!isValid) {
            try {
                aString = JOptionPane.showInputDialog(null,
                        "ax + b = 0\nEnter the value of a:", "LinearEquationSolver",
                        JOptionPane.INFORMATION_MESSAGE);
                if (Objects.equals(aString, "0")) {
                    throw new Exception("Value of a cannot be zero!");
                }
                isValid = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(),
                        "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        String bString = JOptionPane.showInputDialog(null,
                String.format("%sx + b = 0\nEnter the value of b:", aString), "LinearEquationSolver",
                JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(aString);
        double b = Double.parseDouble(bString);
        double x = -b/a;

        String strNotification = String.format("%sx + %s = 0:\nx=%.2f", aString, bString, x);
        JOptionPane.showMessageDialog(null, strNotification,
                "Root of linear equation:",
                JOptionPane.INFORMATION_MESSAGE);
    }
}